package ParallelMode.Tests;

import ParallelMode.Pages.BasePage;
import ParallelMode.Pages.LogInPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base1Test {
    BasePage basePage;
    LogInPage logInPage;
    @BeforeTest
    public void setUpDriver() {
        basePage=new BasePage();
        basePage.initDriver();
    }

    @AfterTest
    public void tearDown() {
        basePage.tearDown();
    }
}
