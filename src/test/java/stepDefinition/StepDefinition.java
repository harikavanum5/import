package stepDefinition;




import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import commerceform.utilities.Dropdowns;
import commerceform.utilities.Highlight;

import commerceform.utilities.Screenshots;
import commerceform.utilities.Staticwaits;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import io.qameta.allure.AllureLifecycle;
import multiplebrowsers.browsers;
import pom.Apparelmodule;
import pom.Jewelry;
import pom.Loginpage;

import pom.Registrationpage;
import recordingtests.ScreenRecorderUtil;

import org.junit.After;
import org.junit.Before;
import org.monte.screenrecorder.ScreenRecorder;

public class StepDefinition {
	
public WebDriver driver;

//WebDriver driver;
//@Parameters("browser")
//@Test


@Given("open the browser")
public void open_the_browser() throws Exception {

	
	ScreenRecorderUtil.startRecord("open_the_browser");

System.setProperty("webdriver.chrome.driver","C:/Users/hvanum/Downloads/chromedriver_win32 (6)://chromedriver.exe");
	 ChromeOptions options = new ChromeOptions();
       options.addArguments("--remote-allow-origins=*");
      driver = new ChromeDriver(options);
     
     // driver = new ChromeDriver();



@When("user enter the url {string}")
public void user_enter_the_url(String string) throws IOException{
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	Screenshots.capture(driver);
}


@Then("click on the Register")
public void click_on_the_register() throws IOException{
	Highlight h = new Highlight(driver);
	h.high();
	Screenshots.capture(driver);
Registrationpage rp=new Registrationpage(driver);
    rp.Register();
	Screenshots.capture(driver);
}


@When("click on the Gender")
public void click_on_the_gender() throws IOException{
	Registrationpage rp=new Registrationpage(driver);
	 rp.gender();
	 Screenshots.capture(driver);
	
}

@Then("Enter a Firstname  {string}")
public void enter_a_firstname(String string) throws Exception{

	Registrationpage rp=new Registrationpage(driver);
	 rp.firstname(string);
	 Screenshots.capture(driver);
}

@When("enter a Lastname {string}")
public void enter_a_lastname(String string) throws IOException{
	Registrationpage rp=new Registrationpage(driver);
	 rp.lastname(string);
	 Screenshots.capture(driver);

}
@Then("enter a dob {string}")
public void enter_a_dob(String string) throws IOException{
	Dropdowns e = new Dropdowns(driver);
	e.dof();
	Staticwaits. staticShortWait();
	e.mon();
	Staticwaits. staticShortWait();
	e.year();
	 Screenshots.capture(driver);
	 Staticwaits. staticShortWait();
}

@Then("Enter a Email {string}")
public void enter_a_email(String string) throws IOException{
	Registrationpage rp=new Registrationpage(driver);
	 rp.mail(string);
	 rp.cname(string);
	 Screenshots.capture(driver);
}

@When("enter the Password\"<password>\"")
public void enter_the_password_password1() throws IOException{
	Registrationpage rp=new Registrationpage(driver);
	 rp.password(null);
	 Screenshots.capture(driver);
}

@Then("Enter a  ConfirmPassword {string}")
public void enter_a_confirm_password(String string) throws IOException{
	Registrationpage rp=new Registrationpage(driver);
	 rp.confirmpassword(null);
	 Screenshots.capture(driver);
	 
}

@When("click on a Register button")
public void click_on_a_register_button() throws IOException{
	Registrationpage rp=new Registrationpage(driver);
	 rp.Registerbutton();
	 Screenshots.capture(driver);
	// rp.loginTest();
}

@Then("click on the Login")
public void click_on_the_login() throws IOException{
	
Loginpage rp=new Loginpage(driver);
rp.login();
Staticwaits. staticShortWait();
Highlight h1 = new Highlight(driver);
h1.high1();
Screenshots.capture(driver);
Staticwaits. staticShortWait();
}

@When("enter the email\"<email>\"")
public void enter_the_email_email() throws IOException{
Loginpage rp=new Loginpage(driver);
rp.loginEmail(null);
Screenshots.capture(driver);
Staticwaits. staticShortWait();

}

@When("enter the password\"<password>\"")
public void enter_the_password_password() throws IOException{ 
Loginpage rp=new Loginpage(driver);
rp.loginP(null);
Screenshots.capture(driver);
Staticwaits. staticShortWait();
}

@Then("click on the login button")
public void click_on_the_login_button() throws Exception{
Loginpage rp=new Loginpage(driver);
rp.log();
Screenshots.capture(driver);
Staticwaits. staticShortWait();
}
    
@When("click apparelmodule")
public void click_apparelmodule() throws IOException {

Apparelmodule r = new Apparelmodule(driver);
Highlight h2 = new Highlight(driver);
h2.high3();
Screenshots.capture(driver);
r.app();
Staticwaits. staticShortWait();
Screenshots.capture(driver);
}
@When("click on addtocart")
public void click_on_addtocart() throws IOException {

Apparelmodule r = new Apparelmodule(driver);
r.app1();
Staticwaits. staticShortWait();
Screenshots.capture(driver);
}

@Then("click jewllery")
public void click_jewllery() throws IOException {

Jewelry click = new Jewelry(driver);
Staticwaits. staticShortWait();
Screenshots.capture(driver);

Highlight h3 = new Highlight(driver);
h3.sho();
Screenshots.capture(driver);

Staticwaits. staticShortWait();

}
@When("click on add to cart")
public void click_on_add_to_cart() throws Exception {
	Jewelry click = new Jewelry(driver);
	click.jew();
	Screenshots.capture(driver);
	Staticwaits. staticShortWait();
	click.cart();
	Screenshots.capture(driver);
	
	ScreenRecorderUtil.stopRecord();
	

		
	
}

	
}
	
	

	
	
	
	
	//click.shopping();
	//click.shop();
	//
	//System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
//WebDriver driver = new FirefoxDriver();
	//headless
	//ChromeOptions options = new ChromeOptions();
//		options.addArguments("headless");
	//driver = new ChromeDriver(options);
	
//	
//	
//	
//}





