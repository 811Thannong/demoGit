package ALLUREreport.tests;

import ALLUREreport.pages.LogIn1Page;
import io.qameta.allure.*;
import org.testng.annotations.Test;
@Epic("Regression EVENTListener.ParallelMode.ParallelMode.Pages.ParallelMode.Pages.Tests.Tests.Pages.ParallelMode.Pages.Tests.Tests")
@Feature("Login EVENTListener.ParallelMode.ParallelMode.Pages.ParallelMode.Pages.Tests.Tests.Pages.ParallelMode.Pages.Tests.Tests")
public class LogIn1Test extends BaseSetupTest{
    @Test(priority = 0, description = "Valid Login Scenario with  userID and password.")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Description: Login test with userID and wrong password.")
    @Story("Valid userID and password login test")
    public void logIn_Test_success(){
//        Assert.assertFalse(logInPage.isOnLoginPage());
        logInPage=new LogIn1Page();
        logInPage.logIn();
    }
}
