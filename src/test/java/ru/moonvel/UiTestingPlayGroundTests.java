package ru.moonvel;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import ru.pageObject.ClassAttrPage;
import ru.pageObject.DynamicIdPage;
import ru.pageObject.HiddenLayersPage;
import ru.pageObject.MainPage;

public class UiTestingPlayGroundTests extends BaseTest {
	MainPage mainPage = new MainPage();
	ClassAttrPage classAttrPage = new ClassAttrPage();
	DynamicIdPage dynamicIdPage = new DynamicIdPage();
	HiddenLayersPage hiddenLayersPage = new HiddenLayersPage();

	@Test
	@Description("Тест кнопки с динамическим ID")
	public void dynamicIdTaskTest() {
		driver.findElement(mainPage.dynamicIdTask).click();
		driver.findElement(dynamicIdPage.dynamicIdButton).click();
	}

	@Test
	@Description("Тест кнопки с несколькими классами. Работа с alert")
	public void classAttributeTest() {
		driver.findElement(mainPage.classAttributeTask).click();
		driver.findElement(classAttrPage.blueAlertButton).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Test
	@Description("Тест скрытой кнопки")
	public void hiddenLayersTest() {
		driver.findElement(mainPage.hiddenLayersTask).click();
		driver.findElement(hiddenLayersPage.greenButton).click();
		driver.findElement(hiddenLayersPage.blueButton).click();
	}


}
