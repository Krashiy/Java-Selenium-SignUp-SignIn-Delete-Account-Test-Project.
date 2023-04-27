package helpDesk;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettings extends BaseSeleniumPage {
  @FindBy(xpath = "//a[@href='/account/destroy_confirm']")
  private WebElement deleteAccountLink;
  public AccountSettings(){
    driver.get("https://dribbble.com/account");
    PageFactory.initElements(driver, this);
  }

  public DestroyAccount prepareToDestroy(){
    deleteAccountLink.click();
    return new DestroyAccount();
  }
}
