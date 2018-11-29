package com.executor;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/features"},
		glue={"com.stepDefinations"},
//		tags="@login,@login123",
		tags="@login123",
		plugin ={"pretty","html:target/htmlreports/report.html","json:target/report.json" },
		monochrome = true
		)
public class TestRunner {

	
}
