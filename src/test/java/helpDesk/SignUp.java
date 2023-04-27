package helpDesk;

import core.BaseSeleniumPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp extends BaseSeleniumPage {

  @FindBy(xpath = "//input[@id='user_name']")
  private WebElement nameField;
  @FindBy(xpath = "//input[@id='user_login']")
  private WebElement usernameField;
  @FindBy(xpath = "//input[@id='user_email']")
  private WebElement emailField;
  @FindBy(xpath = "//input[@id='user_password']")
  private WebElement passwordField;
  @FindBy(xpath = "//input[@type='checkbox']")
  private WebElement agreeCheckbox;
  @FindBy(xpath = "//div[@id='errorExplanation']")
  private WebElement registerError;

  public SignUp(){
    driver.get("https://dribbble.com/signup/new");
    PageFactory.initElements(driver, this);
  }

  public SignUp incorrectSignUp(String name, String username, String email, String password){
    nameField.sendKeys(name);
    usernameField.sendKeys(username);
    emailField.sendKeys(email);
    passwordField.sendKeys(password);
    return this;
  }
  public ProfileConfig signUp(String name, String username, String email, String password){
    nameField.sendKeys(name);
    usernameField.sendKeys(username);
    emailField.sendKeys(email);
    passwordField.sendKeys(password);
    agreeCheckbox.click();
    return new ProfileConfig();
  }

}
