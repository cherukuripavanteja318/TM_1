package Selenium;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM_HeadersVerification {
	public static void main(String[] args) throws InterruptedException {
		String a[] = { "Date", "Employee Name", "Leave Type", "Leave Balance (Days)", "Number of Days", "Status",
				"Comments", "Actions" };
		// launch app
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S3\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// logi into app
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
		driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
		driver.findElement(By.id("btnLogin")).click();
		// navigate and click on my leave
		Actions act_leave = new Actions(driver);
		WebElement leave = driver.findElement(By.id("menu_leave_viewLeaveModule"));
		act_leave.moveToElement(leave).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
		// Table headers handling
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 1; i <= a.length; i++) {
			WebElement header = driver.findElement(By.xpath("//table[@id='resultTable']/thead/tr[1]/th[" + i + "]"));
			String text = header.getText();
			if(a[i-1].equals(text))
				System.out.println(i+"."+"is same as " + a[i-1]);
			else
				System.out.println(i+"."+"is not as "+a[i-1]);
		
		 }	
			// list.add(text);
		
		/*
		 * for (int i = 0; i < list.size(); i++) {
		 *  if (a[i].equals(list.get(i)))
		 * { 
		 * System.out.println(list.get(i) + "is same as " + a[i]); } 
		 * else {
		 * System.out.println(list.get(i) + " not same as " + a[i]); }
		 */
		driver.close();
	}

}
