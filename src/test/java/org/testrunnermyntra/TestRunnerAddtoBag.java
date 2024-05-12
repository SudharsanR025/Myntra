package org.testrunnermyntra;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features= "D:\\Java\\Myntra\\src\\test\\resources\\Features\\AddtoBag.feature",
		         glue="org.stepdefenitionmyntra" ,
		         dryRun= false,
		         plugin="html:D:\\Java\\Myntra\\src\\test\\resources\\Reports\\addtoBag.html",
		         tags ="@sanity")
public class TestRunnerAddtoBag {

}
