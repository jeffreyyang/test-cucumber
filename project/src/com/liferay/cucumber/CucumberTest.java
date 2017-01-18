package com.liferay.cucumber;

import com.liferay.cucumber.selenium.SeleniumUtil;

import cucumber.runtime.ClassFinder;
import cucumber.runtime.Runtime;
import cucumber.runtime.RuntimeOptions;
import cucumber.runtime.io.MultiLoader;
import cucumber.runtime.io.ResourceLoader;
import cucumber.runtime.io.ResourceLoaderClassFinder;

import java.io.IOException;
import java.util.ArrayList;

import static java.util.Arrays.asList;

public class CucumberTest {

    public static void main(String[] args) throws Throwable {
        SeleniumUtil.startSelenium();

        Thread currentThread = Thread.currentThread();

        byte exitstatus = run(args, currentThread.getContextClassLoader());

        SeleniumUtil.stopSelenium();

        System.exit(exitstatus);
    }

    public static byte run(String[] args, ClassLoader classLoader)
        throws IOException {

        RuntimeOptions runtimeOptions = new RuntimeOptions(
            new ArrayList<String>(asList(args)));

        ResourceLoader resourceLoader = new MultiLoader(classLoader);

        ClassFinder classFinder = new ResourceLoaderClassFinder(
            resourceLoader, classLoader);

        Runtime runtime = new Runtime(
            resourceLoader, classFinder, classLoader, runtimeOptions);

        runtime.run();

        return runtime.exitStatus();
    }
}