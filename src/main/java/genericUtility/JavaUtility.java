package genericUtility;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * This class is to perform all java related operations
 * @author SSS
 */
public class JavaUtility 
{
/**
 * This is a generic method to generate random number
 * @return 
 */
	public int getRandomNumber()
	{
	Random r=new Random();
	int RandomNumber=r.nextInt(10000);
	return RandomNumber;
	}
	
	/**
	 * this method is to provide current date
	 * @return
	 * get this date class from util packsge
	 */
	public String getDateUsingCalendar()
	{
		Calendar cal= Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/YYYY");
		String modefiedDate=sdf.format(d);
		return modefiedDate;
	}
}


