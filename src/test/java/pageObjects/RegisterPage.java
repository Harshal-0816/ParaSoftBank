package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
	
	//Constructor
	public RegisterPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Locators
	@FindBy (xpath="//input[@id='customer.firstName']") WebElement txt_firstName;
	@FindBy (xpath="//input[@id='customer.lastName']") WebElement txt_lastName;
	@FindBy (xpath="//input[@id='customer.address.street']") WebElement txt_address;
	@FindBy (xpath="//input[@id='customer.address.city']") WebElement txt_city;
	@FindBy (xpath="//input[@id='customer.address.state']") WebElement txt_state;
	@FindBy (xpath="//input[@id='customer.address.zipCode']") WebElement txt_zipCode;
	@FindBy (xpath="//input[@id='customer.phoneNumber']") WebElement txt_phoneNumber;
	@FindBy (xpath="//input[@id='customer.ssn']") WebElement txt_ssn;
	@FindBy (xpath="//input[@id='customer.username']") WebElement txt_setUserName;
	@FindBy (xpath="//input[@id='customer.password']") WebElement txt_setPassword;
	@FindBy (xpath="//input[@id='repeatedPassword']") WebElement txt_setConfirmPassword;
	@FindBy (xpath="//input[@value='Register']") WebElement btn_Register;
	@FindBy (xpath="//p[text()='Your account was created successfully. You are now logged in.']") WebElement confirmationMessage;
	
	//ActionMethods
	
	public void setFirstName(String firstname)
	{
		txt_firstName.sendKeys(firstname);
	}
	
	public void setLastName(String lastname)
	{
		txt_lastName.sendKeys(lastname);
	}
	
	public void setAddress(String address)
	{
		txt_address.sendKeys(address);
	}
	
	public void setCity(String city)
	{
		txt_city.sendKeys(city);
	}
	
	public void setState(String state)
	{
		txt_state.sendKeys(state);
	}
	
	public void setZipCode(String zipcode)
	{
		txt_zipCode.sendKeys(zipcode);
	}
	
	public void setPhoneNumber(String phonenumber)
	{
		txt_phoneNumber.sendKeys(phonenumber);
	}
	
	public void setSSN(String ssn)
	{
		txt_ssn.sendKeys(ssn);
	}
	
	public void setUserName(String username)
	{
		txt_setUserName.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		txt_setPassword.sendKeys(password);
	}
	
	public void setConfirmPassword(String confirmpassword)
	{
		txt_setConfirmPassword.sendKeys(confirmpassword);
	}
	
	public void click_on_Register()
	{
		btn_Register.click();
	}
	
	
	
	public String getConfirmationMessage()
	{
		try 
		{
			return (confirmationMessage.getText());
		} 
		catch (Exception e)
		{
			return (e.getMessage());
		}
	}
	
	
	
}
