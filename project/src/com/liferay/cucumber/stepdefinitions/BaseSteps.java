package com.liferay.cucumber.stepdefinitions;

import cucumber.api.java.en.Given;

/**
 * @author Michael Hashimoto
 * @author Brian Chiu
 */
public class BaseSteps {

    @Given("^I click the \"([^\"]*)\" button$")
    public void clickButton(String button) throws Throwable {
        _basePageObject.clickButton(button);
    }

    @Given("^I click the \"([^\"]*)\" link$")
    public void clickLink(String link) throws Exception {
        _basePageObject.clickLink(link);
    }

    @Given("^I navigate to \"([^\"]*)\"$")
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

    @Given("^I enter \"([^\"]*)\" in the \"([^\"]*)\" field$")
    public void typeField(String text, String field) throws Exception {
        _basePageObject.typeField(field, text);
    }

    private BasePageObject _basePageObject = new BasePageObject();

}