package com.jalaTechnology;

import org.apache.poi.ss.formula.ThreeDEval;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jalatechnology_LoginTest {
	
	public static void main (String[] arg) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://magnus.jalatechnologies.com/");
		
		String expectedmagnusHomepageurladdress = "Jala Academy";
		System.out.println("expected jalaacademy url" +expectedmagnusHomepageurladdress);
		
		String actualmagnushomepageurladdress = driver.getCurrentUrl();
		System.out.println("actual jalaacademy url" +actualmagnushomepageurladdress);
		
		if (expectedmagnusHomepageurladdress.equals(actualmagnushomepageurladdress)) {
			System.out.println("this url is matched - Pass");
		}
		else {
			System.out.println("this url is notmatched - fail");
		}
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.quit();
	}

}
