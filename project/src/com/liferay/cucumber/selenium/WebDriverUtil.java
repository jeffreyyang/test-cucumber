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

package com.liferay.poshi.runner.selenium;

import com.liferay.poshi.runner.util.OSDetector;
import com.liferay.poshi.runner.util.PropsValues;
import com.liferay.poshi.runner.util.StringPool;
import com.liferay.poshi.runner.util.StringUtil;
import com.liferay.poshi.runner.util.Validator;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * @author Brian Wing Shun Chan
 * @author Kenji Heigel
 * @author Michael Hashimoto
 */
public class WebDriverUtil extends PropsValues {

	public static WebDriver getWebDriver() {
		return _instance._getWebDriver();
	}

	public static void startWebDriver() {
		_instance._startWebDriver();
	}

	public static void stopWebDriver() {
		_instance._stopWebDriver();
	}

	private WebDriver _getFirefoxDriver() {
		FirefoxProfile firefoxProfile = new FirefoxProfile();

		firefoxProfile.setPreference("browser.download.folderList", 2);
		firefoxProfile.setPreference(
			"browser.download.manager.showWhenStarting", false);
		firefoxProfile.setPreference("browser.download.useDownloadDir", true);
		firefoxProfile.setPreference(
			"browser.helperApps.alwaysAsk.force", false);
		firefoxProfile.setPreference(
			"browser.helperApps.neverAsk.saveToDisk",
			"application/excel,application/msword,application/pdf," +
				"application/zip,audio/mpeg3,image/jpeg,image/png,text/plain");
		firefoxProfile.setPreference("dom.max_chrome_script_run_time", 300);
		firefoxProfile.setPreference("dom.max_script_run_time", 300);

		return new FirefoxDriver(firefoxProfile);
	}

	private WebDriver _getWebDriver() {
		return _webDriver;
	}

	private void _startWebDriver() {
		_webDriver = _getFirefoxDriver();
	}

	private void _stopWebDriver() {
		if (_webDriver != null) {
			_webDriver.quit();
		}

		_webDriver = null;
	}

	private static final WebDriverUtil _instance = new WebDriverUtil();

	private WebDriver _webDriver;

}