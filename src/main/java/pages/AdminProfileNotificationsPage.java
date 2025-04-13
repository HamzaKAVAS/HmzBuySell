package pages;

import drivers.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminProfileNotificationsPage {

    public AdminProfileNotificationsPage(){
        PageFactory.initElements(DriverManager.getDriver(),this);
    }

    @FindBy(id = "profile_pic")
    public WebElement adminProfilePicture;

    @FindBy(xpath = "//*[@*='fa fa-bell']")
    public WebElement notificationBell;




}
