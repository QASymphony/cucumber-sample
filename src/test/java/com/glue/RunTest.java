package com.glue;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by duongnapham on 3/2/15.
 */
@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,
                    junit = "--step-notifications",
                    strict = true,
                    features = ".",
                    monochrome = true,
                    glue = "com/glue",
                    plugin = {"pretty"}
                )
public class RunTest {
}
