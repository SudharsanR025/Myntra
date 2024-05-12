package org.testrunnermyntra;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Java\\Myntra\\src\\test\\resources\\Features\\Hotcoupons.feature" ,
                  glue = "org.stepdefenitionmyntra",
                  dryRun = false ,
                  monochrome = true,
                  plugin = "html:D:\\Java\\Myntra\\src\\test\\resources\\Reports\\myntracoupon.html" )
public class TestRunnerMynCoupon {

}
