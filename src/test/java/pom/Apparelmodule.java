package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import commerceform.utilities.Staticwaits;

public class Apparelmodule {

	WebDriver driver;
	//Staticwaits page1 = new Staticwaits();
  public Apparelmodule(WebDriver driver) {
		this.driver = driver; 
	}
  
   
  
  By apparel = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']");
  By Shoes = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Shoes']");
  By selectshoe = By.xpath("//div[@class='center-2']//div[3]//div[1]//div[2]//div[3]//div[2]//button[1]");
  By addtocart = By.xpath("//span[@class='cart-label']"); 
  By gotocart = By.xpath("//button[normalize-space()='Go to cart']");
  By termsofservice = By.xpath("//input[@id='termsofservice']");
  By checkbutton = By.xpath("//button[@id='checkout']");
  
  
 

 public void app() {
WebElement app = driver.findElement(apparel);
Actions action = new Actions(driver);
action.moveToElement(app).perform();
Staticwaits. staticShortWait();
		
		
driver.findElement(Shoes).click();
Staticwaits. staticShortWait();
	
driver.findElement(selectshoe).click();
Staticwaits. staticShortWait();

}
public void app1() {
WebElement app1 = driver.findElement(addtocart);
//new WebDriverWait(driver, 20).until(ExpectedConditions.titleIs("Execute Automation"));
Staticwaits. staticShortWait();
Actions action = new Actions(driver);
action.moveToElement(app1).perform();
Staticwaits. staticShortWait();

driver.findElement(gotocart).click();
Staticwaits. staticShortWait();
driver.findElement(termsofservice).click();
Staticwaits. staticShortWait();
driver.findElement(checkbutton).click();
Staticwaits. staticShortWait();
}
public void high3() {
	
	
}


































//public void app11() {
//WebElement app11 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']"));
//Actions action1 = new Actions(driver);
//action1.moveToElement(app11).perform();
//Staticwaits. staticShortWait();
//driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Clothing']")).click();
//driver.findElement(By.xpath("//div[@class='products-wrapper']//div[2]//div[1]//div[2]//div[3]//div[2]//button[1]")).click();
//driver.findElement(By.xpath("//a[normalize-space()='shopping cart']")).click();

			}



//public void app3() {
//	WebElement app3 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']"));
//	Actions action1 = new Actions(driver);
//	action1.moveToElement(app3).perform();
//	page1. staticShortWait();
			
	









	
	
	
	
	


	
	

