package com.testrun;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		plugin= {"json:target/cucumber.json"},
		features= {"./src/main/resources/parabanklogin.feature"},
		glue= {"com.generic"},
		tags= {"@Smoke"},
		dryRun=false,
		strict=true,
		monochrome=true
		
		)

public class Runner extends AbstractTestNGCucumberTests{
	@Before
	public void setup(){}
	
	@BeforeTest
	public void setup2(){}
	
	@Test
	public void setup3(){}
	
	@AfterTest
	public void setup4(){}

}

