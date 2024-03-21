package Udemy.Selenium;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class rs_Login {

	
	
public static void main(String[] args) {
	
	//System.setProperty("","");
	String prdct = "ZARA COAT 3";
WebDriver driver = new ChromeDriver();
List<WebElement> e=driver.findElements(By.xpath(""));
//driver.get("https://www.google.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
PO_loginUser loginPage = new PO_loginUser(driver);
loginPage.goTo();
driver.manage().window().maximize();

loginPage.loginApp("sumitplasma@gmail.com", "Plasma1!");

PO_productCatalogue productcatalogue = new PO_productCatalogue(driver);
driver.findElement(By.cssSelector(prdct));
List<WebElement> productlist = productcatalogue.getProductList();
productcatalogue.addproducttocart(prdct);

 driver.findElement(By.xpath("//button[@routerlink = '/dashboard/cart']")).click();
 
 List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
 Boolean match = cartProducts.stream().anyMatch(cartProduct-> cartProduct.getText().equalsIgnoreCase(prdct));
 Assert.assertTrue(match);
 driver.findElement(By.cssSelector(".totalRow button")).click();
 
 Actions a = new Actions(driver);
 a.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Select Country']")), "india").build().perform();
// wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".form-group .ta-results"))));
 driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
 driver.findElement(By.cssSelector(".action__submit ")).click();
 String confirmation = driver.findElement(By.cssSelector(".hero-primary")).getText();
 //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".hero-primary")));
 Assert.assertTrue(confirmation.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
 
 driver.quit();
 
 
 
  


/*
 * System.out.println(listProduct.size());
 * for (int i = 0; i<listProduct.size();i++) { String productName =
 * listProduct.get(i).findElement(By.cssSelector("b")).getText(); if
 * (productName.equalsIgnoreCase("ZARA COAT 3")) {
 * listProduct.get(i).findElement(By.
 * cssSelector(".card-body button:last-of-type")).click(); } else {
 * System.out.println("No prouduct found"); }
 * 
 * 
 * 
 * }
 */
  
 
//System.out.println(driver);
	
	
	
}

}
