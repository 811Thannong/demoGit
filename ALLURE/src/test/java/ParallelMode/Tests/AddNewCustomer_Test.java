package ParallelMode.Tests;


import ParallelMode.Pages.AddNewCustomer;
import org.testng.annotations.Test;

public class AddNewCustomer_Test extends Base1Test {
   AddNewCustomer addNewCustomer;
//   @Test
//    public void check_true_page(){
//       addNewCustomer=new AddNewCustomer();
//       addNewCustomer.isOnHomePage();
//   }
   @Test
   public void setAddNewCustomer(){
       addNewCustomer=new AddNewCustomer();
       addNewCustomer.addNewCustomer();
   }
}
