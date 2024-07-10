package ru.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NonBreakingSpace {
	WebDriver driver;
	public NonBreakingSpace(WebDriver driver) {
		this.driver = driver;
	}
	private final By button = By.xpath("//button[text()='My Button']"); //для ввода неразрыного проблема alt + 0160
	public WebElement button() {
		return driver.findElement(button);
	}

}
