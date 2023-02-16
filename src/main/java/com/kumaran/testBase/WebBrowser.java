package com.kumaran.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class WebBrowser {
	public static WebDriver driver;
	
	
	public WebDriver browser()
	{
		return driver=new ChromeDriver();
	}


}
