package helpDesk;

import core.BaseSeleniumPage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSeleniumPage {
  @FindBy(xpath = "//li[@class='js-site-nav-sign-in site-nav-actions-item']/a")
  private WebElement signIn;
  @FindBy(xpath = "//li[@class='js-site-nav-sign-up site-nav-actions-item site-nav-desktop-only']/a")
  private WebElement signUp;
  @FindBy(xpath = "//a[@class='form-sub site-nav-actions-icon-link']")
  private WebElement uploadButton;
  @FindBy(xpath = "//li[@data-cypress='nav-profile-btn']")
  private WebElement userMenu;
  @FindBy(xpath = "//li[@class='site-nav-user-item']//a[text()='Account Settings']")
  private WebElement accountSettingsLink;

  public MainPage(){
    driver.get("https://dribbble.com");
    PageFactory.initElements(driver, this);
  }
  public void checkAuthLinks(){
    signIn.sendKeys(Keys.CONTROL,Keys.ENTER);
    signUp.sendKeys(Keys.CONTROL,Keys.ENTER);
    int size = driver.getWindowHandles().size();
    Assert.assertEquals(3, size);
  }
  public MainPage checkAuthorized(){
    Assert.assertTrue(uploadButton.isDisplayed());
    return this;
  }

  public AccountSettings accountSettings(){
    Actions actions = new Actions(driver);
    actions.moveToElement(userMenu).build().perform();
    accountSettingsLink.click();
    return new AccountSettings();
  }
}
