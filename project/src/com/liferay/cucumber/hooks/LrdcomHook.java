package com.liferay.cucumber.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @author Michael Hashimoto
 * @author Brian Chiu
 */
public class LrdcomHook {

    @Before("@lrdcom-hook")
    public void setup() {
        System.out.println("Setting it up..");
    }

    @After("@lrdcom-hook")
    public void teardown() {
        System.out.println("Tearing it down..");
    }

}