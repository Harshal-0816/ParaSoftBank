package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_VerifyAccountLoginTest extends BaseClass{
	
	@Test(groups= {"Regression", "Master"})
	public void verify_login_account()
	{
		logger.info("****Started TC002_VerifyAccountLogintest****");

		try
		{
		HomePage hp = new HomePage(driver);
		hp.setUsername(p.getProperty("username"));
		hp.setPassword(p.getProperty("password"));
		hp.click_Login();
		
		MyAccountPage lp= new MyAccountPage(driver);
		boolean accountOverview=lp.isAccountOverviewPageExists();
		
		Assert.assertEquals(accountOverview, true);
		
		}
		catch (Exception e)
		{
			Assert.fail();
		}
		
		logger.info("****Finished TC002_VerifyAccountLogintest****");
		
	}
	
	
	
	
	
	
	
	
	

}
