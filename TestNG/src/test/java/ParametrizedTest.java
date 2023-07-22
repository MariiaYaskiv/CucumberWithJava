import PageObject.HomePage;
import PageObject.IssuesPage;
import PageObject.MainPage;
import PageObject.RepositoriesPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParametrizedTest extends BaseTest {


    @DataProvider(name = "credentialsProvider")
    public Object[][] providerCredentials() {
        return new Object[][]{
                {"TheFirstRepo"},
                {"TheSecondRepo"},
                {"TheThirdRepo"}
        };
    }

    @Test(dataProvider = "credentialsProvider")
    public void checkHowManyRepositoriesThereAreOnGitHub(String name) {
        HomePage home = new HomePage(driver);
        home.goToLoginPage().loginSuccessful("mari444ka1991@gmail.com", "More2023");
        MainPage mainPage = new MainPage(driver);
        mainPage.getLogoOnTheMainPage();
        Assert.assertTrue(mainPage.getLogoOnTheMainPage().isDisplayed());
        mainPage.goToPersonalLogo().click();
        mainPage.getYourRepositories().click();
        RepositoriesPage repositoriesPage = new RepositoriesPage(driver);
        repositoriesPage.createNewRepositoryClick();
        repositoriesPage.createRepositoryAndConfirm(name);
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.verifyIfItIsTheNeededPageAndRepositoryWasDone();

    }
}
