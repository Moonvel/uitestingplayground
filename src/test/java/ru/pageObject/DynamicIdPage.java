package ru.pageObject;

import org.openqa.selenium.By;
import ru.moonvel.BaseTest;

public class DynamicIdPage extends BaseTest {

	public By dynamicIdButton = By.xpath("//button[@class='btn btn-primary']");

}
