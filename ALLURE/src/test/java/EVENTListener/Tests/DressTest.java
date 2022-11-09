package EVENTListener.Tests;

import EVENTListener.Pages.DressPage;

import org.testng.annotations.Test;

public class DressTest {
    public DressPage dressesPage;
    @Test
    public void test_Dresses_page(){
        dressesPage=new DressPage();
        dressesPage.chooseProduct_Dresses("Printed Summer Dress $30.50");
        dressesPage.chooseProduct_Dresses("Printed Chiffon Dress");
    }
}
