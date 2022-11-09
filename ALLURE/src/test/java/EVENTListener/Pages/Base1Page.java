package EVENTListener.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Base1Page {
    public static WebDriver driver;
    public SignInPage initDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.navigate().to("http://automationpractice.com/index.php");
        return new SignInPage();
    }
    public void tearDown(){
        driver.quit();
    }
}
