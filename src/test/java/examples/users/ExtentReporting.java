package examples.users;

import com.aventstack.extentreports.ExtentTest;

public class ExtentReporting {
    private static ExtentTest test;

    public static void createTest(String scenarioName){
        test = ExtentManager.getInstance().createTest("<b>Scenario: </b>" + scenarioName);
        test.info("<b>Scenario Name: </b> " + scenarioName);
    }

    public static void endTest(){
        ExtentManager.getInstance().flush();
    }
}
