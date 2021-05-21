package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGParallelDemo {

	WebDriver driver = null;

	@Test
	public void test1() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\DemoProject_Capgemini\\TestNGDemo\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement googleSearch = driver.findElement(By.name("q"));
		googleSearch.sendKeys("Selenium Tutorial");
		googleSearch.sendKeys(Keys.ENTER);
		driver.close();

	}

	@Test
	public void test2() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\DemoProject_Capgemini\\TestNGDemo\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("password")).sendKeys("xyz");
		driver.close();

	}
	
	@Test
	public void test3() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\DemoProject_Capgemini\\TestNGDemo\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement googleSearch = driver.findElement(By.name("q"));
		googleSearch.sendKeys("TestNG");
		googleSearch.sendKeys(Keys.ENTER);
		driver.close();

	}
}
