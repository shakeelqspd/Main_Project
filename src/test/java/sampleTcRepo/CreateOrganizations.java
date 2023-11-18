package sampleTcRepo;

import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import genericUtility.BaseClass;
import objectRepository.Create_OrganizationsPom;

import java.io.FileInputStream;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.IConstantUtility;
import objectRepository.HomePagePom;
public class CreateOrganizations extends BaseClass
{
	
	@Test
	public void addOrganizations() throws Exception	
	
	{
		
		
		Create_OrganizationsPom CO=new Create_OrganizationsPom(driver);
		CO.getOrganizations().click();
		Random r=new Random();
		int RNumber=  r.nextInt(10000);
		HomePagePom HP=new HomePagePom(driver);
		HP.clickoperationOrganizations();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		Thread.sleep(3000);
		ExcelUtility EUTIL=new ExcelUtility();
		String OrganizationName=EUTIL.getDataFromExcel("Leads", 2, 4);		
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys(OrganizationName + RNumber);
		WebElement element= driver.findElement(By.xpath("//select[@name='industry']"));
		Select s=new Select(element);
		s.selectByIndex(6);
		
		WebElement element1= driver.findElement(By.xpath("(//select[@class='small'])[4]"));
		Select s1=new Select(element1);
		s1.selectByIndex(3);
 		driver.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).click();
		
	}

}
