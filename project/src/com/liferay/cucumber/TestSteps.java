package com.liferay.cucumber;

import com.liferay.cucumber.TestPageObject;

import cucumber.api.java.en.When;

public class TestSteps {

    @When("^I have (\\d+) cukes in my belly$")
    public void cuckes(int i) throws Throwable {
        _testPageObject.cuckes(i);
    }

    private TestPageObject _testPageObject = new TestPageObject();

}