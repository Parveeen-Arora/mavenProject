package amazon_Package.AmazonProject_Maven;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class I_Retry_Analyzer implements IRetryAnalyzer
{

	static int no_count=0;
	static int no_retry=1;
	@Override
	public boolean retry(ITestResult result)
	{
		if(no_count<no_retry)
		{
			no_count++;
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

}
