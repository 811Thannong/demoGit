package ParallelMode.Tests;

import ParallelMode.Pages.AddNewCustomer;
import ParallelMode.Pages.LogInPage;
import org.testng.annotations.Test;

public class LogInTest extends Base1Test {
    AddNewCustomer addNewCustomer;
    LogInPage logInPage;
    @Test
    public void logIn_Test_success(){
        logInPage=new LogInPage();
        addNewCustomer=logInPage.logIn();
    }
}
