package ru.tests.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyTextPage {
	private final WebDriver driver;

	public VerifyTextPage(WebDriver driver) {
		this.driver = driver;
	}
	private final By playGround = By.xpath("//span[normalize-space(text())='Welcome']");

	public WebElement playGroundElement() {
		return driver.findElement(playGround);
	}
}
