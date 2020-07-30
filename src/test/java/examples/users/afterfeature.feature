Feature: End and flush extent report
  Scenario: Flush extent report after completion of feature
    * def ExtentReportingClass = Java.type('examples.users.ExtentReporting')
    * def endTest = ExtentReportingClass.endTest()
