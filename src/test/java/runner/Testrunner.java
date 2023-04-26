package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions (features ="src/test/resources/Feature",glue= {"stepDefinition"},

	plugin = { "pretty",
			"html:target/HtmlReports.html",
			"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
			},
	monochrome = true)
	public class Testrunner {
}
