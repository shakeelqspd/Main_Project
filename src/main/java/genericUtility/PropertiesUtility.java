package genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @param data
 * @return
 * throws exception
 */
public class PropertiesUtility 
{
	
	public String getDataFromProperties(String data) throws Exception
	{
		FileInputStream fis=new FileInputStream(IConstantUtility.propertiespath);
		Properties pobj=new Properties();
		pobj.load(fis);
		String propertiesData=	pobj.getProperty(data);
		return propertiesData;
		
	}
	
}
