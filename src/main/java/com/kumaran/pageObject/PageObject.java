package com.kumaran.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

	public WebDriver driver;

	public PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "fromCity")
	private WebElement fromName;

	@FindBy(xpath = "//input[@placeholder='From']")
	private WebElement chooseFrom;

	@FindBy(xpath = "'//div[contains(@class,'calc60']")
	private List<WebElement> ele;

	@FindBy(css = "#toCity")
	private WebElement toName;

	@FindBy(css = "input[placeholder='To']")
	private WebElement chooseTo;

	@FindBy(xpath = "//span[normalize-space()='DEPARTURE']")
	private WebElement chooseDepature;

	@FindBy(css = "div[aria-label='Thu Feb 16 2023']")
	private WebElement depatureDate;

	@FindBy(xpath = "//span[normalize-space()='RETURN']")
	private WebElement chooseReturn;

	@FindBy(css = "div[aria-label='Wed Mar 15 2023']")
	private WebElement returnDate;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/label")
	private WebElement chooseTravellers;

	@FindBy(xpath = "//li[@data-cy='adults-4']")
	private WebElement chooseAdultCount;

	@FindBy(xpath = "//li[@data-cy='children-1']")
	private WebElement chooseChildernCount;

	@FindBy(xpath = "//div[contains(@class,'makeFlex')]//li[@data-cy='infants-2']")
	private WebElement chooseInfantCount;

	@FindBy(xpath = "//li[@data-cy='travelClass-1']")
	private WebElement chooseTravelClass;

	@FindBy(xpath = "(//button[normalize-space()='APPLY'])[1]")
	private WebElement apply;

	@FindBy(xpath = "//div[@class='makeFlex hrtlCenter']//li[1]")
	private WebElement chooseFareType;

	@FindBy(xpath = "//a[normalize-space()='Search']")
	private WebElement search;

	// Selenium Methods

	public void clickFromSection() {
		this.fromName.click();
		// driver.findElement(By.id("fromCity")).click();
	}

	public void enterFromValue() {
		// driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Che");
		this.chooseFrom.sendKeys("che");
	}

	public void selectFrom() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.xpath("(//div[contains(@class,'calc60')])[1]"));
		for (WebElement e : ele) {
			System.out.println(e);
			if (e.getText().equals("Chennai, India"))
				;
			e.click();
		}
	}

	public void clickToSection() {
		// driver.findElement(By.cssSelector(" #toCity")).click();
		this.toName.sendKeys("Bid");
	}

	public void enterToValue() {
		// driver.findElement(By.cssSelector("input[placeholder='To']")).sendKeys("Bid");
		this.chooseTo.click();
	}

	public void selectTo() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> ele1 = driver.findElements(By.xpath("(//div[@class='calc60'])[1]"));
		for (WebElement e1 : ele1) {
			if (e1.getText().equalsIgnoreCase("Bidar, India"))
				;
			e1.click();
		}
	}

	public void chooseDepature() throws InterruptedException {
		Thread.sleep(2000);
			this.chooseDepature.click();
	}

	public void chooseDepatureDate() {
		this.depatureDate.click();
		//driver.findElement(By.cssSelector("div[aria-label='Thu Feb 16 2023']")).click();
	}

	public void ChooseReturn() {
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[4]/div[2]/label/span"))
//				.click();
		this.chooseReturn.click();

	}

	public void chooseReturnDate() {
		//driver.findElement(By.cssSelector("div[aria-label='Wed Mar 15 2023']")).click();
		this.returnDate.click();
	}

	public void travelCount() {
		this.chooseTravellers.click();
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/label")).click();
	}

	public void adultCount() {
		this.chooseAdultCount.click();
		//driver.findElement(By.xpath("//li[@data-cy='adults-4']")).click();
	}

	public void childrenCount() {
		this.chooseChildernCount.click();
		//driver.findElement(By.xpath("//li[@data-cy='children-1']")).click();

	}

	public void infantCount() {
		this.chooseInfantCount.click();
		//driver.findElement(By.xpath("//div[contains(@class,'makeFlex')]//li[@data-cy='infants-2']")).click();

	}

	public void travelClass() {
		this.chooseTravelClass.click();
		//driver.findElement(By.xpath("//li[@data-cy='travelClass-1']")).click();

	}

	public void apply_button() {
		this.apply.click();
		//	driver.findElement(By.xpath("(//button[normalize-space()='APPLY'])[1]")).click();

	}

	public void fare_type() {
		this.chooseFareType.click();
		//driver.findElement(By.xpath("//div[@class='makeFlex hrtlCenter']//li[1]")).click();

	}

	public void search_button() {
		//driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();
		this.search.click();
	}

}
