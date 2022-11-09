package ALLUREreport.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LogIn1Page extends BaseSetupPage{
//    WebElement userID= driver.findElement(By.name("uid"));
//    WebElement password=driver.findElement(By.name("password"));
//    WebElement btnLogIn=driver.findElement(By.name("btnLogin"));
//    WebElement btnReSet=driver.findElement(By.name("btnReset"));
    @Step("Verify is on true Login Page")
    public boolean isOnLoginPage(){
        return driver.findElement(By.name("btnReset")).isDisplayed();
    }
    @Step("Verify UserID {0} condition")
    public void enterUserID(String userid){
        if(driver.findElement(By.name("uid")).isDisplayed()){
            driver.findElement(By.name("uid")).sendKeys(userid);
        }
    }
    @Step("Verify Password {0} condition")
    public void enterPassword(String passwd){
        if(driver.findElement(By.name("password")).isDisplayed()){
            driver.findElement(By.name("password")).sendKeys(passwd);
        }
    }
    public void clickBtnLogIn(){
        if(driver.findElement(By.name("btnLogin")).isEnabled()){
            driver.findElement(By.name("btnLogin")).click();
        }
    }
    public void clickBtnReSet(){
        if(driver.findElement(By.name("btnReset")).isEnabled()){
            driver.findElement(By.name("btnReset")).click();
        }
    }
    @Step("Verify valid UserID {0} and Password {1}")
    public void logIn(){
        Properties properties=new Properties();
        try{
            FileReader reader=new FileReader("src/test/resources/config.properties");
            properties.load(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        enterUserID(properties.getProperty("userID"));
        enterPassword(properties.getProperty("password"));
        clickBtnLogIn();
    }
}
