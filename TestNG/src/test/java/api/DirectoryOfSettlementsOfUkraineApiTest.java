package api;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.equalTo;

public class DirectoryOfSettlementsOfUkraineApiTest extends BaseApiTest {
    Map<String, Object> bodyRequest = new HashMap<>();

    @BeforeMethod
    public void setBodyRequest() {
        String API_key = "4b7165f297ce7dec23d5df1539360457";
        Map<String, String> methodProperties = new HashMap<>();
        methodProperties.put("Page", "1");
        methodProperties.put("Warehouse", "1");
        methodProperties.put("FindByString", "Київ");
        methodProperties.put("Limit", "5");

        bodyRequest.put("apiKey", API_key);
        bodyRequest.put("modelName", "Address");
        bodyRequest.put("calledMethod", "getSettlements");
        bodyRequest.put("methodProperties", methodProperties);
    }

    @Test
    public void checkThatSuccess() {
        given()
                .spec(requestSpecification)
                .contentType(ContentType.JSON)
                .body(bodyRequest)
                .when()
                .post()
                .then().log().all()
                .spec(responseSpecification)
                .statusCode(200)
                .body("success", equalTo(true));
    }

    @Test
    public void checkJsonSchema() {
        given()
                .spec(requestSpecification)
                .body(bodyRequest)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then().log().all()
                .spec(responseSpecification)
                .statusCode(200)
                .assertThat()
                .body(matchesJsonSchema(new File(System.getProperty("user.dir") +
                        "\\src\\main\\resources\\validators\\npAdressSchema.json")));
    }

    @Test
    public void checkRegions() {
        given()
                .spec(requestSpecification)
                .body(bodyRequest)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then().log().all()
                .spec(responseSpecification)
                .assertThat()
                .body("success", equalTo(true))
                .body("data[0].Description", equalTo("Київ"))
                .body("data[0].DescriptionTranslit", equalTo("Kyiv"))
                .body("data[0].AreaDescription", equalTo("Київська"))
                .body("data[0].AreaDescriptionTranslit", equalTo("Kyivska"));
    }

    @Test
    public void countOfTheIndexOnTheFirstRegion() {
        given()
                .spec(requestSpecification)
                .body(bodyRequest)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then().log().all()
                .spec(responseSpecification)
                .assertThat()
                .body("data[0].Index1", equalTo("01001"))
                .body("data[0].Index2", equalTo("04215"));
    }

    @Test
    public void countOfTheIndexOnTheSecondRegion() {
        given()
                .spec(requestSpecification)
                .body(bodyRequest)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then().log().all()
                .spec(responseSpecification)
                .assertThat()
                .body("data[1].Index1", equalTo("81646"))
                .body("data[1].Index2", equalTo("81646"));
    }

    @Test
    public void checkTotalCountOfRegions() {
        given()
                .spec(requestSpecification)
                .body(bodyRequest)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then().log().all()
                .spec(responseSpecification)
                .assertThat()
                .body("info.totalCount", equalTo(2));
    }

    @Test
    public void checkRegionsWithPojoUsageInUkraine() {

        List<AdressWithPojo> addressList = given()
                .spec(requestSpecification)
                .body(bodyRequest)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then().log().all()
                .spec(responseSpecification)
                .extract()
                .body().jsonPath().getList("data", AdressWithPojo.class);

        System.out.println(addressList);
        addressList.forEach(x -> Assert.assertTrue(x.getDescription().contains("Київ")));
    }

    @Test
    public void checkRegionsWithPojoUsageInEnglish() {
        Response response = given()
                .spec(requestSpecification)
                .body(bodyRequest)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .log().all()
                .spec(responseSpecification)
                .extract()
                .response();

        List<AdressWithPojo> addressList = response.jsonPath().getList("data", AdressWithPojo.class);

        System.out.println(addressList);
        addressList.forEach(x -> Assert.assertTrue(x.getDescriptionTranslit().contains("Kyiv")));
    }
}