package ru.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverlappedElementPage {
	private final WebDriver driver;

	public OverlappedElementPage(WebDriver driver) {
		this.driver = driver;
	}
	private final By nameField = By.xpath("//input[@id='name']");
	private final By scrollBlock = By.xpath("//div[@style='overflow-y: scroll; height:100px;']");
	public WebElement inputName() {
		return driver.findElement(nameField);
	}
	public WebElement scrollBlockElement() {
		return driver.findElement(scrollBlock);
	}

	public void scrollElementDown(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", element);
	}
}
