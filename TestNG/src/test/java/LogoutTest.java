import PageObject.HomePage;
import PageObject.MainPage;
import PageObject.ProfileForm;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LogoutTest extends BaseTest {
    @Test
    public void checkLogOutFromGitHub() {
        String expectedQuestionText = "Are you sure you want to sign out?";
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().loginSuccessful("mari444ka1991@gmail.com", "More2023");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToProfileForm();
        ProfileForm profileForm = new ProfileForm(driver);
        Assert.assertEquals(expectedQuestionText, profileForm.signOutFromGitHub().getQuestionElement().getText());
    }
}
