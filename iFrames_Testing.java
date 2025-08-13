package com.jalaTechnology;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrames_Testing {

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
		 
		 driver.findElement(By.linkText("iFrames")).click();
				 
		 driver.switchTo().frame("iframe1");
		 Thread.sleep(2000);
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame("iframe2");
		 driver.findElement(By.className("sidebar-toggle")).click();
		 
		 driver.findElement(By.linkText("Employee")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Home")).click();
		 Thread.sleep(3000);
		 driver.switchTo().defaultContent();
		 Thread.sleep(4000);
		 
		 driver.findElement(By.className("fa-sign-out")).click();
		 
	}

}
