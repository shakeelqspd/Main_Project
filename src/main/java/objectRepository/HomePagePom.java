package objectRepository;
/**
 * this page is for homepage
 * @author SSS
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Return;

public class HomePagePom 
{
	@FindBy(xpath = "//a[text()='Calendar']")
	private WebElement calendar;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/Home.PNG']")
	private WebElement home;
	
	@FindBy(xpath = "//a[text()='Leads']")
	private WebElement leads;
	
	@FindBy (xpath = "//a[text()='Organizations']")
	private WebElement organizations;
	
	@FindBy (xpath = "//a[text()='Contacts']")
	private WebElement contacts;
	
	@FindBy(xpath = "(//a[text()='Opportunities'])[1]")
	private WebElement opportunities;
	
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement products;
	
	@FindBy(xpath = "(//td[@class='small'])[2]")
	private WebElement administrator;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement logout;
	
	public HomePagePom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	
	/**
	 * this is a generic method to perform click operation
	 * @author SSS
	 * 
	 */
	
	public WebElement getCalendar() {
		return calendar;
	}



	public WebElement getHome() {
		return home;
	}



	public WebElement getLeads() {
		return leads;
	}



	public WebElement getOrganizations() {
		return organizations;
	}



	public WebElement getContacts() {
		return contacts;
	}



	public WebElement getOpportunities() {
		return opportunities;
	}



	public WebElement getProducts() {
		return products;
	}



	public WebElement getAdministrator() {
		return administrator;
	}



	public WebElement getLogout() {
		return logout;
	}



	/**
	 * business class for Calendar
	 */
	public void clickOperationCalendar() 
	{
		getCalendar().click();
	}

	
	/**
	 * business class for Leads
	 */
	public void clickOperationLeads() 
	{
		getLeads().click();
	}
	
	/**
	 * business class for Organizations
	 */
	public void clickoperationOrganizations()
	{
		getOrganizations().click();
	}
	
	
	/**
	 * business class for Contacts
	 */
	public void clickoperationContacts()
	{
		getContacts().click();
	}
	
	/**
	 * business class for Opportunities
	 */
	public void clickoperationOpportunities()
	{
		getOpportunities().click();
	}
	
	/**
	 * business class for Products
	 */
	public void clickoperationProducts()
	{
		getProducts().click();
	}
	
	/**
	 * business class for administrator
	 */
	public void clickOperationAdministrator()
	{
		getAdministrator().click();
	}
	
	/**
	 * business class for Signout
	 */
	public void clickoperationLogout()
	{
		getLogout().click();
	}
}
