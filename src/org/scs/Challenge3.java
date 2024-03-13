package org.scs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge3 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\ScreenShot\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		
		d.manage().window().maximize();
		
		TakesScreenshot i= (TakesScreenshot)d;
		
		File j=i.getScreenshotAs(OutputType.FILE);
		
		File p=new File("C:\\Users\\Public\\ScreenShot\\ScreenSHot\\flip.png");
		
		FileUtils.copyFile(j, p);
	}

}
