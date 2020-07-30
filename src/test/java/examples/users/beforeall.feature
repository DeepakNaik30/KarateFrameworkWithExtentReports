Feature: Initialize extent report

  Scenario: Initialize extent report instance
    * def ExtentManagerClass = Java.type('examples.users.ExtentManager')
    * def callBeforeAllMethod = ExtentManagerClass.initializeExtentReport()

