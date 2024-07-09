package ru.pageObject;

import org.openqa.selenium.By;
import ru.moonvel.BaseTest;

public class ClassAttrPage extends BaseTest {

	public By blueAlertButton = By.xpath("//button[contains(@class, 'btn-primary')]");
}
