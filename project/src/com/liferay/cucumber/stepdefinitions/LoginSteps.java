package com.liferay.cucumber.stepdefinitions;

import cucumber.api.java.en.When;

public class LoginSteps {

    @When("^I login as \"([^\"]*)\" with password \"([^\"]*)\"$")
    public void login(String emailAddress, String password) throws Throwable {
        _loginPageObject.login(emailAddress, password);
    }

    private LoginPageObject _loginPageObject = new LoginPageObject();

}