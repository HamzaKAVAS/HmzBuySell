package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPages;
import utilities.ExcelReader;
import utilities.ReusableMethods;

import java.time.Duration;

public class US_001and005Step {


    private static final Logger logger = LogManager.getLogger();
    WebDriver driver = Hooks.getDriver();
    LoginPages loginPages = new LoginPages(driver);
    ExcelReader excelReader = new ExcelReader("src/test/resources/TestData.xlsx");

    @Given("The user opens the browser and enters the URL address specified in the data into the URL bar.")
    public void the_user_opens_the_browser_and_enters_the_url_address_specified_in_the_data_into_the_url_bar() {

        driver.get(config.ConfigReader.getProperty("url"));

    }

    @When("The user waits for the page to fully load.")
    public void the_user_waits_for_the_page_to_fully_load() {

        ReusableMethods.wait(3);

    }

    @Then("The user verifies that all images on the homepage have loaded.")
    public void the_user_verifies_that_all_images_on_the_homepage_have_loaded() {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Login'])[1]")));

        // loginButton'ı doğrula
        Assert.assertTrue(loginButton.isDisplayed());  // Doğrudan wait ile alınan öğe üzerinden kontrol yapıyoruz


    }

    @Then("The user closes the browser.")
    public void the_user_closes_the_browser() {

        driver.quit();

    }

    @When("The user verifies that the page has fully loaded within {int} seconds.")
    public void the_user_verifies_that_the_page_has_fully_loaded_within_seconds(Integer timeout) {
        // WebDriverWait kullanarak sayfanın tam olarak yüklenmesini bekle
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

        // Login butonunun görünür olmasını bekle (Sayfa tamamen yüklendiği zaman görünür olacaktır)
        try {
            WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Login'])[1]")));

            // Sayfanın tamamen yüklendiğini ve login butonunun göründüğünü doğrula
            Assert.assertTrue("Login button is not visible within " + timeout + " seconds, page might not be fully loaded.", loginButton.isDisplayed());
        } catch (Exception e) {
            // Eğer element görünür değilse, assertion başarısız olacak ve test fail olacak
            Assert.fail("Page did not load fully within " + timeout + " seconds. Login button is not visible.");
        }
    }

    @When("The user checks the page title and verifies that it is {string}.")
    public void the_user_checks_the_page_title_and_verifies_that_it_is(String string) {

        Assert.assertTrue(driver.getTitle().contains(string));
    }

    @Then("the user verifies if the Login link in the top right corner is visible and active")
    public void the_user_verifies_if_the_login_link_in_the_top_right_corner_is_visible_and_active() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Login'])[1]")));

        // loginButton'ı doğrula
        Assert.assertTrue(loginButton.isDisplayed());  // Doğrudan wait ile alınan öğe üzerinden kontrol yapıyoruz
    }

    @When("the user navigates to the login page")
    public void the_user_navigates_to_the_login_page() {

        loginPages.loginButton.click();
    }

    @Then("the user verifies if the image and the text {string} are visible on the right side of the page")
    public void the_user_verifies_if_the_image_and_the_text_are_visible_on_the_right_side_of_the_page(String string) {

        Assertions.assertTrue(loginPages.RightText.isDisplayed());
        Assertions.assertTrue(loginPages.RightImage.isDisplayed());
    }

    @Then("the user verifies if the SignIn form in the top left corner is visible")
    public void the_user_verifies_if_the_sign_ın_form_in_the_top_left_corner_is_visible() {
        Assertions.assertTrue(loginPages.SignInForm.isDisplayed());
    }

    @Then("the user verifies if the SignIn button is visible and active")
    public void the_user_verifies_if_the_sign_ın_button_is_visible_and_active() {
        Assertions.assertTrue(loginPages.SignInButton.isDisplayed());
    }

    @Then("the user verifies if the checkbox is selectable")
    public void the_user_verifies_if_the_checkbox_is_selectable() {
        Assertions.assertTrue(loginPages.RememberMeButton.isEnabled());
    }

    @When("the user clicks on the {string} link")
    public void the_user_clicks_on_the_link(String string) {
        loginPages.forgotPasswordLinki.click();

    }

    @Then("the user verifies if they are redirected to the correct page")
    public void the_user_verifies_if_they_are_redirected_to_the_correct_page() {
        Assertions.assertTrue(loginPages.forgotPasswordText.isDisplayed());
    }

    @When("the user attempts to sign in with an invalid email and password by clicking the {string} button")
    public void the_user_attempts_to_sign_in_with_an_invalid_email_and_password_by_clicking_the_button(String string) {

        loginPages.gecersizlogin();
    }

    @Then("the user checks for error messages")
    public void the_user_checks_for_error_messages() {
        Assertions.assertTrue(loginPages.gecersizLoginText.isDisplayed());
    }

    @When("the user enters a valid email address and password click on the {string} button")
    public void the_user_enters_a_valid_email_address_and_password_click_on_the_button(String string) {
        loginPages.login();

    }

    @Then("the user verifies if they have successfully logged in")
    public void the_user_verifies_if_they_have_successfully_logged_in() {

        Assertions.assertTrue(loginPages.logoutButton.isDisplayed());

    }

}
