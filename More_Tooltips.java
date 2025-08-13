package com.jalaTechnology;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class More_Tooltips {

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
		 
		 driver.findElement(By.linkText("Tooltips")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("btnTooltip")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		 

	}

}
