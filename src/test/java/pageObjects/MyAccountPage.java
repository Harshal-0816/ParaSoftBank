package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	//Constructor
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	//Locators
	@FindBy (xpath="//b[text()='Welcome']") WebElement msgHeading;
	@FindBy (xpath="//a[text()='Log Out']") WebElement btn_Logout;
	
	//ActionMethods
	
	public boolean isAccountOverviewPageExists()
	{
		try
		{
		return msgHeading.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void click_Logout()
	{
		btn_Logout.click();
	}
	
}
