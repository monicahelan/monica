package org.test;
import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Feature file"},glue="org.stepDef",monochrome=true,dryRun=false,plugin= {"pretty","json:src\\test\\resources\\Reports\\Cucumber.json"})

public class TestRunner  {
	@AfterClass
	public static  void after() {
		JVMReport.generateJvm("C:\\Users\\Dell\\eclipse-workspace\\Lennox\\src\\test\\resources\\Reports\\Cucumber.json");

	}
}
