package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class Create_OrganizationsPom

{
	@FindBy(xpath = "(//a[text()='Organizations'])[1]")
	private WebElement Organizations;

	public Create_OrganizationsPom(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getOrganizations() {
		return Organizations;
	}
	
	public void OrganizationsCreation()
	{
		getOrganizations().click();
	}
	
	
	
	
	
	
	
}
