package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commerceform.utilities.Staticwaits;

public class Jewelry {
	
	WebDriver driver;
	
	 public Jewelry(WebDriver driver) {
			this.driver = driver; 
		}
	 
	 
	 
	 
	 //locators
	 
	By jewelry = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']");
	 
	By addtocart = By.xpath("//div[@class='center-2']//div[3]//div[1]//div[2]//div[3]//div[2]//button[1]");
	
	
	//methods
	
	 public void jew() {
	  driver.findElement(jewelry).click();
	  Staticwaits.staticShortWait();
}
	 public void cart() { 
	 driver.findElement(addtocart).click();
	 Staticwaits.staticShortWait();	 
}
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
//	public void shopping() {
//		 driver.findElement(shoppingcart).click();
//		
//	}
//	
//	public void shop() {
//	 driver.findElement(By.xpath("//a[normalize-space()='shopping cart']")).click();

}
