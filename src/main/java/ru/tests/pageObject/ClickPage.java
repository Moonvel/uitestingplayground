package ru.tests.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickPage {
	private final WebDriver driver;

	public ClickPage(WebDriver driver) {
		this.driver = driver;
	}
	private final By domIgnoreButton = By.xpath("//button[@id = 'badButton']");

	public WebElement domIgnoreButton() {
		return driver.findElement(domIgnoreButton);
	}

}
