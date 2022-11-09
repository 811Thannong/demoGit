package ALLUREreport.pages;

import ALLUREreport.Listener.WebDriverEventHandler;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class BaseSetupPage {
//    public WebDriverEventHandler eventListener;
    public static EventFiringWebDriver driver;
    public static WebDriver dr;
    public static final Logger logger= LogManager.getLogger(BaseSetupPage.class);
    public void initDriver(){
        logger.info(" Driver start !!!");
        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
        driver=new EventFiringWebDriver(new ChromeDriver());
        driver.register(new WebDriverEventHandler());
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.navigate().to("https://demo.guru99.com/v4/index.php");
//        dr = new EventFiringWebDriver(driver);
//        eventListener = new WebDriverEventHandler();
//        driver.register(new WebDriverEventHandler());
      //  return new LogInPage();
    }
    public void tearDown(){
        driver.quit();
    }
}
