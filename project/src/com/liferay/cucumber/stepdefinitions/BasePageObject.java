package com.liferay.cucumber.stepdefinitions;

import com.liferay.poshi.runner.selenium.LiferaySelenium;
import com.liferay.poshi.runner.selenium.SeleniumUtil;

public class BasePageObject {

	private void _click(String locator) throws Exception {
		selenium.waitForVisible(locator);

		selenium.click(locator);
	}

	public void clickButton(String button) throws Exception {
		_click(".//button[contains(.,'" + button + "')]");
	}

	public void clickLink(String link) throws Exception {
		_click("//a[contains(.,'" + link + "')]");
	}

	public void open(String url) throws Exception {
		selenium.open(url);
	}

	public void startSelenium() throws Exception {
		SeleniumUtil.startSelenium();

		selenium = SeleniumUtil.getSelenium();
	}

	public void stopSelenium() throws Exception {
		SeleniumUtil.stopSelenium();
	}

	public void typeField(String field, String text) {
		selenium.type(".//div[label[contains(.,'" + field + "')]]/input", text);
	}

	protected LiferaySelenium selenium;

}