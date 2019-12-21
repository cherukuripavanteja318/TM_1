package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class OrangeHRM_TableTextVerification {
	public static void main(String[] args) throws InterruptedException {
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
		// table names
		List<WebElement> row=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		int rowcunt=row.size();
		System.out.println(rowcunt);
		List<WebElement> column=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td"));
		int columncunt=column.size();
		System.out.println(columncunt);
		
		for (int i = 1; i <50; i++) {
			for (int j = 1; j < 8; j++) {
				WebElement cell = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[" + j + "]"));
				String s = cell.getText();
				String a = "Personal reason";
				if (s.equals(a)) {
					System.out.println(i + " row " +"-"+ j + " column consists of  " +a);
				}
			}
		}

		driver.close();

	}

}
