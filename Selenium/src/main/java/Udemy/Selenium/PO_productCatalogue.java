package Udemy.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utility.Utility_1;

public class PO_productCatalogue extends Utility_1{

	WebDriver driver;
	public PO_productCatalogue(WebDriver driver)
	{super(driver);
		this.driver = driver;
		
	}
	
	@FindBy(css = ".mb-3")
	List <WebElement> products;
	// cssSelector(".ng-animating")
	
	@FindBy(css = ".ng-animating")
	WebElement loader;
	
	By productBy = By.cssSelector(".mb-3");
	By addtoCart = By.cssSelector(".card-body button:last-of-type");
	By toastmessage = By.id("toast-container");
	
	public List<WebElement> getProductList()
	{
		waitForElementToAppear(productBy);
		return products;
	}
//	public WebElement getproductbyname(String ProductName) {
		
	//	WebElement finalProduct = getProductList().stream().filter(product->
	//	 product.findElement(By.cssSelector("b")).getText().equals(ProductName)).findFirst().orElse(null);
		
	//	return finalProduct;
		// finalProduct.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		 
	
//	public void addproducttocart(String ProductName)
//	{
//		WebElement prod = getproductbyname(ProductName);
//		prod.findElement(addtoCart).click();
//		waitForElementToAppear(toastmessage);
//		waitForElementToDisappear(loader);
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

