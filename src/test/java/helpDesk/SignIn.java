package helpDesk;

import core.BaseSeleniumPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn extends BaseSeleniumPage {

  @FindBy(xpath = "//h2[text()='Sign in to Dribbble']")
  private WebElement signInTitle;
  @FindBy(xpath = "//input[@id='login']")
  private WebElement loginField;
  @FindBy(xpath = "//input[@id='password']")
  private WebElement passwordField;
  @FindBy(xpath = "//input[@type='submit']")
  private WebElement signInButton;
  @FindBy(xpath = "//h2[contains(text(), 'We couldn’t find an account')]")
  private WebElement signInFailAlert;
  public SignIn(){
    driver.get("https://dribbble.com/session/new");
    PageFactory.initElements(driver, this);
  }

  public SignIn checkPage(){
    Assert.assertEquals(signInTitle.getText(), "Sign in to Dribbble");
    return this;
  }

  public SignIn incorrectSignIn(String email, String password){
    loginField.sendKeys(email);
    passwordField.sendKeys(password);
    signInButton.click();
    Assert.assertTrue(signInFailAlert.isDisplayed());
    return this;
  }
  public MainPage signIn(String email, String password){
    loginField.sendKeys(email);
    passwordField.sendKeys(password);
    signInButton.click();
    return new MainPage();
  }
}
