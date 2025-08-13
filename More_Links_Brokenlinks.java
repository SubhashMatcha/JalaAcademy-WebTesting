package com.jalaTechnology;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class More_Links_Brokenlinks {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://magnus.jalatechnologies.com/");
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		
		
		 driver.findElement(By.linkText("More")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.linkText("Links")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.linkText("Broken Links")).click(); 
		 String Parent = driver.getWindowHandle();
		 
		 driver.findElement(By.linkText("Link 1")).click();
		 Set<String>Child1 = driver.getWindowHandles(); 
		 for (String Link1 : Child1) {
			 if(!Link1.equals(Parent)) {
				 driver.switchTo().window(Link1);
				 driver.manage().window().maximize();
				 Thread.sleep(2000);
				 driver.close();
			 }
			 
			 driver.switchTo().window(Parent);
			 Thread.sleep(2000);
		 }
		 
		 driver.findElement(By.linkText("Link 2")).click();
		 Set<String> Child2 = driver.getWindowHandles();
		 for(String Link2 : Child2) {
			 if(!Link2.equals(Parent)) {
				 driver.switchTo().window(Link2);
				 driver.manage().window().maximize();
				 Thread.sleep(2000);
				 driver.close();
			 }
			 
			 driver.switchTo().window(Parent);
			 Thread.sleep(2000);
		 }
		 
		 driver.findElement(By.linkText("Link 3")).click();
		 Set<String>Child3 = driver.getWindowHandles();
		 for(String Link3 : Child3) {
			 if(!Link3.equals(Parent)) {
				 driver.switchTo().window(Link3);
				 driver.manage().window().maximize();
				 Thread.sleep(2000);
				 driver.close();
			 }
			 
			 driver.switchTo().window(Parent);
			 Thread.sleep(5000);
		 }
		 
		 driver.quit();
	}

}
