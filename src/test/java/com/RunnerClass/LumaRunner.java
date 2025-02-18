package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features={"src\\test\\java\\com\\featureFiles\\Luma.feature"},
		glue = {"com.lumaStepDef","com.hooks"},
		monochrome = false,
		dryRun = false,
		publish= false,
		plugin= {
				"html:LumaReports/LumarHTMLReports.html",
				"json:LumaReports/LumaJSONReports.json",
				"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:targetTimeline/cucumber"
				}
		)









public class LumaRunner {

	
	
	
	
	
}
