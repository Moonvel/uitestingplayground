package ru.tests.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ClassAttrPage {
	private  final WebDriver driver;
	public ClassAttrPage(WebDriver driver) {
		this.driver = driver;
	}

	private final By blueAlertButton = By.xpath("//button[contains(@class, 'btn-primary')]");

	public void blueAlertButtonClick() {
		driver.findElement(blueAlertButton).click();
	}



}
