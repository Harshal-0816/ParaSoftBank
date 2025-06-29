package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC001_VerifyAccountRegistrationTest extends BaseClass{

	@Test(groups= {"Sanity","Master"})
	public void verify_account_Registration()
	{
		logger.info("****Started TC001_VerifyAccountRegistrationTest****");
		logger.debug("This is a debug log message");
		
		try
		{
		HomePage hp = new HomePage(driver);
		hp.click_link_Register();
		logger.info("Clicked on Register Link");
		
		RegisterPage rp = new RegisterPage(driver);
		rp.setFirstName(randomString().toUpperCase());
		rp.setLastName(randomString().toUpperCase());
		rp.setAddress(randomString().toUpperCase());
		rp.setCity(randomString().toUpperCase());
		rp.setState(randomString().toUpperCase());
		rp.setZipCode(randomZipCode());
		rp.setPhoneNumber(randomNumber());
		rp.setSSN(randomNumber());
		rp.setUserName(randomAlphaNumeric().toUpperCase());
		
		String pwd= randomAlphaNumeric();
		
		rp.setPassword(pwd);
		rp.setConfirmPassword(pwd);
		rp.click_on_Register();
		logger.info("Clicked on Register Button");
		
		logger.info("Validating the Confirmation Message");
		String cnf_msg=rp.getConfirmationMessage();
		Assert.assertEquals(cnf_msg, "Your account was created successfully. You are now logged in.");
		
		logger.info("Test Passed");
		}
		catch (Exception e)
		{
			logger.error("Test failed: " + e.getMessage());
			Assert.fail("Test failed: " + e.getMessage());
		}
		finally 
		{
		logger.info("***** Finished TC001_AccountRegistrationTest *****");
		}
	
	}
	
	
}
