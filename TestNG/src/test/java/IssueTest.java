import PageObject.HomePage;
import PageObject.IssuesPage;
import PageObject.MainPage;
import PageObject.RepositoriesPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class IssueTest extends BaseTest {
    @Test
    public void checkTheIssueTab() {
        HomePage home = new HomePage(driver);
        home.goToLoginPage().loginSuccessful("mari444ka1991@gmail.com", "More2023");
        MainPage mainPage = new MainPage(driver);
        mainPage.getLogoOnTheMainPage();
        Assert.assertTrue(mainPage.getLogoOnTheMainPage().isDisplayed());
        mainPage.goToPersonalLogo().click();
        mainPage.getYourRepositories().click();
        RepositoriesPage repositoriesPage = new RepositoriesPage(driver);
        repositoriesPage.getRepository().click();
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.getIssuesTab().click();
        issuesPage.getOpenIssue().click();
        issuesPage.typeIssue("Issue", "SomeBody in issue");
        issuesPage.getEditTextButton().click();
        issuesPage.typeTextToUpdateIssue("New Text", "Some comment");
        issuesPage.getIssuesTab().click();
        issuesPage.getCloseIssue().click();
    }
}
