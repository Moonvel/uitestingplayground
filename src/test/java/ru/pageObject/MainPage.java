package ru.pageObject;

import org.openqa.selenium.By;
import ru.moonvel.BaseTest;

public class MainPage extends BaseTest {

	public By dynamicIdTask = By.xpath("//a[contains(text(), 'Dynamic ID')]");
	public By classAttributeTask = By.xpath("//a[contains(text(), 'Class Attribute')]");
	public By hiddenLayersTask = By.xpath("//a[contains(text(), 'Hidden Layers')]");
}
