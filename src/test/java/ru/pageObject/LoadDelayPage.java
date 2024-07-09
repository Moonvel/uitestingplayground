package ru.pageObject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoadDelayPage {
	private final WebDriver driver;

	public LoadDelayPage(WebDriver driver) {
		this.driver = driver;
	}

	private final By delayButton = By.xpath("//button[contains(text(), 'After Delay')]");

	public void delayButtonClick() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(delayButton));
		driver.findElement(delayButton).click();
	}


}
