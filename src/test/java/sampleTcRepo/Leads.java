package sampleTcRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepository.HomePagePom;

public class Leads extends BaseClass
{
	@Test
	public void LeadsMod() throws Exception
	{
		HomePagePom HP=new HomePagePom(driver);
		HP.clickOperationLeads();
		
	}
}
