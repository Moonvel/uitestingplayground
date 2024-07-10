package ru.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseOverPage {
	WebDriver driver;

	public MouseOverPage(WebDriver driver) {
		this.driver = driver;
	}
	private final By playGroundLink = By.xpath("//div/a[@title='Click me']");
	private final By clickCount = By.xpath("//span[@class='badge badge-light']");
	public WebElement linkElement() {
		return driver.findElement(playGroundLink);
	}
	public int clickCount() {
		return Integer.parseInt(driver.findElement(clickCount).getText());
	}

}
