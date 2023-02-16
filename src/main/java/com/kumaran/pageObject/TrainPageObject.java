package com.kumaran.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kumaran.testBase.WebBrowser;

public class TrainPageObject extends WebBrowser {

	public WebDriver driver;

	public TrainPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@data-cy='menu_Trains']//div//a")
	private WebElement trainSection;
	
	@FindBy(xpath = "//label[@for='fromCity']")
	private WebElement fromName;

	@FindBy(xpath = "//input[@placeholder='From']")
	private WebElement chooseFrom;

	@FindBy(xpath = "//span[normalize-space()='Madurai']")
	private WebElement selectFrom;

//	@FindBy(xpath = "//label[@for='toCity']")
//	private WebElement toName;

	@FindBy(xpath = "//input[@placeholder='To']")
	private WebElement chooseTo;
	
	@FindBy(xpath = "//span[normalize-space()='Bangalore']")
	private WebElement selectTo;

//	@FindBy(xpath = "//label[contains(@for,'travelDate')]")
//	private WebElement travelDate;

	@FindBy(xpath = "//div[@aria-label='Wed Feb 22 2023']")
	private WebElement chooseTravelDate;

//	@FindBy(xpath = "//p[normalize-space()='ALL']")
//	private WebElement travelClass;
	
	@FindBy(xpath = "//li[normalize-space()='Second AC']")
	private WebElement chooseTravelClass;

	@FindBy(xpath= "//a[normalize-space()='Search']")
	private WebElement searchTrain;

	public void chooseFromSection() {
		this.trainSection.click();
		//driver.findElement(By.xpath("//input[@id='fromCity']")).click();
	}

	public void clickFromStation() throws InterruptedException {
		Thread.sleep(2000);
		this.fromName.click();
		// driver.findElement(By.id("fromCity")).click();
	}

	public void enterFromValue() throws InterruptedException {
		// driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Che");
		Thread.sleep(1500);
		this.chooseFrom.sendKeys("Madurai");
		
	}
	
	public void selectFromStation() throws InterruptedException {
		
//		List<WebElement> ele = driver.findElements(By.xpath("(//div[contains(@class,'calc60')])[1]"));
//		for (WebElement e : ele) {
//			System.out.println(e);
//			if (e.getText().equals("Chennai, India"))
//				;
//			e.click();
//		}
		Thread.sleep(2000);
		this.selectFrom.click();
	}


//	public void clickToStation() throws InterruptedException {
//		// driver.findElement(By.cssSelector(" #toCity")).click();
//		Thread.sleep(2000);
//		this.toName.click();
//	}

	public void enterToValue() throws InterruptedException {
		// driver.findElement(By.cssSelector("input[placeholder='To']")).sendKeys("Bid");
		Thread.sleep(2000);
		this.chooseTo.sendKeys("Bangalore");
		}
	
	public void selectToStation() throws InterruptedException {
		Thread.sleep(2000);
		this.selectTo.click();
//		List<WebElement> ele1 = driver.findElements(By.xpath("(//div[@class='calc60'])[1]"));
//		for (WebElement e1 : ele1) {
//			if (e1.getText().equalsIgnoreCase("Bidar, India"))
//				;
//			e1.click();
	}
	
	
//	public void travelDate() {
//		this.travelDate.click();
//	}

	public void chooseTravelDate() {
		this.chooseTravelDate.click();
	}

//	public void travelClass() {
//		this.travelClass.click();
//	}
	
	public void chooseTravelClass() {
		this.chooseTravelClass.click();
	}

	public void trainSearch() {
		this.searchTrain.click();
	}

}
