package ru.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShadowDomPage {

	private final WebDriver driver;

	public ShadowDomPage(WebDriver driver) {
		this.driver = driver;
	}

	private final By shadowHost = By.xpath("//guid-generator");

	public WebElement shadowHostElement() {
		return driver.findElement(shadowHost);
	}
}

