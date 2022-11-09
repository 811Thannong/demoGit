package EVENTListener.Tests;

import EVENTListener.Pages.T_ShirtsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_ShirtsTest {
    public T_ShirtsPage t_shirtPage;
    @Test
    public void test_T_Shirt_page(){
        Assert.assertTrue(t_shirtPage.isOnTshirtPage());
        t_shirtPage=new T_ShirtsPage();
        t_shirtPage.chooseProduct_TShirts();
    }
}
