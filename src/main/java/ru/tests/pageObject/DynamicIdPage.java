package ru.tests.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DynamicIdPage {

	private final WebDriver driver;

	public DynamicIdPage(WebDriver driver) {
		this.driver = driver;
	}

	private final By dynamicIdButton = By.xpath("//button[@class='btn btn-primary']");

	public void dynamicIdButtonClick() {
		driver.findElement(dynamicIdButton).click();
	}
}
