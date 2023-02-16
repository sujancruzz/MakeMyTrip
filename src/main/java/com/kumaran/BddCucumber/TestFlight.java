package com.kumaran.BddCucumber;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestFlight {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(
				By.xpath("//input[@placeholder='From']"))
				.sendKeys("Che");
		Thread.sleep(1000);

		List<WebElement> ele = driver.findElements(By.xpath("(//div[contains(@class,'calc60')])[1]"));

		//List<WebElement> ele = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]"));
//		for (WebElement e : ele) {
//			if (e.getText().equalsIgnoreCase("Chennai, India"))
//				;
//			e.click();
//		}
		for (WebElement e:ele) {
			System.out.println(e);
			if(e.getText().equals("Chennai, India"));
			e.click();
		}
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(" #toCity")).click();
		driver.findElement(By.cssSelector("input[placeholder='To']")).sendKeys("Bid");
		Thread.sleep(1000);
		List<WebElement> ele1 = driver.findElements(By.xpath("(//div[@class='calc60'])[1]"));
		for (WebElement e1 : ele1) {
			if (e1.getText().equalsIgnoreCase("Bidar, India"))
				;
			e1.click();
		}
		driver.findElement(By.className("swipCircle")).click();
		driver.findElement(By.cssSelector("div[aria-label='Thu Feb 16 2023']")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[4]/div[2]/label/span"))
				.click();
		driver.findElement(By.cssSelector("div[aria-label='Wed Mar 15 2023']")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-cy='adults-4']")).click();
		driver.findElement(By.xpath("//li[@data-cy='children-1']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'makeFlex')]//li[@data-cy='infants-2']")).click();
		driver.findElement(By.xpath("//li[@data-cy='travelClass-1']")).click();
		driver.findElement(By.xpath("(//button[normalize-space()='APPLY'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='makeFlex hrtlCenter']//li[1]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();

	}

	}


