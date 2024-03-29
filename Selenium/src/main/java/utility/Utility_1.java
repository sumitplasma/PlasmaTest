package utility;

import java.time.Duration;
import org.testng.SkipException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility_1 {

	WebDriver driver;
	public Utility_1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void waitForElementToAppear(By Findby)
	{
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	 wait.until(ExpectedConditions.visibilityOfElementLocated((Findby)));
	}
	public void waitForElementToDisappear(WebElement Ele)
	{
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	 wait.until(ExpectedConditions.invisibilityOf(Ele));
	}
	
	
	public static void testStatus(String status)
	{
		if(status.equalsIgnoreCase("skip"))
		{
			throw new SkipException("Skipped");
		}
	}
	
	public static void test1(String status)
	{
		testStatus(status);
	}
}
