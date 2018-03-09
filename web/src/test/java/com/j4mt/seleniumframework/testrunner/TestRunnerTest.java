package com.j4mt.seleniumframework.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.JUnitCore;

@CucumberOptions(
        features = "resources/features",
        glue = {"com.j4mt.seleniumframework.steps"},
        plugin = {
                "io.qameta.allure.cucumberjvm.AllureCucumberJvm",
                "pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumber1.json"
        },
        strict = true
)
public class TestRunnerTest extends AbstractTestNGCucumberTests {

    public static void main(String[] args) {
        JUnitCore.main("com.j4mt.seleniumframework.testrunner");
    }

}
