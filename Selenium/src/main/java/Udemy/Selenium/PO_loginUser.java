package Udemy.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utility_1;

public class PO_loginUser extends Utility_1 {
	
	WebDriver driver;
	
	public PO_loginUser(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="userEmail")
	WebElement userEmail;
	@FindBy(id="userPassword")
	WebElement userPass;
	@FindBy(id="login")
	WebElement login;
	
	
	public void loginApp(String email,String password)
	{
	userEmail.sendKeys(email);
	userPass.sendKeys(password);
	login.click();
	}
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client/");
	}
	
	

}
