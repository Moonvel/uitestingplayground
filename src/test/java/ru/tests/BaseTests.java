package ru.tests;

import java.time.Duration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTests {

	static WebDriver driver = new ChromeDriver();
	static WebDriverWait wait;

	@BeforeAll
	public  static void setUp() {
		 wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	@AfterAll
	public static void shoutDown() {
		driver.quit();
	}

}
