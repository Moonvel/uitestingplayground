package ru.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.moonvel.BaseTest;

public class DynamicIdPage extends BaseTest {
	public WebElement dynamicIdButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
}
