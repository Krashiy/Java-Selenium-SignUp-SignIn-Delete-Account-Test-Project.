package helpDesk;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DestroyAccount extends BaseSeleniumPage {
  @FindBy(xpath = "//a[text()='Delete my account']")
  private WebElement destroyButton;
  public DestroyAccount(){
    driver.get("https://dribbble.com/account/destroy_confirm");
    PageFactory.initElements(driver, this);
  }

  public MainPage destroyAccount(){
    destroyButton.click();
    return new MainPage();
  }
}
