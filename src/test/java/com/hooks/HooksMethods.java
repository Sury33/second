package com.hooks;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.resuableMethods.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksMethods extends Baseclass {

	@Before
	public void beforeHooks(Scenario s) {
		String name = s.getName();
		System.out.println("Scenario Name :" + name);
		System.out.println("Scenario Started");

	}

@After
public void afterhooks(Scenario s) throws Throwable {
	

	// To attached  the Screenshot to the Reports

			if(s.isFailed()) {
				TakesScreenshot ts =(TakesScreenshot)driver;
				byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
				s.attach(screenshotAs, "image/png", "isfailed");

}else {
	String name2 = s.getName();
	
	TakesScreenshot ts =(TakesScreenshot)driver;
	 byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
	 s.attach(screenshotAs, "image/png", "ispassed");
	

							}
	
}
}
