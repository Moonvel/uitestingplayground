package ru.moonvel;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.pageObject.MainPage;

public class UiTestingPlayGroundTests extends BaseTest {

	MainPage mainPage = new MainPage();

	@Test
	public void dynamicIdTaskTest() {
		mainPage.dynamicIdTask.click();
		WebElement dynamicIdButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		dynamicIdButton.click();
	}

	@Test
	public void classAttributeTest() {
		mainPage.classAttributeTask.click();
		WebElement blueAlertButton = driver.findElement(
				By.xpath("//button[contains(@class, 'btn-primary')]"));
		blueAlertButton.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

}
