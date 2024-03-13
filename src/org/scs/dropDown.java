package org.scs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropDown {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Robot\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
//		d.get("https://adactinhotelapp.com/");
//		
//		WebElement user = d.findElement(By.id("username"));
//		user.sendKeys("swethap62");
//		 WebElement pass =d.findElement(By.name("password"));
//		 pass.sendKeys("Swetha@98");
//		 
//		 WebElement clk=d.findElement(By.name("login"));
//		 clk.click();
		
		d.get("https://adactinhotelapp.com/BookHotel.php");
		d.manage().window().maximize();
//		
		 
		
		TakesScreenshot ts=(TakesScreenshot)d;
		
		File i = ts.getScreenshotAs(OutputType.FILE);
		
		File p=new File("C:\\Users\\Public\\ScreenShot\\ScreenSHot\\hotel.png");
		
		FileUtils.copyFile(i, p);
	}
	
	

}
