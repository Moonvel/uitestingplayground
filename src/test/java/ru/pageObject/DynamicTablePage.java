package ru.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicTablePage {
	WebDriver driver;

	public DynamicTablePage(WebDriver driver) {
		this.driver = driver;
	}
	private final By chromeCpuUsage = By.xpath("//span[text()='Chrome']/../span[contains(text(), '%')]");
	private final By comparedCpuUsage = By.xpath("//p[@class='bg-warning']");
	public WebElement chromeCpuUsageElement() {
		return driver.findElement(chromeCpuUsage);
	}
	public String extractedValue() {
		String s = driver.findElement(comparedCpuUsage).getText();
		return s.substring(s.lastIndexOf(":") + 2);
	}
}
