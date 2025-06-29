package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_VerifyAccountLoginDataDrivenTest extends BaseClass{
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void verifyAccountLoginDataDrivenTest(String email, String pwd, String exp)
	{
		logger.info("****Started TC003_VerifyAccountLoginDataDrivenTest****");
		
		try {
			//HomePage
			HomePage hp = new HomePage(driver);
			hp.setUsername(email);
			hp.setPassword(pwd);
			hp.click_Login();
			
			//MyAccountPage
			
			MyAccountPage macp= new MyAccountPage(driver);
			boolean accountPage=macp.isAccountOverviewPageExists();
		
			if(exp.equalsIgnoreCase("Valid"))
			{
				if(accountPage==true)
				{
					macp.click_Logout();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(accountPage==true)
				{
					macp.click_Logout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
			
			} 
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("****Finished TC003_VerifyAccountLoginDataDrivenTest****");
		
	}
	
	
	
	
	
	
	
	
	
}
