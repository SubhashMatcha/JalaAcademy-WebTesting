package com.jalaTechnology;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage_Test {

	public static void main(String[] args) throws Exception {
		
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
		Thread.sleep(10000);
//
		
		By HomePageProperty = By.linkText("Home");
		WebElement HomePage = driver.findElement(HomePageProperty);
		HomePage.click();
		
		String expectedHomePageUrlAddress = "magnus.jalatechnologies.com";
		System.out.println("expected Homepageurl " +expectedHomePageUrlAddress);
		
		String actualHomepageUrlAddress = driver.getCurrentUrl();
		System.out.println("actual HomepageUrl " +actualHomepageUrlAddress);
		
		if (expectedHomePageUrlAddress==actualHomepageUrlAddress) {
			System.out.println("Pass");
			
		}
		else {
			System.out.println("Fail");
		}
		driver.quit();
	}


	}


