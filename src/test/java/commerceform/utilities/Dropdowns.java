package commerceform.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	WebDriver driver;

	public Dropdowns(WebDriver driver) {
		this.driver = driver; 
	}
	public void dof() {
		WebElement sortby=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		 Select sc=new Select(sortby);
		 sc.selectByIndex(5);
		 
	}
	public void mon() {
		
		
	WebElement sortby=driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		 Select sc=new Select(sortby);
		 sc.selectByIndex(8);
		 
	}
	public void year() {
		WebElement sortby=driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
		 Select sc=new Select(sortby);
		 sc.selectByIndex(89);
             
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//select[@id='products-orderby']

//	public void sortby() {
//		WebElement sortby=driver.findElement(By.xpath("//select[@id='product_attribute_9']]"));
//		 Select sc=new Select(sortby);
//		 sc.selectByIndex(4);
//	}
//	public void sortby() {
//		WebElement sortby=driver.findElement(By.xpath("//select[@id='product_attribute_9']]"));
//		 Select sc=new Select(sortby);
//		 sc.selectByIndex(2);
//		
//	}
	
//	public void size12() {
//		WebElement sortby=driver.findElement(By.xpath("//select[@id='product_attribute_6']"));
//		 Select sc=new Select(sortby);
//		 sc.selectByIndex(4);
//	}
//	
//	

	//select[@id='product_attribute_6']


//	public void display() {
//		 WebElement sortby=driver.findElement(By.xpath("//select[@id='products-orderby']"));
//		 Select sc=new Select(sortby);
//		 sc.selectByIndex(2);
//	}
////
//	public void size() {
//		 WebElement sortby=driver.findElement(By.xpath("//select[@id='products-pagesize']"));
//		 Select sc=new Select(sortby);
//		 sc.selectByIndex(2);
//	
//	}
//	
//	public void dis1() {
//		WebElement sortby=driver.findElement(By.xpath("#rental_start_date_40"));
//		 Select sc=new Select(sortby);
//		 sc.selectByIndex(5);
//
//		
//	}
}
		
	
		
	

