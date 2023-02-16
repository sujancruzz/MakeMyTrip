
@tag
Feature: To search for trains

  @tag1
  Scenario: Search for trains
    Given I want to be in train homepage URL "https://www.makemytrip.com/flights/"
		When select train
		Then choose from station
		And click from station
		Then select from station
		#And choose to station
		And click to station
		Then select to station
		#Then choose travel date 
		And select travel date
		#Then choose class 
		Then select class
		And search train

