package helpDesk;

import core.BaseSeleniumTest;
import helpers.Data;
import org.junit.Ignore;
import org.junit.Test;

public class HelpDeskTest extends BaseSeleniumTest {

  @Test
  @Ignore
  public void checkSighInAndSignUp(){
    MainPage mainPage = new MainPage();
    mainPage.checkAuthLinks();
  }

  @Test
  @Ignore
  public void signUp(){
    SignUp signUp = new SignUp();
    signUp.incorrectSignUp(Data.INCORRECT_NAME, Data.INCORRECT_USERNAME, Data.INCORRECT_EMAIL, Data.INCORRECT_PASSWORD)
            .signUp(Data.CORRECT_NAME, Data.CORRECT_USERNAME, Data.CORRECT_EMAIL, Data.CORRECT_PASSWORD)
            .configureProfile();
  }

  @Test
  public void signIn(){
    SignIn signIn = new SignIn();
    signIn.incorrectSignIn(Data.INCORRECT_EMAIL, Data.INCORRECT_PASSWORD)
            .signIn(Data.CORRECT_EMAIL, Data.CORRECT_PASSWORD)
            .checkAuthorized();
  }

  @Test
  public void deleteAccount(){
    MainPage mainPage = new MainPage();
    mainPage.accountSettings()
            .prepareToDestroy()
            .destroyAccount();
  }
}
