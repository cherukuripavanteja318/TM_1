package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverEx {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver","D:\\PavanSelenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver.get("https://selenium.dev/");
		

	}

}
