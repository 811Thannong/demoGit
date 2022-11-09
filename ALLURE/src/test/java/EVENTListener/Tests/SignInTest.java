package EVENTListener.Tests;

import EVENTListener.Pages.SignInPage;
import org.testng.annotations.Test;
import java.io.IOException;

public class SignInTest extends Base1Test {
    @Test
    public void logIn_Test_success() throws IOException {
        signInPage.isOnSignInPage();
        signInPage=new SignInPage();
        signInPage.signIn();
    }
}
