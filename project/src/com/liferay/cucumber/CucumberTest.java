package com.liferay.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
	features = "features",
	plugin = {
		"pretty", "html:results/html" , "json:results/json/test.json",
		"junit:results/junit/test.xml"
	},
	snippets = SnippetType.CAMELCASE,
	tags = "@your_tag"
)

public class CucumberTest {
}