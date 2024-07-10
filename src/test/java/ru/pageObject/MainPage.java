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
	private final By clickButton = By.xpath("//a[contains(text(), 'Click')]");
	private final By textInput = By.xpath("//a[contains(text(), 'Text Input')]");
	private final By scrollbars = By.xpath("//a[contains(text(), 'Scrollbars')]");
	private final By dynamicTable = By.xpath("//a[contains(text(), 'Dynamic Table')]");
	private final By verifyText = By.xpath("//a[contains(text(), 'Verify Text')]");
	private final By progressBar = By.xpath("//a[contains(text(), 'Progress Bar')]");
	private final By sampleApp = By.xpath("//a[contains(text(), 'Sample App')]");
	private final By mouthOver = By.xpath("//a[contains(text(), 'Mouse Over')]");
	private final By nonBreakingSpace = By.xpath("//a[contains(text(), 'Non-Breaking Space')]");
	private final By overlappedElement = By.xpath("//a[contains(text(), 'Overlapped Element')]");



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
	public ClickPage goToClickPage() {
		driver.findElement(clickButton).click();
		return new ClickPage(driver);
	}
	public TextInputPage goToTextInputPage() {
		driver.findElement(textInput).click();
		return new TextInputPage(driver);
	}
	public ScrollBarPage goToScrollBarPage() {
		driver.findElement(scrollbars).click();
		return new ScrollBarPage(driver);
	}
	public DynamicTablePage goToDynamicTablePage() {
		driver.findElement(dynamicTable).click();
		return new DynamicTablePage(driver);
	}
	public VerifyTextPage goToVerifyTextPage() {
		driver.findElement(verifyText).click();
		return new VerifyTextPage(driver);
	}
	public ProgressBarPage goToProgressBarPage() {
		driver.findElement(progressBar).click();
		return new ProgressBarPage(driver);
	}
	public SampleAppPage goToSampleAppPage() {
		driver.findElement(sampleApp).click();
		return new SampleAppPage(driver);
	}
	public MouseOverPage goToMouseOverPage() {
		driver.findElement(mouthOver).click();
		return new MouseOverPage(driver);
	}
	public NonBreakingSpace goToNonBreakingSpace() {
		driver.findElement(nonBreakingSpace).click();
		return new NonBreakingSpace(driver);
	}
	public OverlappedElementPage goToOverlappedElementPage() {
		driver.findElement(overlappedElement).click();
		return new OverlappedElementPage(driver);
	}

}
