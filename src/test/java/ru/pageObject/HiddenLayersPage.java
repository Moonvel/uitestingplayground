package ru.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HiddenLayersPage {
	private final WebDriver driver;

	public HiddenLayersPage(WebDriver driver) {
		this.driver = driver;
	}

	private final By greenButton = By.xpath("//button[@id='greenButton']");
	private final By blueButton = By.xpath("//button[@id='blueButton']");

	public HiddenLayersPage greenButtonClick() {
		driver.findElement(greenButton).click();
		return this;
	}
	public HiddenLayersPage blueButtonClick() {
		driver.findElement(blueButton).click();
		return this;
	}
}
