
@tag
Feature: To search for available 

  @tag1
  Scenario: checking the availability of flights
    Given I want to be in homepage URL "https://www.makemytrip.com/flights/"
    Then click from section
	  When I enter from as che
	  Then choose chennai
	  Then click to section
	  When I enter to as bid
	  Then choose bidar
	  Then Choose Depature
	  Then choose date
	  Then click return
	  Then choose return date
	  Then click traveller class
	  Then choose adult count
	  Then choose childern count
	  Then choose infant count
	  Then click and choose travel class
	  Then click on apply button
	  Then select fare type
	  Then search
	  
	   
	  


