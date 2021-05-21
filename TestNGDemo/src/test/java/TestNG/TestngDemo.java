package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {

	WebDriver driver = null;

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\DemoProject_Capgemini\\TestNGDemo\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void automate() {

		driver.get("https://www.google.com/");
		WebElement googleSearch = driver.findElement(By.name("q"));
		googleSearch.sendKeys("Selenium Tutorial");
		googleSearch.sendKeys(Keys.ENTER);

	}

	@AfterTest
	public void finish() {

		driver.close();
		System.out.println("Test Completed Successfully");
		
	}
}
