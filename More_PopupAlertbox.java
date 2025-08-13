package com.jalaTechnology;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class More_PopupAlertbox {

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
		 
		 driver.findElement(By.linkText("Popups")).click();
		 Thread.sleep(1000);
		 
		 //AlertBox
		 driver.findElement(By.id("alertBox")).click();
		 System.out.println(driver.switchTo().alert().getText());
		 driver.switchTo().alert().accept();
		 Thread.sleep(1000);
		
		 //ConformBox
		 driver.findElement(By.id("confirmBox")).click();
		 System.out.println(driver.switchTo().alert().getText());
		 Thread.sleep(1000);
		 driver.switchTo().alert().accept();
		 driver.findElement(By.id("confirmBox")).click();
		 System.out.println(driver.switchTo().alert().getText());
		 Thread.sleep(1000);
		 driver.switchTo().alert().dismiss();
		 
		 //PromptBox
		 driver.findElement(By.id("promptBtn")).click();
		 System.out.println(driver.switchTo().alert().getText());
		 driver.switchTo().alert().sendKeys("Subash TestEngineer");
		 Thread.sleep(1000);
		 driver.switchTo().alert().accept();
		 driver.findElement(By.id("promptBtn")).click();
		 System.out.println(driver.switchTo().alert().getText());
		 Thread.sleep(1000);
		 driver.switchTo().alert().dismiss();
		 
		 //#tab_4 > div.alert.alert-success

		 
	}

}
