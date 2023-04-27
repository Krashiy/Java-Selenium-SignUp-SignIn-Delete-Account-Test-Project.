package helpDesk;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfileConfig extends BaseSeleniumPage {

  @FindBy(xpath = "//input[@type='file']")
  private List<WebElement> profileImageFileInputs;
  @FindBy(xpath = "//input[@id='location']")
  private WebElement locationField;
  @FindBy(xpath = "//button[@class='form-sub']")
  private WebElement continueButton;
  @FindBy(xpath = "//h3[contains(text(), 'No')]/ancestor::div[@class='select-box-choice']")
  private WebElement chooseRadio;
  public ProfileConfig(){
    driver.get("https://dribbble.com/get-started");
    PageFactory.initElements(driver, this);
  }

  public void configureProfile(){
    profileImageFileInputs.get(0).sendKeys("C:\\Users\\RAVEN\\Desktop\\suite\\zhumajsynba-perevod-768x535");
    locationField.sendKeys("Kiev");
    continueButton.click();
    chooseRadio.click();
    chooseRadio.click();
  }
}
