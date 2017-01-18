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

	Scenario: Test3
		Given I have 7 cukes in my belly

	Scenario: Login
		Given I start selenium
		Given I navigate to "http://localhost:8080"
		When I click the "Sign In" link
		And I enter "test@liferay.com" in the "Email Address" field
		And I enter "test" in the "Password" field
		Then I logout

	Scenario: Portal Smoke
		Given I am signed in as the super admin
		When I add a page named <name>
			| name       |
			| Test Page1 |
			| Test Page2 |
			| Test Page3 |
		Then I navigate to the page named <name>
			| name       |
			| Test Page1 |
			| Test Page2 |
			| Test Page3 |
		When I navigate to the page named "Test Page 1"
		And I add a portlet named "Web Content Display"
		And I add a web content article in the Web Content Display portlet
			| title             | content             |
			| Web Content Title | Web Content Content |
		Then I view the web content article in the Web Content Display portlet
			| title             | content             |
			| Web Content Title | Web Content Content |
		When I navigate to the "Blogs" portlet in the Product Menu
		Then I view the Product Menu portlet title
			| title |
			| blogs |