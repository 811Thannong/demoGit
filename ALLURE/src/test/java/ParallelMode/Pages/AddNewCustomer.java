package ParallelMode.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AddNewCustomer extends BasePage{
    WebElement header=driver.findElement(By.xpath("//h2[@class='barone']"));
    WebElement new_Customer=driver.findElement(By.xpath("//a[contains(text(),'Edit Customer')]"));
    WebElement name=driver.findElement(By.xpath("//input[@name='name']"));
    WebElement gender=driver.findElement(By.xpath("(//input[@name='rad1'])[2]"));
    WebElement date_of_birth=driver.findElement(By.xpath("(//input[@name='dob'])"));
    WebElement addr=driver.findElement(By.xpath("(//textarea[@name='addr'])"));
    WebElement city=driver.findElement(By.xpath("(//input[@name='city'])"));
    WebElement state=driver.findElement(By.xpath("(//input[@name='state'])"));
    WebElement pin=driver.findElement(By.xpath("(//input[@name='pinno'])"));
    WebElement phone=driver.findElement(By.xpath("(//input[@name='telephoneno'])"));
    WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
    WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
    WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
    WebElement reset=driver.findElement(By.xpath("//input[@type='reset']"));
    public boolean isOnHomePage(){
        Assert.assertEquals(header.getText(),"Guru99 Bank");
        return true;
    }
    public void click_on_newCustomer(){
        wait.until(ExpectedConditions.elementToBeClickable(new_Customer));
        new_Customer.click();
        wait.until(ExpectedConditions.visibilityOf(name));
    }
    public void addNewCustomer(){
        click_on_newCustomer();

        name.sendKeys("NNNNNNN");
        gender.click();
        date_of_birth.sendKeys("12/12/2022");
        addr.sendKeys("Viet Nam");
        city.sendKeys("Ho Chi Minh city");
        state.sendKeys("abc");
        pin.sendKeys("12345");
        phone.sendKeys("099999999");
        email.sendKeys("duonguyen0899@gmail.com");
        password.sendKeys("123456");
        submit.click();
    }
}

