# ISEZ-TA
Test automation project here. Core techonologies - Selenium (Selenide), TestNG , Allure as reporting system. Ready to be deployed. Passwords are not commited to this project 
for obvious reasons.
Can be ran on any CI/CD system using. Browsers, test suites etc. can be parameterized:  
```mvn -Dsurefire.suiteXmlFiles=src/test/resources/smoke.xml -Dusers=userbase -Dselenide.headless=false -Denv=test-env clean test```  
Building report system:  
```mvn allure:serve```

