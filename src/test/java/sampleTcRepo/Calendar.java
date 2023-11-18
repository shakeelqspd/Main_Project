package sampleTcRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepository.HomePagePom;

public class Calendar extends BaseClass
{
	@Test
	public void calendarMod() throws Exception
	{
		HomePagePom HP=new HomePagePom(driver);
		HP.clickOperationCalendar();
		
	}
}
