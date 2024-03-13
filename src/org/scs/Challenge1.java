package org.scs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
;

public class Challenge1 {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Robot\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://adactinhotelapp.com/");
		d.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)d;
		WebElement user = d.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','swethap62')",user);
		WebElement pass = d.findElement(By.name("password"));
		js.executeScript("arguments[0].setAttribute('value','Swetha@98')", pass);
		WebElement clk = d.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", clk);
				
		
	
	}}
		
		
		
		
		
		
		
//		WebElement course = d.findElement(By.xpath("//h1[text()='Top courses']"));
//		
//		js.executeScript("arguments[0].scrollIntoView(true)", course);
//		
//	}}		
//		
		
		
		
		
//		WebElement mail = d.findElement(By.id("email"));
//		js.executeScript("arguments[0].setAttribute('value','Swethaprati@gmail.com')",mail);
//		WebElement passwrd = d.findElement(By.name("pass"));
//		js.executeScript("arguments[0].setAttribute('value','12345678')", passwrd);
//		WebElement log = d.findElement(By.name("login"));
//		js.executeScript("arguments[0].click()", log);
//		
//		
//		
//	}
//
//}
