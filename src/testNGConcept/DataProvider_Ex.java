package testNGConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Ex {
	WebDriver driver = null;

	@BeforeMethod
	public void LaunchApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S3\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}

	@Test(dataProvider = "getdata")
	public void facebook_Search(String id, String name) throws InterruptedException {
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys(id);

		Thread.sleep(2000);
		String Appvalue = ele.getAttribute("valve");
		ele.clear();
		Assert.assertTrue(Appvalue.contentEquals(name), "mismatch");
		System.out.println("google Search execution is completed");
	}

	@DataProvider(name = "getdata")
	public Object[][] m1() {
		return new Object[][] { { "kumar", "INDIA" }, { "mandalapu", "UK" } };

	}

}
