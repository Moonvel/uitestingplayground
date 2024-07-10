package ru.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProgressBarPage {
	private final WebDriver driver;

	public ProgressBarPage(WebDriver driver) {
		this.driver = driver;
	}

	private final By progressBar = By.xpath("//div[@id='progressBar']");
	private final By startButton = By.xpath("//button[@id='startButton']");
	private final By stopButton = By.xpath("//button[@id='stopButton']");

	public WebElement progressBarElement() {
		return driver.findElement(progressBar);
	}
	public WebElement startButton() {
		return driver.findElement(startButton);
	}
	public WebElement stopButton() {
		return driver.findElement(stopButton);
	}
}
