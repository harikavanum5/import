package commerceform.utilities;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Allure;

public class Screenshots {
	static WebDriver driver; 
	 public Screenshots(WebDriver driver) {
		this.driver=driver;
	}

	 public static void capture(WebDriver driver) throws IOException {
		 File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  Allure.addAttachment("Screenshot", FileUtils.openInputStream(screenshotAs));

			
//		  byte[] video = Files.readAllBytes(Paths.get("path/to/video.mp4"));
//		  Allure.addAttachment("Test Video", "video/mp4", "mp4", "video");
//		  	
		 }
//		 Allure.addAttachment(UUID.randomUUID().toString(),
//		 new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));

		 }

		
	

