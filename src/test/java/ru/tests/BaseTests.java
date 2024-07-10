package ru.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

	static WebDriver driver = new ChromeDriver();

//	@AfterAll
//	public static void shoutDown() {
//		driver.close();
//	}
	@AfterAll
	public static void shoutDown() {
		driver.quit();
	}

}
