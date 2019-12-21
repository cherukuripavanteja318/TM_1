package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryToursRegistation_CountryDropDownIndiaSelection {

	public static void main(String[] args) {
		// launching browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S3\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// clicking on registration link
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		// getting text from dropdown
		Select country = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		List<WebElement> opt = country.getOptions();
		// System.out.println(opt);
		System.out.println("Number of elements (countries) in dropdown :" + opt.size());

		for (WebElement web : opt) {
			System.out.println(web.getText());
			String a = "INDIA";
			if (web.getText().contains(a)) {
				country.selectByVisibleText(a);
			}
		}
		driver.close();
	}
}
