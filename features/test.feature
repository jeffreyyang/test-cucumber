Feature: Feature 1.2

	Scenario: Test1
		Given I start selenium
		When I navigate to "http://www.liferay.com/"
		And I click the "Product" link
		Then I stop selenium

	Scenario: Test2
		Given I have 5 cukes in my belly:
		  | name   | email              | twitter         |
		  | Aslak  | aslak@cucumber.io  | @aslak_hellesoy |
		  | Julien | julien@cucumber.io | @jbpros         |
		  | Matt   | matt@cucumber.io   | @mattwynne      |