package com.dialog.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanschelvenk\\Desktop\\Selenium\\updated\\chromedriver_win32\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open Dialog page
		driver.get("https://www.dialog.com.au/");
		 
		// Maximize browser
		 
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Contact']")).click();
		driver.findElement(By.name("fields[name]")).sendKeys("suja");
		driver.findElement(By.name("fields[address]")).sendKeys("srisuja@gmail.com");
		driver.findElement(By.name("fields[phone]")).sendKeys("0468322929");
		driver.findElement(By.name("fields[full-message]")).sendKeys("dilog website registration details");
		driver.findElement(By.id("submit")).click();
		
		
		
		

	}

}
