/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.cucumber.stepdefinitions;

import com.liferay.cucumber.selenium.LiferaySelenium;
import com.liferay.cucumber.selenium.SeleniumUtil;

/**
 * @author Michael Hashimoto
 * @author Brian Chiu
 */
public class BasePageObject {

	public BasePageObject() {
		selenium = SeleniumUtil.getSelenium();
	}

	public void click(String locator) throws Exception {
		selenium.waitForVisible(locator);

		selenium.click(locator);
	}

	public void clickButton(String button) throws Exception {
		click("//button[contains(.,'" + button + "')]");
	}

	public void clickLink(String link) throws Exception {
		click("//a[contains(.,'" + link + "')]");
	}

	public void open(String url) throws Exception {
		selenium.open(url);
	}

	public void startSelenium() throws Exception {
		selenium = SeleniumUtil.getSelenium();
	}

	public void stopSelenium() throws Exception {
		SeleniumUtil.stopSelenium();
	}

	public void typeField(String field, String text) throws Exception {
		String locator = "//div[label[contains(.,'" + field + "')]]/input";

		selenium.waitForVisible(locator);

		selenium.type(locator , text);
	}

	protected LiferaySelenium selenium;

}