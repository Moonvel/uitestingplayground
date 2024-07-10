package ru.tests.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollBarPage {
	WebDriver driver;

	public ScrollBarPage(WebDriver driver) {
		this.driver = driver;
	}
	private final By hidingButton = By.xpath("//button[@id='hidingButton']");
	public WebElement hidingButtonElement() {
		return driver.findElement(hidingButton);
	}
}
