package genericUtility;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePagePom;
import objectRepository.LoginPagePom;

public class BaseClass 
{
	public DatabaseUtility DUTIL=new DatabaseUtility();
	public PropertiesUtility PUTIL=new PropertiesUtility();
	public WebDriverUtility WUTIL=new WebDriverUtility();
	public static WebDriver driver=null;
	
	
	@BeforeSuite(alwaysRun = true)
	public void DbConnectionEstablish()throws Exception
	{
		DUTIL.establishConnection();
		System.out.println("DB connection established successfully");
	}
	@BeforeClass(alwaysRun = true)
	public void LaunchBrowser()throws Exception
	{
		String URL= PUTIL.getDataFromProperties("url");
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver-119.exe");
		driver=new ChromeDriver();
		driver.get(URL);
		WUTIL.implicitWaitScript(driver);
		WUTIL.maximizeWindow(driver);
		System.out.println("Webbrowser Launched Successfully");
	}
	@BeforeMethod(alwaysRun = true)
	public void LoginOperation()throws Exception
	{
		String USERNAME=PUTIL.getDataFromProperties("username");
		String PASSWORD=PUTIL.getDataFromProperties("password");
		LoginPagePom LP=new LoginPagePom(driver);
		LP.loginOperation(USERNAME, PASSWORD);
		System.out.println("Login Successful");
	}
	@AfterMethod(alwaysRun = true)
	public void LogoutOperation() throws Exception
	{
		HomePagePom HP=new HomePagePom(driver);
		HP.clickOperationAdministrator();
		Thread.sleep(3000);
		HP.clickoperationLogout();
		System.out.println("Logout Successful");
		
	}
	@AfterClass(alwaysRun = true)
	public void CloseBrowserOperation()
	{
		driver.close();
		System.out.println("Browser Closed Successfully");
	}
	@AfterSuite(alwaysRun = true)
	public void DbDisconnection() throws Exception
	{
		DUTIL.closeConnection();
		System.out.println("DB Disconnected");
	}
}
