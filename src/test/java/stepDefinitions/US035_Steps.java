package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPages;
import utilities.ExcelReader;

public class US035_Steps {

    private static final Logger logger = LogManager.getLogger();
    WebDriver driver = Hooks.getDriver();
    LoginPages loginPages = new LoginPages(driver);
    ExcelReader excelReader = new ExcelReader("src/test/resources/TestData.xlsx");
    Actions actions = new Actions(driver);
















}
