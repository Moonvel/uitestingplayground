package ru.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage {

	private final WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
		driver.navigate().to("http://uitestingplayground.com/");
	}
	private final By dynamicIdTaskButton = By.xpath("//a[contains(text(), 'Dynamic ID')]");
	private final By classAttributeTaskButton = By.xpath("//a[contains(text(), 'Class Attribute')]");
	private final By hiddenLayersTaskButton = By.xpath("//a[contains(text(), 'Hidden Layers')]");
	private final By loadDelayTaskButton = By.xpath("//a[contains(text(), 'Load Delay')]");
	private final By ajaxDataTaskButton = By.xpath("//a[contains(text(), 'AJAX')]");
	private final By clientSideDelayButton = By.xpath("//a[contains(text(), 'Client Side Delay')]");

	public DynamicIdPage goToDynamicIdPage() {
		driver.findElement(dynamicIdTaskButton).click();
		return new DynamicIdPage(driver);
	}
	public ClassAttrPage goToClassAttributePage() {
		driver.findElement(classAttributeTaskButton).click();
		return new ClassAttrPage(driver);
	}
	public HiddenLayersPage goToHiddenLayersPage() {
		driver.findElement(hiddenLayersTaskButton).click();
		return new HiddenLayersPage(driver);
	}
	public LoadDelayPage goToLoadDelayPage() {
		driver.findElement(loadDelayTaskButton).click();
		return new LoadDelayPage(driver);
	}
	public AJAXDataPage goToAJAXPage() {
		driver.findElement(ajaxDataTaskButton).click();
		return new AJAXDataPage(driver);
	}
	public ClientSideDelayPage goToClientSideDelayPage() {
		driver.findElement(clientSideDelayButton).click();
		return new ClientSideDelayPage(driver);
	}
}
