package ru.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.moonvel.BaseTest;

public class ClassAttrPage extends BaseTest {
	public WebElement blueAlertButton = driver.findElement(By.xpath("//button[contains(@class, 'btn-primary')]"));
}
