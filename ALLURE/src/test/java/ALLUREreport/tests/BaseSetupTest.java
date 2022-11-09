package ALLUREreport.tests;

import static ALLUREreport.pages.BaseSetupPage.logger;

import ALLUREreport.pages.BaseSetupPage;
import ALLUREreport.pages.LogIn1Page;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseSetupTest {
    BaseSetupPage baseSetupPage;
    LogIn1Page logInPage;
    @BeforeClass
    public void setUpDriver(){
        logger.info("Run set up driver in Base Setup Test");
        baseSetupPage=new BaseSetupPage();
        baseSetupPage.initDriver();
    }
    @AfterClass
    public void tearDown(){
        logger.info("Test is ending!!!");
        baseSetupPage.tearDown();
    }
}
