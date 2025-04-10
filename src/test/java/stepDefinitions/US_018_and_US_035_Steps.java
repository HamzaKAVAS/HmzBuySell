package stepDefinitions;

import config.ConfigReader;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPages;
import pages.UserDashboardPage;
import utilities.ExcelReader;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US_018_and_US_035_Steps {

    private static final Logger logger = LogManager.getLogger();
    WebDriver driver = Hooks.getDriver();
    LoginPages loginPages = new LoginPages(driver);
    UserDashboardPage userDashboardPage = new UserDashboardPage();
    ExcelReader excelReader = new ExcelReader("src/test/resources/TestData.xlsx");
    Actions actions = new Actions(driver);

    @Given("Open your web browser and go to {string}.")
    public void openYourWebBrowserAndGoTo(String url) {

        driver.get(url);
        ReusableMethods.wait(2);
    }

    @And("On the home page, find and click the Login button in the upper right corner.")
    public void onTheHomePageFindAndClickTheLoginButtonInTheUpperRightCorner() {

        loginPages.loginButton.click();
        ReusableMethods.wait(2);
    }

    @And("On the screen that opens, enter a valid email address in the Email address or phone field.")
    public void onTheScreenThatOpensEnterAValidEmailAddressInTheEmailAddressOrPhoneField() {

        loginPages.emailInput.sendKeys(excelReader.getExcelText("Sheet1", 1, 0));
        ReusableMethods.wait(2);
    }

    @And("Enter a valid password in the Password field.")
    public void enterAValidPasswordInThePasswordField() {

        loginPages.passwordInput.sendKeys(excelReader.getExcelText("Sheet1", 1, 1));
        ReusableMethods.wait(2);
    }

    @And("Click on the Sign In button.")
    public void clickOnTheSignInButton() {

        loginPages.SignInButton.click();
        ReusableMethods.wait(2);
    }

    @And("After logging in, verify that the dashboard home page has loaded.")
    public void afterLoggingInVerifyThatTheDashboardHomePageHasLoaded() {

        loginPages.logoutButton.isDisplayed();
        ReusableMethods.wait(2);
    }

    @Then("Verify that Purchase History is visible and active in the left sidebar.")
    public void verifyThatPurchaseHistoryIsVisibleAndActiveInTheLeftSidebar() {

        JSUtilities.scrollToElement(driver, userDashboardPage.purchaseHistorySidebarLink);
        userDashboardPage.purchaseHistorySidebarLink.isDisplayed();
        ReusableMethods.wait(2);
    }

    @And("Press the logout button.")
    public void pressTheLogoutButton() {

        loginPages.logoutButton.click();
        ReusableMethods.wait(2);
    }

    @And("Close the page.")
    public void closeThePage() {

        driver.quit();
    }

    @Given("Go to the relevant URL and verify that the user panel has been loaded after completing the relevant login procedures.")
    public void goToTheRelevantURLAndVerifyThatTheUserPanelHasBeenLoadedAfterCompletingTheRelevantLoginProcedures() {

        driver.get(ConfigReader.getProperty("url"));
        ReusableMethods.wait(2);
        loginPages.loginButton.click();
        ReusableMethods.wait(2);
        loginPages.emailInput.sendKeys(excelReader.getExcelText("Sheet1", 1, 0));
        ReusableMethods.wait(2);
        loginPages.passwordInput.sendKeys(excelReader.getExcelText("Sheet1", 1, 1));
        ReusableMethods.wait(2);
        loginPages.SignInButton.click();
        ReusableMethods.wait(2);
        loginPages.logoutButton.isDisplayed();
        ReusableMethods.wait(2);
    }

    @And("Click Purchase History in the left sidebar.")
    public void clickPurchaseHistoryInTheLeftSidebar() {

        JSUtilities.clickWithJS(driver, userDashboardPage.purchaseHistorySidebarLink);
        ReusableMethods.wait(2);
    }

    @Then("Verify that the Purchase History page has loaded.")
    public void verifyThatThePurchaseHistoryPageHasLoaded() {

    }

    @Then("See if the Details, Amount, Delivery Status, Payment Status, Action headings are displayed.")
    public void seeIfTheDetailsAmountDeliveryStatusPaymentStatusActionHeadingsAreDisplayed() {
    }
}
