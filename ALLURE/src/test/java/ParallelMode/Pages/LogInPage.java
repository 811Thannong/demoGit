package ParallelMode.Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LogInPage extends BasePage {
    WebElement userID= driver.findElement(By.name("uid"));
        WebElement password=driver.findElement(By.name("password"));
    WebElement btnLogIn=driver.findElement(By.name("btnLogin"));
    WebElement btnReSet=driver.findElement(By.name("btnReset"));

    public boolean isOnLoginPage(){
        return driver.findElement(By.name("btnReset")).isDisplayed();
    }

    public void enterUserID(String userid){
        if(userID.isDisplayed()){
            userID.sendKeys(userid);
        }
    }
    public void enterPassword(String passwd){
        if(password.isDisplayed()){
            password.sendKeys(passwd);
        }
    }
    public void clickBtnLogIn(){
        if(btnLogIn.isEnabled()){
            btnLogIn.click();
        }
    }
    public void clickBtnReSet(){
        if(btnReSet.isEnabled()){
            btnReSet.click();
        }
    }
    public AddNewCustomer logIn(){
        enterUserID("mngr442175");
        enterPassword("Ajazugy");
        clickBtnLogIn();
        return new AddNewCustomer();
    }
}
