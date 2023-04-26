package commerceform.utilities;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.qameta.allure.Allure;

public class Highlight {
	WebDriver driver;

	public Highlight(WebDriver driver) {
		this.driver=driver;
	
	}
	
	

	public void high() throws IOException {
	WebElement progress=driver.findElement(By.xpath("//a[normalize-space()='Register']"));

	if(progress.isDisplayed()){
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
    jsExecutor.executeScript("arguments[0].style.border='2px solid red'",progress);    
	System.out.println("progress image is displayed");
	}
	else {
		System.out.println("progress image is not displayed");
		Staticwaits. staticShortWait();
    }
	}


	public void high1() throws IOException {
    WebElement progress=driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
 
		if(progress.isDisplayed()){
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	    jsExecutor.executeScript("arguments[0].style.border='2px solid red'",progress);    
		System.out.println("progress image is displayed");
    }
		else {
			System.out.println("progress image is not displayed");
			Staticwaits. staticShortWait();
	}
	}
	


	public void high3() throws IOException {
    WebElement progress=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']"));
 
     if(progress.isDisplayed()){
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	jsExecutor.executeScript("arguments[0].style.border='2px solid red'",progress);    
	System.out.println("progress image is displayed");
	}
	else {
	System.out.println("progress image is not displayed");
    Staticwaits. staticShortWait();
		
	}
}

	public void high4() throws IOException {
	    WebElement progress=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Shoes']	"));
	 
	     if(progress.isDisplayed()){
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'",progress);    
		System.out.println("progress image is displayed");
		}
		else {
		System.out.println("progress image is not displayed");
	    Staticwaits. staticShortWait();
			
		}
	}
	public void sho() throws IOException {
	    WebElement progress=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']"));
	 
	     if(progress.isDisplayed()){
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'",progress);    
		System.out.println("progress image is displayed");
		}
		else {
		System.out.println("progress image is not displayed");
	    Staticwaits. staticShortWait();
			
		}
	     }	
	}


