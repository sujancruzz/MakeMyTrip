package com.kumaran.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.kumaran.pageObject.TrainPageObject;
import com.kumaran.testBase.WebBrowser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrainStepDefinition extends WebBrowser {
	
	 WebBrowser wb=new WebBrowser();
	  TrainPageObject tpo= new TrainPageObject(driver); 

	
	@Given("I want to be in train homepage URL {string}")
  public void i_want_to_be_in_homepage(String string) throws Throwable {
		//WebDriver driver = new ChromeDriver();
		System.out.println(string);
		//wb.browser();		
		wb.driver.get(string);
		wb.driver.manage().window().maximize();
       
  }

  @When("select train")
  public void select_train() throws Throwable {
       tpo.chooseFromSection();
  }

  
  @And("choose from station")
  public void select_from_station() throws Throwable {
      tpo.clickFromStation();
  }
  
  @Then("click from station")
  public void click_from_station() throws Throwable {
      tpo.enterFromValue();
  }
	@Then("select from station")
	public void selectFromStation() throws InterruptedException {
		tpo.selectFromStation();
	}
	
//	@And("choose to station")
//	public void selectToStation() throws InterruptedException {
//		tpo.clickToStation();
//	}

  @And("click to station")
  public void select_to_station() throws Throwable {
      tpo.enterToValue();
  }
  
  @Then("select to station")
  public void click_to_station() throws Throwable {
      tpo.selectToStation();
  }

//  @Then("choose travel date")
//  public void choose_travel_date() throws Throwable {
//       tpo.travelDate();
//  }
  
  @And("select travel date")
  public void select_travel_date() throws Throwable {
       tpo.chooseTravelDate();
  }

//  @Then("choose class")
//  public void choose_travelclass() throws Throwable {
//       tpo.travelClass();
//  }
  
  @Then("select class")
  public void select_travelclass() throws Throwable {
       tpo.chooseTravelClass();
  }

  
  @And("search train")
  public void search_train() throws Throwable {
       tpo.trainSearch();
  }

}
