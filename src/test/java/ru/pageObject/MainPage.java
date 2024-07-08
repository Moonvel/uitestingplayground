package ru.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.moonvel.BaseTest;

public class MainPage extends BaseTest {
	public WebElement dynamicIdTask = driver.findElement(By.xpath("//a[contains(text(), 'Dynamic ID')]"));
	public WebElement classAttributeTask = driver.findElement(By.xpath("//a[contains(text(), 'Class Attribute')]"));

}
