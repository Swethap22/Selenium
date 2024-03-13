package org.scs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Robot\\Drivers\\chromedriver.exe");
			
			WebDriver d=new ChromeDriver();
			
			d.get("https://www.amazon.in/");
			d.manage().window().maximize();
			TakesScreenshot ts=(TakesScreenshot)d;
			
			File i=ts.getScreenshotAs(OutputType.FILE);
			
			File p=new File("C:\\Users\\Public\\ScreenShot\\ScreenSHo\\amz.png");
			
			FileUtils.copyFile(i, p);

}}
