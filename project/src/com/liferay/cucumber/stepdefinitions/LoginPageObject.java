package com.liferay.cucumber.stepdefinitions;

public class LoginPageObject extends BasePageObject {

	public void login(String emailAddress, String password) throws Exception {
		open("http://localhost:8080/");

		clickLink("Sign In");

		typeField("Email Address", emailAddress);
		typeField("Password", password);

		clickButton("Sign In");
	}

}
