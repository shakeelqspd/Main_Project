package genericUtility;

import org.testng.ITestResult;

public class IRetryAnalyzer 
{
	int count=0;
	int retryAnalyzer=5;

	public boolean retry(ITestResult result) {
		while (count<retryAnalyzer) {
			count++;
			return true;
			
		}
		
		return false;
	}
	
}
