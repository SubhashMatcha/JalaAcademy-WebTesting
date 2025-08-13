package com.jalaTechnology;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class More_MenuTesting {

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
		 
		 driver.findElement(By.linkText("Menu")).click();
		 Thread.sleep(2000);
//	 
		 driver.findElement(By.id("b1")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);
		
		driver.findElement(By.id("b2")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);
		
		driver.findElement(By.id("b3")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);
		
		driver.findElement(By.id("b4")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);
		
		 driver.findElement(By.linkText("Sub Menus")).click();
		
		By TestingProperty = By.linkText("Testing");
		WebElement Testing = driver.findElement(TestingProperty);
		 System.out.println(" * "+Testing.getText()+" * ");
		
		Actions Testingaction = new Actions(driver);
		Testingaction.moveToElement(Testing).build().perform();
		
		driver.findElement(By.id("selbtn")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);
		
		driver.findElement(By.id("manualbtn")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);
		
		driver.findElement(By.id("dbbtn")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);
		
		driver.findElement(By.id("unitbtn")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);
		
		
		By JavaProperty = By.linkText("JAVA");
		WebElement Java = driver.findElement(JavaProperty);
		 System.out.println(" * " +Java.getText()+" * ");
		
		Actions JavaAction = new Actions(driver);
		JavaAction.moveToElement(Java).build().perform();
		
		driver.findElement(By.id("advjavabtn")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);
		
		driver.findElement(By.id("corejavabtn")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);
		
		driver.findElement(By.id("springbtn")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);
		
		driver.findElement(By.id("hibernatebtn")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);
		
		By NetProperty = By.linkText(".Net");
		WebElement Net = driver.findElement(NetProperty);
		 System.out.println(" * " +Net.getText()+" * ");
		
		Actions NetAction = new Actions(driver);
		NetAction.moveToElement(Net).build().perform();
		
		driver.findElement(By.id("cbtn")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);
		
		driver.findElement(By.id("aspbtn")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);
		
		driver.findElement(By.id("adobtn")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);
		
		driver.findElement(By.id("mvcbtn")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);

		By DataBaseProperty = By.linkText("Database");
		WebElement DataBase = driver.findElement(DataBaseProperty);
		 System.out.println(" * " +DataBase.getText()+" * ");
		
		Actions DataBaseAction = new Actions(driver);
		DataBaseAction.moveToElement(DataBase).build().perform();
		
		driver.findElement(By.id("sqlbtn")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);
		
		driver.findElement(By.id("mysqlbtn")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);
		
		driver.findElement(By.id("oraclebtn")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);
		
		driver.findElement(By.id("h2btn")).click();
		 System.out.println(driver.switchTo().activeElement().getText());
		Thread.sleep(1000);
		
		driver.quit();
		}

}
