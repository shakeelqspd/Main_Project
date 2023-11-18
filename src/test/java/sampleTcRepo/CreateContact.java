package sampleTcRepo;

import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import objectRepository.Create_ContactsPom;
import objectRepository.HomePagePom;

public class CreateContact extends BaseClass


	{
		@Test
		public void addContact()throws Exception
		{
			Create_ContactsPom CC=new Create_ContactsPom(driver);
			CC.getContact().click();
			
			Random r=new Random();
			int RNumber=  r.nextInt(10000);
			ExcelUtility EUTIL=new ExcelUtility();
			String LNAME=EUTIL.getDataFromExcel("Leads", 2, 3);
			
			
			driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
			driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[3]")).sendKeys(LNAME + RNumber);
			driver.findElement(By.xpath("(//img[@alt='Select'])[1]")).click();
			
			String parentId= driver.getWindowHandle();
			Set<String> ChildId=driver.getWindowHandles();
			for(String allId:ChildId)
{
			if(!parentId.equals(ChildId))
			{
				driver.switchTo().window(allId);
			}
}
			driver.findElement(By.xpath("//a[text()='ATA']")).click();
			driver.switchTo().window(parentId);
			

			driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
		}
		
		}
	

