package multiplebrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsers {
	
public void browser1() {
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	driver = new ChromeDriver();

	//System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
	//driver = new EdgeDriver();

//		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
//		 driver= new FirefoxDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
}

}