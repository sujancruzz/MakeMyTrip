package com.kumaran.stepDefinition;

import com.kumaran.testBase.WebBrowser;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ServiceHooks {
	WebBrowser wb = new WebBrowser();
	
	@Before
	public void initializeTest() {
		wb.browser();
	}
	
	@After
	public void quit() throws InterruptedException {
		Thread.sleep(5000);
		wb.driver.close();
	}
}
