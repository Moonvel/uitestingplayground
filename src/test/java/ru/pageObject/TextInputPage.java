package ru.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextInputPage {
	private final WebDriver driver;

	public TextInputPage(WebDriver driver) {
		this.driver = driver;
	}
	private final By inputForm = By.xpath("//input[@class='form-control']");
	private final By updatingButton = By.xpath("//button[@id='updatingButton']");

	public TextInputPage inputFormFill(String text) {
		driver.findElement(inputForm).sendKeys(text);
		return this;
	}
	public WebElement updatingButtonElement() {
		return driver.findElement(updatingButton);
	}
}
