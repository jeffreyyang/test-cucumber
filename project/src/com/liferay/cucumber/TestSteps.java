package com.liferay.cucumber;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class TestSteps {

    @When("^I have (\\d+) cukes in my belly:$")
    public void cuckes(int i, DataTable dataTable) throws Throwable {
        _testPageObject.cuckes(i);

        List<Map<String, String>> data = dataTable.asMaps(
        	String.class, String.class);

		for (Map map : data) {
			System.out.println("------------------");
			System.out.println("name:    " + map.get("name"));
			System.out.println("email:   " + map.get("email"));
			System.out.println("twitter: " + map.get("twitter"));
		}
    }

    private TestPageObject _testPageObject = new TestPageObject();

}