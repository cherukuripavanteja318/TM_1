package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S3\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();;
		/*Verification*/
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/logi");
		driver.findElement(By.xpath("//img[@src='/hrm/symfony/web/webres_55a775cf9fcff8.50052456/themes/default/images/login/logo.png']")).isDisplayed();
		driver.findElement(By.xpath("//div[text()='LOGIN Panel']")).isDisplayed();
		driver.findElement(By.xpath("//div[@id='divUsername']")).isDisplayed();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).isDisplayed();
		driver.findElement(By.xpath("//input[@name='txtPassword']")).isDisplayed();
		driver.findElement(By.xpath("//input[@name='Submit']")).isDisplayed();
		/*Validation*/
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		/*Leave Page*/
		Thread.sleep(5000);
		driver.findElement(By.xpath("//b[text()='Leave']")).click();
		driver.findElement(By.xpath("//a[text()='Apply']")).click();
		
		driver.findElement(By.xpath("//h1[text()='Apply Leave']")).isDisplayed();
		driver.findElement(By.xpath("//a[text()='My Leave']")).click();
		driver.findElement(By.xpath("//a[text()='My Leave']")).isDisplayed();
	    
		//Entitlements
		driver.findElement(By.xpath("//a[text()='Entitlements']")).click();
		driver.findElement(By.xpath("//a[text()='My Entitlements']")).click();
		driver.findElement(By.xpath("//a[@class='toggle tiptip']")).isDisplayed();
		//Reports
		driver.findElement(By.xpath("//a[text()='Reports']")).click();
		driver.findElement(By.xpath("//a[text()='My Leave Entitlements and Usage Report']")).click();
		driver.findElement(By.xpath("//h1[text()='My Leave Entitlements and Usage Report']")).isDisplayed();
		
		//Time
		driver.findElement(By.xpath("//b[text()='Time']")).click();
		driver.findElement(By.xpath("//a[text()='Timesheets']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'My Timesheets')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h3[contains(text(),'Timesheet for Week')]")).isDisplayed();
		
		//Attendance
		driver.findElement(By.xpath("//a[text()='Attendance']")).click();
		driver.findElement(By.xpath("//a[text()='My Records']")).click();
		driver.findElement(By.xpath("//h1[text()='My Attendance Records']")).isDisplayed();
		
		//Punch Out
	
		driver.findElement(By.xpath("//a[text()='Attendance']")).click();
		driver.findElement(By.xpath("//a[text()='Punch In/Out']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[text()='Punch Out']")).isDisplayed();
		 
		//My Info
		
		driver.findElement(By.xpath("//b[text()='My Info']")).click();
		driver.findElement(By.xpath("//h1[text()='Personal Details']")).isDisplayed();
		driver.close();
		
}
}
