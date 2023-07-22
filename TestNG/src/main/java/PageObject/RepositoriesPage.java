package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class RepositoriesPage extends BasePage {

    List<WebElement> repositoriesList = driver.findElements(By.xpath("//a[@itemprop=\"name codeRepository\"]"));
    By repository = By.xpath("//h3[@class='wb-break-all']");
    By createRepository = By.cssSelector("a[class='text-center btn btn-primary ml-3']");
    By createRepositoryInput = By.cssSelector("input[aria-label='Repository']");
    By createRepositoryButton = By.xpath("//span[contains(text(), 'Create repository')]");
    private final static String TITLE = "Repositories page";

    public RepositoriesPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public List<String> getRepositories() {
        List<String> repositList = repositoriesList.stream().map(rep -> rep.getText()).collect(Collectors.toList());
        return repositList;
    }

    public RepositoriesPage createRepositoryAndConfirm(String name) {
        driver.findElement(createRepositoryInput).sendKeys(name);
        driver.findElement(createRepositoryButton).click();
        return new RepositoriesPage(driver);
    }

    public RepositoriesPage createNewRepositoryClick() {
        driver.findElement(createRepository).click();

        return new RepositoriesPage(driver);
    }

    public WebElement getRepository() {
        return driver.findElement(repository);
    }
}
