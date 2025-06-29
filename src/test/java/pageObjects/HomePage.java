package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	//Constructor
	public HomePage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	//Locators
	@FindBy (xpath="//a[text()='Register']") WebElement lnk_Register;
	@FindBy (xpath="//input[@name='username']") WebElement txt_Username;
	@FindBy (xpath="//input[@name='password']") WebElement txt_Password;
	@FindBy (xpath="//input[@value='Log In']") WebElement btn_Login;
	
	//ActionMethods
	public void click_link_Register()
	{
		lnk_Register.click();
	}

	public void setUsername(String username)
	{
		txt_Username.sendKeys(username);
	}

	public void setPassword(String password)
	{
		txt_Password.sendKeys(password);
	}
	
	public void click_Login()
	{
		btn_Login.click();
	}
}
