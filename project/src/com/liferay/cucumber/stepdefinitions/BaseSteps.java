package com.liferay.cucumber.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class BaseSteps {

    @When("^I click the \"([^\"]*)\" button$")
    public void clickButton(String button) throws Throwable {
        _basePageObject.clickButton(button);
    }

    @When("^I click the \"([^\"]*)\" link$")
    public void clickLink(String link) throws Exception {
        _basePageObject.clickLink(link);
    }

    @When("^I navigate to \"([^\"]*)\"$")
    public void open(String url) throws Exception {
        _basePageObject.open(url);
    }

    @Given("I start selenium")
    public void startSelenium() throws Exception {
        _basePageObject.startSelenium();
    }

    @Given("I stop selenium")
    public void stopSelenium() throws Exception {
        _basePageObject.stopSelenium();
    }

    @When("^I enter \"([^\"]*)\" in the \"([^\"]*)\" field$")
    public void typeField(String text, String field) throws Exception {
        _basePageObject.typeField(field, text);
    }

    private BasePageObject _basePageObject = new BasePageObject();

}