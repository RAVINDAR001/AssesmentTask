package Assesment.GenericUtility;

import java.io.IOException;



import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import asses.ObjectRepository.HomePage;
import asses.ObjectRepository.LoginPage;





public class BaseClass {
	public static WebDriver sdriver;

	public static WebDriver sdDriver;

	
	
	WebDriverutility wutil=new WebDriverutility();
	propertyfileUtilty putil=new propertyfileUtilty();
	public WebDriver driver = null;
	@BeforeSuite
	public void beforeSuiteConfig() {
		Reporter.log("---Data base connection Estabilishes---", true);

	}
		@BeforeClass
		public void beforeClassConfig(/*String BROWSER*/) throws IOException {
			String BROWSER = putil.toReadDataFromPropertyFile("browser");
			String URL = putil.toReadDataFromPropertyFile("url");
			if (BROWSER.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();

			} else if (BROWSER.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}
			sdriver = driver;
			Reporter.log("Browser got launch", true);
		wutil.ToMaximize(driver);
		wutil.WaitForElement(driver);
		driver.get(URL);
	Reporter.log("navigated to login page", true);
		}
	
	
	@BeforeMethod
	public void beforeMethodConfig() throws IOException {
    LoginPage lp=new LoginPage(driver);
    String USERNAME = putil.toReadDataFromPropertyFile("admin");
	String PASSWORD = putil.toReadDataFromPropertyFile("password");
	
	
	lp.getEmail().sendKeys(USERNAME);
	lp.getPassword().sendKeys(PASSWORD);
	lp.getLoginButton().click();
	Reporter.log("login sucessfullt", true);
	}

	
	@AfterMethod
	public void afterMethodConfig() {
		HomePage hp=new HomePage(driver);
		wutil.ToMoveToElement(driver, hp.getSetting());
		hp.getLogout().click();
		Reporter.log("logout sucsessfully",true);
	

		}
	@AfterClass(groups = {"smoke","Regerassion"})
	public void afterClass() {
		Reporter.log("Browser closed secssesfully", true);
		driver.quit();
		Reporter.log("browser close sucsessfully", true);

	}

	@AfterSuite(groups = {"smoke","Regerassion"})
	public void afterSuitConfig() {
		Reporter.log("---database connection disconnected--", true);
	}
	
	

	


	}
	

	
