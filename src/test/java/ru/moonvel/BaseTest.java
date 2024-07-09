package ru.moonvel;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	protected static WebDriver driver;

	@BeforeAll
	public static void setUp() {
		driver = new ChromeDriver();
		driver.get("http://uitestingplayground.com/");


	}

	@AfterEach
	public void afterEach() {
		driver.navigate().to("http://uitestingplayground.com/");
	}

	@AfterAll
	public static void shoutDown() {
		driver.close();
	}

}
