package EVENTListener.Tests;


import EVENTListener.Pages.Base1Page;
import EVENTListener.Pages.SignInPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class Base1Test {
    Base1Page basePage;
    SignInPage signInPage;
    @BeforeClass
    public void setUpDriver() {
        basePage=new Base1Page();
        signInPage=basePage.initDriver();
    }

    @AfterClass
    public void tearDown() {
        basePage.tearDown();
    }
}