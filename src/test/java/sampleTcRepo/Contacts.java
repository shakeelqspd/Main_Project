package sampleTcRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepository.HomePagePom;

public class Contacts extends BaseClass
{
	@Test
	public void ContactsMod() throws Exception
	{
		HomePagePom HP=new HomePagePom(driver);
		HP.clickoperationContacts();
		
	}
}