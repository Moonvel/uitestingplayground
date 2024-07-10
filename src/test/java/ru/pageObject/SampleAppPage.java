package ru.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SampleAppPage {
	WebDriver driver;
	public SampleAppPage(WebDriver driver) {
		this.driver = driver;
	}
	private final By userName = By.xpath("//input[@name='UserName']");
	private final By passWord = By.xpath("//input[@name='Password']");
	private final By loginSubmitButton = By.xpath("//button[@id = 'login']");
	private final By successfulLogin = By.xpath("//label[contains(text(), Welcome)]");

	public void fillLoginForm(String login, String pass) {
		driver.findElement(userName).sendKeys(login);
		driver.findElement(passWord).sendKeys(pass);
		driver.findElement(loginSubmitButton).click();
	}
	public WebElement successfulLoginElement() {
		return driver.findElement(successfulLogin);
	}
}
