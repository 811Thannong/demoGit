package ParallelMode.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public static WebDriver driver;
    static WebDriverWait wait;
    public WebDriver initDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        wait=new WebDriverWait(driver,30);
        driver.navigate().to("https://demo.guru99.com/V4/");
        return driver;
    }
    public void tearDown(){
        driver.quit();
    }
}
