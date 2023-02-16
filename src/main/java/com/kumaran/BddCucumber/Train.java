package com.kumaran.BddCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Train {
	public static void  mian (String [] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/railways/");
		driver.manage().window().maximize();
	}

}
