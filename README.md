# Expedia-Task2
Below are the tasks are done for the Assignment:


selenium-cucumber : Automation Testing Using Java

selenium-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web. It enables you to write and execute automated acceptance/unit tests. It is cross-platform, open source and free. Automate your test cases with minimal coding.


src/test/resources/features - all the cucumber features files (files .feature ext) goes here.
src/test/java/userStepDefinition - you can define step defintion under this package for your feature steps.
src/test/java/Myrunner - this package contains cucumber runner where you can configure your glue code location (step defintions), define test result output format.(html, json, xml). Hooks where you can configure all before and after test settings Hooks.java, DriverUtil.java contains code for intializing driver instances for respective driver.
src/main/java/test-output - All reports are available here.
