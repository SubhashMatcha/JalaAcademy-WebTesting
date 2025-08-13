package com.jalaTechnology;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class More_Popups {

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

			String parent = driver.getWindowHandle();
			System.out.println("parentwindow -" +parent + driver.getTitle());
		 
		 driver.findElement(By.id("btn-one")).click();
		 Set<String> Child=driver.getWindowHandles();
			for (String child : Child) {
				if (!child.equals(parent)) {
					driver.switchTo().window(child);	
					driver.manage().window().maximize();
					driver.close();
	}
				driver.switchTo().window(parent);
			}
	
	
		driver.findElement(By.id("btn-two")).click();
		Set<String> Handle = driver.getWindowHandles();
		 	for (String handle : Handle) {
		 		if(!handle.equals(parent)) {
		 			driver.switchTo().window(handle);
		 			driver.manage().window().maximize();
		 			driver.close();
		 		}
		 		
		 		driver.switchTo().window(parent);
		 	}
			
		 	driver.findElement(By.id("btn-three")).click();
		 	Set<String> PopupHandle = driver.getWindowHandles();
		 	for(String popuphandle : PopupHandle) {
		 		if(!popuphandle.equals(parent)){
		 			driver.switchTo().window(popuphandle);
		 			driver.manage().window().maximize();
		 			driver.close();
		 		}
		 		driver.switchTo().window(parent);
		 		Thread.sleep(3000);
		 	}
		 		driver.quit();
	}
}

