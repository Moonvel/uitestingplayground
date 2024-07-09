package ru.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.pageObject.AJAXData;
import ru.pageObject.ClassAttrPage;
import ru.pageObject.DynamicIdPage;
import ru.pageObject.HiddenLayersPage;
import ru.pageObject.LoadDelayPage;
import ru.pageObject.MainPage;


public class UiTestingPlayGroundTests extends BaseTests {
	@Test
	@Description("Тест кнопки с динамическим ID")
	public void dynamicIdTaskTest() {
		MainPage mainPage = new MainPage(driver);
		DynamicIdPage dynamicIdPage = mainPage.goToDynamicIdPage();
		dynamicIdPage.dynamicIdButtonClick();
	}

	@Test
	@Description("Тест кнопки с несколькими классами. Работа с alert")
	public void classAttributeTest() {
		MainPage mainPage = new MainPage(driver);
		ClassAttrPage classAttrPage = mainPage.goToClassAttributePage();
		classAttrPage.blueAlertButtonClick();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Test
	@Description("Тест скрытой кнопки")
	public void hiddenLayersTest() {
		MainPage mainPage = new MainPage(driver);
		HiddenLayersPage hiddenLayersPage = mainPage.goToHiddenLayersPage();
		hiddenLayersPage.greenButtonClick().blueButtonClick();
	}


	@Test
	@Description("Нажатие кнопки после загрузки страницы с задержкой")
	public void loadDelayTest() {
		MainPage mainPage = new MainPage(driver);
		LoadDelayPage loadDelayPage = mainPage.goToLoadDelayPage();
		loadDelayPage.delayButtonClick();
	}

	@Test
	@Description("Ожидание ответа с сервера после нажатия кнопки")
	public void ajaxDataTest() {
		MainPage mainPage = new MainPage(driver);
		AJAXData ajaxData = mainPage.goToAJAXPage();
		ajaxData.ajaxButtonClick();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ajaxData.waitedElement));
		assertEquals("Data loaded with AJAX get request.", ajaxData.getWaitedWebElement().getText());
	}


}
