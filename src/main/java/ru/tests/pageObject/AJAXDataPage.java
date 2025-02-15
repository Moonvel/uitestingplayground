package ru.tests.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AJAXDataPage {
	private final WebDriver driver;

	public AJAXDataPage(WebDriver driver) {
		this.driver = driver;
	}
	private final By ajaxButton = By.xpath("//button[@id = 'ajaxButton']");
	public final By waitedElement = By.xpath("//p[@class='bg-success']");

	public void ajaxButtonClick() {
		driver.findElement(ajaxButton).click();
	}

	public WebElement getWaitedWebElement() {
		return driver.findElement(waitedElement);
	}
}
