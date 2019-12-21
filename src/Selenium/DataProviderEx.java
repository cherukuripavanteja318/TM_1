package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;





public class DataProviderEx {
	
	@Test(dataProvider="dataToLogIn")
	public void loginHRM(String uid,String pass){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S3\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// login into app
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		driver.findElement(By.id("btnLogin")).click();
		String s=driver.findElement(By.xpath("//h1[text()='Dashboard']")).getText();
		Assert.assertTrue(s.equals("Dashboard"), "unable to log in with these credentils");
		System.out.println(s);
		System.out.println("user able to loginto the application successfully");
		
		driver.close();
		
		
	}
	
	@DataProvider(name="dataToLogIn")
	public Object[][] setData(){
		Object [][] data={{"user02","TM1234"},{"user01","TM123"}};
		return data;
	}

}
