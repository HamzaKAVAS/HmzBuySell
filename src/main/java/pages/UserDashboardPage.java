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

    @FindBy(xpath = "(//*[@*='amazy_status_btn'])[1]")
    public WebElement downloadButtonUnderAction;

    @FindBy(xpath = "(//*[@*='amazy_status_btn purchase_show'])[1]")
    public WebElement hamburgerButtonUnderAction;

    @FindBy(xpath = "(//*[@*='close_modal_icon'])[1]")
    public WebElement closeButtonOnTheOrderDocument;

    @FindBy(xpath = "(//*[@*='font_16 f_w_700 m-0 flex-fill'])[1]")
    public WebElement orderCodeOnTheOrderDocument;

    @FindBy(xpath = "(//*[@*='font_16 f_w_700 m-0 flex-fill'])[2]")
    public WebElement packageCodeOnTheOrderDocument;

    @FindBy(xpath = "(//*[@*='font_14 f_w_500 m-0 text-nowrap'])[5]")
    public WebElement deliveredTextOnTheOrderDocument;

    @FindBy(xpath = "//*[.='Order Summary']")
    public WebElement orderSummaryTextOnTheOrderDocument;

    @FindBy(xpath = "//*[@*='summery_pro_content']")
    public WebElement orderDetailOnTheOrderDocument;

    @FindBy(xpath = "//*[@*='Cash On Delivery']")
    public WebElement paymentTypeCashOnDeliveryImage;
























}
