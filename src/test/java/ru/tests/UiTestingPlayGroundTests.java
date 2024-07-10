package ru.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.pageObject.AJAXDataPage;
import ru.pageObject.ClassAttrPage;
import ru.pageObject.ClickPage;
import ru.pageObject.ClientSideDelayPage;
import ru.pageObject.DynamicIdPage;
import ru.pageObject.DynamicTablePage;
import ru.pageObject.HiddenLayersPage;
import ru.pageObject.LoadDelayPage;
import ru.pageObject.MainPage;
import ru.pageObject.ProgressBarPage;
import ru.pageObject.ScrollBarPage;
import ru.pageObject.TextInputPage;
import ru.pageObject.VerifyTextPage;


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
		AJAXDataPage ajaxData = mainPage.goToAJAXPage();
		ajaxData.ajaxButtonClick();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ajaxData.waitedElement));
		assertEquals("Data loaded with AJAX get request.", ajaxData.getWaitedWebElement().getText());
	}

	@Test
	@Description("Ожидание отработки скрипта на клиентской стороне")
	public void clientSideDelayTest() {
		MainPage mainPage = new MainPage(driver);
		ClientSideDelayPage clientSideDelayPage = mainPage.goToClientSideDelayPage();
		clientSideDelayPage.delayButtonClick();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clientSideDelayPage.successAlert));
		assertEquals("Data calculated on the client side.", clientSideDelayPage.getSuccessWebElement().getText());
	}
	@Test
	@Description("Тест сломанной некликабельной кнопки")
	public void clickTest() {
		MainPage mainPage = new MainPage(driver);
		ClickPage clickPage = mainPage.goToClickPage();
		clickPage.domIgnoreButton().click();
		clickPage.domIgnoreButton().click();
	}
	@Test
	@Description("Ввод текста в input form")
	public void textInputTest() {
		MainPage mainPage = new MainPage(driver);
		TextInputPage textInputPage = mainPage.goToTextInputPage();
		String message = "Hello World!";
		textInputPage.inputFormFill(message).updatingButtonElement().click();
		Assertions.assertEquals(message, textInputPage.updatingButtonElement().getText());
	}
	@Test
	@Description("Проверка нажатия на кнопку, вне видимости")
	public void scrollBarsTest() {
		MainPage mainPage = new MainPage(driver);
		ScrollBarPage scrollBarPage = mainPage.goToScrollBarPage();
		scrollBarPage.hidingButtonElement().click();
	}
	@Test
	@Description("Проверка Chrome CPU load в динамической таблице")
	public void dynamicTableTest() {
		MainPage mainPage = new MainPage(driver);
		DynamicTablePage dynamicTablePage = mainPage.goToDynamicTablePage();
		Assertions.assertEquals(dynamicTablePage.extractedValue(), dynamicTablePage.chromeCpuUsageElement().getText());
	}
	@Test
	@Description("Извлечение элемента по тексту c пробелами в DOM")
	public void verifyTest() {
		MainPage mainPage = new MainPage(driver);
		VerifyTextPage verifyTextPage = mainPage.goToVerifyTextPage();
		Assertions.assertEquals("Welcome UserName!", verifyTextPage.playGroundElement().getText());
	}
	@Test
	@Description("Тест progressBar")
	public void progressBarTest() {
		MainPage mainPage = new MainPage(driver);
		ProgressBarPage progressBarPage = mainPage.goToProgressBarPage();
		progressBarPage.startButton().click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofMillis(100));
		wait.until(ExpectedConditions.attributeToBe(progressBarPage.progressBarElement(), "aria-valuenow", "40"));
		progressBarPage.stopButton().click();
		Assertions.assertEquals("40", progressBarPage.progressBarElement().getAttribute("aria-valuenow"));
	}

}
