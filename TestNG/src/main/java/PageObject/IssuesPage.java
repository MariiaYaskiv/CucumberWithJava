package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class IssuesPage extends BasePage {
    private By issuesTab = By.xpath("//a[@id=\"issues-tab\"]");
    private By openIssue = By.xpath("//span[@class='d-none d-md-block']");
    private By issueTitle = By.xpath("//input[@required='required']");
    private By issueBody = By.xpath("//textarea[@name='issue[body]']");
    private By submitButton = By.xpath("//button[@class='btn-primary btn ml-2']");
    private By editTextButton = By.xpath("//button[@aria-label='Edit Issue title']");
    private By typeToUpdateIssue = By.cssSelector("input[class*='form-control js-quick-submi']");
    private By buttonSaveUpdating = By.cssSelector("button[data-disable-with='Updating']");
    private By commentIssue = By.cssSelector("textarea[name='comment[body]']");
    private By closeIssue = By.cssSelector("span[data-default-action-text='Close issue']");
    private final static String TITLE = "Issue page";

    public IssuesPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public WebElement getIssuesTab() {
        return driver.findElement(issuesTab);
    }

    public WebElement getOpenIssue() {
        return driver.findElement(openIssue);
    }

    public IssuesPage typeIssue(String text1, String text2) {
        driver.findElement(issueTitle).sendKeys(text1);
        driver.findElement(issueBody).sendKeys(text2);
        driver.findElement(submitButton).click();
        return new IssuesPage(driver);
    }

    public WebElement getEditTextButton() {
        return driver.findElement(editTextButton);
    }

    public IssuesPage typeTextToUpdateIssue(String text1, String text2) {
        driver.findElement(typeToUpdateIssue).sendKeys(text1);
        driver.findElement(commentIssue).sendKeys(text2);
        driver.findElement(buttonSaveUpdating).click();
        return new IssuesPage(driver);
    }

    public WebElement getCloseIssue() {
        return driver.findElement(closeIssue);
    }

    public IssuesPage verifyIfItIsTheNeededPageAndRepositoryWasDone() {
        Assert.assertTrue(driver.findElement(issuesTab).isDisplayed());
        return new IssuesPage(driver);
    }
}
