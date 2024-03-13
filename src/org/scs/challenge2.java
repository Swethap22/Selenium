package org.scs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class challenge2 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Robot\\Drivers\\chromedriver.exe");
			
			WebDriver d=new ChromeDriver();
			
			d.get("https://www.inmakeslh.in/");
			d.manage().window().maximize();
			
			TakesScreenshot ts= (TakesScreenshot)d;
			
			File pic=ts.getScreenshotAs(OutputType.FILE);
			
			File img=new File("C:\\Users\\Public\\ScreenShot\\ScreenSHot\\inmakes.png");
			
			FileUtils.copyFile(pic,img);
			

}}
