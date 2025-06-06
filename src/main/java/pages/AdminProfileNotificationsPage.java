package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminProfileNotificationsPage extends BasePage{

    public AdminProfileNotificationsPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(id = "sign_in_btn")
    public WebElement adminSignInButton;

    @FindBy(id = "profile_pic")
    public WebElement adminProfilePicture;

    @FindBy(xpath = "//*[@*='fa fa-bell']")
    public WebElement notificationBell;

    @FindBy(xpath = "//*[@*='notification_count']")
    public WebElement notificationCount;

    @FindBy(xpath = "//*[.='Setting']")
    public WebElement notificationBellSetting;

    @FindBy(xpath = "(//h3)[1]")
    public WebElement personalNotificationSettingText;

    @FindBy(xpath = "//*[@*='6893']")
    public WebElement registerCheckmark;

    @FindBy(xpath = "//*[@*='6898']")
    public WebElement pendingCheckmark;

    @FindBy(xpath = "//*[@*='toast-message']")
    public WebElement updateSuccessfullyText;

    @FindBy(xpath = "//*[.='View']")
    public WebElement notificationBellView;

    @FindBy(xpath = "(//*[@*='save_button_parent'])[1]")
    public WebElement notificationsPageView;

    @FindBy(xpath = "//*[.='Read all']")
    public WebElement notificationBellReadAll;

}
