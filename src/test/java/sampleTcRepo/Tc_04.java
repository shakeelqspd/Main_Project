package sampleTcRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepository.HomePagePom;

public class Tc_04 extends BaseClass
{
	@Test
	public void OrganizationsMod() throws Exception
	{
		HomePagePom HP=new HomePagePom(driver);
		HP.clickoperationOrganizations();
		
		
	}
}