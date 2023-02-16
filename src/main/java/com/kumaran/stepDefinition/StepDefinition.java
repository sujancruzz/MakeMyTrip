package com.kumaran.stepDefinition;

import com.kumaran.pageObject.PageObject;
import com.kumaran.testBase.WebBrowser;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition extends WebBrowser {

	
	
  WebBrowser wb=new WebBrowser();
  PageObject po= new PageObject(driver); 


	@Given("I want to be in homepage URL {string}")
	public void i_want_to_be_in_homepage_url(String string) {
//		WebDriver driver = new ChromeDriver();
		System.out.println(string);
		//wb.browser();		
		wb.driver.get(string);
		wb.driver.manage().window().maximize();
	   
	}

	@Then("click from section")
	public void click_from_section() {
		po.clickFromSection();

	}

	@When("I enter from as che")
	public void i_enter_from_as_che() {
		po.enterFromValue();

	}

	@Then("choose chennai")
	public void choose_chennai() throws InterruptedException {
		po.selectFrom();

	}

	@Then("click to section")
	public void click_to_section() {
		po.clickToSection();

	}
	

	@When("I enter to as bid")
	public void i_enter_to_as_bid() {
		po.enterToValue();

	}

	@Then("choose bidar")
	public void choose_bidar() throws InterruptedException {
		po.selectTo();

	}

	@Then("Choose Depature")
	public void choose_depature() throws InterruptedException {
		po.chooseDepature();

	}

	@Then("choose date")
	public void choose_date() {
		po.chooseDepatureDate();
	}

	@Then("click return")
	public void click_return() {
		po.ChooseReturn();

	}
	
	@Then("choose return date")
	public void choose_return_date() {
		po.chooseReturnDate();
	}

	@Then("click traveller class")
	public void click_traveller_class() {
		po.travelCount();

	}

	@Then("choose adult count")
	public void choose_adult_count() {
		po.adultCount();

	}

	@Then("choose childern count")
	public void choose_childern_count() {
		po.childrenCount();

	}

	@Then("choose infant count")
	public void choose_infant_count() {
		po.infantCount();

	}

	@Then("click and choose travel class")
	public void click_and_choose_travel_class() {
		po.travelClass();

	}

	@Then("click on apply button")
	public void click_on_apply_button() {
		po.apply_button();

	}

	@Then("select fare type")
	public void select_fare_type() {
		po.fare_type();

	}

	@Then("search")
	public void search() {
		po.search_button();
		}


}
