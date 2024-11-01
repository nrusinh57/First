package testutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.Baseclass;

public class Testutility extends Baseclass {

	public void  getscreenshot() throws IOException {
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  	FileUtils.copyFileToDirectory(screenshotFile, new File(".//screenshot/screen.png"));
	}
}
