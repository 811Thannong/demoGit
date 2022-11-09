package EVENTListener.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DressPage extends Base1Page {
    Actions action = new Actions(driver);
    private By optionDresses=By.xpath("(//a[@title='Dresses'])[2]");
    private By continueshoppingBtn = By.xpath("//span[@title='Continue shopping']");
    public boolean isOnDressesPage(){
        return driver.findElement(optionDresses).isDisplayed();
    }
    public void chooseProduct_Dresses(String nameProduct) {
        driver.findElement(optionDresses).click();
        int i;
        String i_img = null;
        WebElement i_choose = null;
        switch (nameProduct) {
            case "Printed Dress $26.00":
                i = 1;
                i_img = "8/8";
                break;
            case "Printed Dress $50.99":
                i = 2;
                i_img = "1/0/10";
                break;
            case "Printed Summer Dress $28.98":
                i = 3;
                i_img = "1/2/12";
                break;
            case "Printed Summer Dress $30.50":
                i = 4;
                i_img = "1/6/16";
                break;
            case "Printed Chiffon Dress":
                i = 4;
                i_img = "2/0/20";
                break;
            default:
                i = 0;
                i_img = "null";
        }
        i_choose = driver.findElement(By.xpath("//img[@src='http://automationpractice.com/img/p/" + i_img + "-home_default.jpg']"));
        WebElement btnAddtoCart = driver.findElement(By.xpath("(//span[text()='Add to cart'])[" + i + "]"));
        action.moveToElement(i_choose).perform();
        btnAddtoCart.click();
        driver.findElement(continueshoppingBtn).click();
    }
}
