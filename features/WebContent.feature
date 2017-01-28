Feature: Web Content

	Scenario: Add a web content article through the admin portlet
		Given I log in as "test@liferay.com" with password "test"
		And I navigate to "Content" > "Web Content" in the Product Menu
		When I add the following Web Content in the admin portlet
			| Web Content Title | Web Content Content |
		Then I should see the following Web Content in the admin portlet
			| Web Content Title | Web Content Content |


	Scenario: Add a web content article through the WCD portlet
		Given I log in as "test@liferay.com" with password "test"
		And I navigate to the page named "Web Content Display Page"
		When I add the following Web Content in the WCD portlet
			| Web Content Title | Web Content Content |
		Then I should see the following Web Content in the WCD portlet
			| Web Content Title | Web Content Content |