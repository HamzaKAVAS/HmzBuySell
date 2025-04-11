package pages;

import drivers.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDashboardPage {

    public UserDashboardPage(){
        PageFactory.initElements(DriverManager.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@*='position-relative d-flex align-items-center'])[1]")
    public WebElement purchaseHistorySidebarLink;

    @FindBy(xpath = "//*[.='Purchase History']")
    public WebElement purchaseHistoryTextH3;

    @FindBy(xpath = "//*[.='Details']")
    public WebElement purchaseHistoryDetailsText;

    @FindBy(xpath = "//*[.='Amount']")
    public WebElement purchaseHistoryAmountText;

    @FindBy(xpath = "//*[.='Delivery Status']")
    public WebElement purchaseHistoryDeliveryStatusText;

    @FindBy(xpath = "//*[.='Payment Status']")
    public WebElement purchaseHistoryPaymentStatusText;

    @FindBy(xpath = "//*[.='Action']")
    public WebElement purchaseHistoryActionText;
























}
