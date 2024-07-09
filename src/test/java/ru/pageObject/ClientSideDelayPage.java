package ru.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientSideDelayPage {
	private final WebDriver driver;

	public ClientSideDelayPage(WebDriver driver) {
		this.driver = driver;
	}
	private final By delayButton = By.xpath("//button[@id = 'ajaxButton']");
	public final By successAlert = By.xpath("//p[@class='bg-success']");

	public void delayButtonClick() {
		driver.findElement(delayButton).click();
	}
	public WebElement getSuccessWebElement() {
		return driver.findElement(successAlert);
	}
}
