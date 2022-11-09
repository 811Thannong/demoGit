package EVENTListener.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SignInPage extends Base1Page {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebElement headerSignInBtn=driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
    WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
    WebElement password=driver.findElement(By.xpath("//*[@id='passwd']"));
    WebElement signInBtn=driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
    public boolean isOnSignInPage(){
        return headerSignInBtn.isDisplayed();
    }
    public void enterEmail(String emailF){
        js.executeScript("arguments[0].scrollIntoView(true);", email);
        if(email.isDisplayed()){
            email.sendKeys(emailF);
        }
    }
    public void clickHeaderSignInBtn(){
        if(headerSignInBtn.isDisplayed()){
            headerSignInBtn.click();
        }
    }
    public void enterPassword(String passwd){
        if(password.isDisplayed()){
            password.sendKeys(passwd);
        }
    }
    public void clickSignInBtn(){
        if (signInBtn.isEnabled()){
            signInBtn.click();
        }
    }
    public T_ShirtsPage signIn() throws IOException {
        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"))));
        clickHeaderSignInBtn();
        Properties properties=new Properties();
        try {
            FileReader reader = new FileReader("src/test/resources/config.properties");
            properties.load(reader);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        enterEmail(properties.getProperty("email"));
        enterPassword(properties.getProperty("passwd"));
        clickSignInBtn();
        return new T_ShirtsPage();
    }
}
