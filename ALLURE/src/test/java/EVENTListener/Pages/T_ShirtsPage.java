package EVENTListener.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class T_ShirtsPage extends Base1Page {
    Actions action=new Actions(driver);
    private By optionTShirt=By.xpath("(//a[@title='T-shirts'])[2]");
    private By continueshoppingBtn=By.xpath("//span[@title='Continue shopping']");
    public boolean isOnTshirtPage(){
        return driver.findElement(optionTShirt).isDisplayed();
    }
    public void chooseProduct_TShirts() {
        Assert.assertTrue(isOnTshirtPage());
        driver.findElement(optionTShirt).click();
        WebElement i_choose= driver.findElement(By.xpath("//img[@src='http://automationpractice.com/img/p/1/1-home_default.jpg']"));
        WebElement btnAddtoCart = driver.findElement(By.xpath("(//span[text()='Add to cart'])[1]"));
        action.moveToElement(i_choose).perform();
        btnAddtoCart.click();
        driver.findElement(continueshoppingBtn).click();
    }
}
