package sampleTcRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepository.HomePagePom;

public class Tc_05 extends BaseClass
{
	@Test
	public void ContactsMod() throws Exception
	{
		HomePagePom HP=new HomePagePom(driver);
		HP.clickoperationContacts();
		
	}
}