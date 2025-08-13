package com.jalaTechnology;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateEmployee_Details {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://magnus.jalatechnologies.com/");
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Employee")).click();
		
		
		driver.findElement(By.linkText("Create")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("Subash");
		driver.findElement(By.id("LastName")).sendKeys("marc");
		driver.findElement(By.id("EmailId")).sendKeys("subbu19164@gmail.com");
		driver.findElement(By.id("MobileNo")).sendKeys("8743129061");
		driver.findElement(By.id("DOB")).sendKeys("06/08/2002");
		driver.findElement(By.id("rdbMale")).click();
		
		By selectdropdownproperty = By.id("CountryId");
		WebElement selectdropdown = driver.findElement(selectdropdownproperty);
//		
		driver.findElement(By.xpath("//*[@id=\"CountryId\"]/option[6]")).click();
			
		driver.findElement(By.xpath("//*[@id=\"frmEmployee\"]/div[2]/button")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("Name")).sendKeys("Subash");
		driver.findElement(By.id("btnSearch")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("btnClear")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("MobileNo")).sendKeys("8743129061");
		driver.findElement(By.id("btnSearch")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("btnClear")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
	}
	

}
