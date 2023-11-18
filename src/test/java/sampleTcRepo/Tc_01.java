package sampleTcRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.PropertiesUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPagePom;

public class Tc_01
{
	@Test	
	public void checklogin() throws Exception
	{
		
		PropertiesUtility PUTIL =new PropertiesUtility();
		String URL     =PUTIL.getDataFromProperties("url");
		String USERNAME=PUTIL.getDataFromProperties("username");
		String PASSWORD=PUTIL.getDataFromProperties("password");
		
		WebDriverUtility WUTIL= new WebDriverUtility();
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "E:\\MS\\MS Softwares\\Selenium\\chromedriver-119\\chromedriver-win64\\chromedriver-119.exe");
		
		WebDriver driver=new ChromeDriver();
		WUTIL.implicitWaitScript(driver);
		driver.get(URL);
		WUTIL.maximizeWindow(driver);
		LoginPagePom LPM=new LoginPagePom(driver);
		LPM.loginOperation(USERNAME, PASSWORD);	
}
}