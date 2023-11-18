package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.BaseClass;

public class Create_ContactsPom extends BaseClass

{
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement Contact;

	public Create_ContactsPom(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getContact() {
		return Contact;
	}
	
	public void ContactsCreation()
	{
		getContact().click();
	}
	
	

}
