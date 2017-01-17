package com.liferay.cucumber;

import cucumber.api.java.en.Given;

public class StepDefinitions {

    @Given("I have (\\d+) cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) throws Exception {
        System.out.println("Cukes: " + cukes);
    }

}