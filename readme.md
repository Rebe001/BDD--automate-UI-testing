# BDD - Automate UI testing Demo
This project shows a simple test case - creating a purchase order form from app using automate UI testing. Code are modified from my work project.

[More Details](https://rebecca-li-portfolio.imfast.io/)



## Table of contents
* [Technologies](#technologies)
* [Design test case](#design-test-case)
* [Project infrastructure](#project-infrastructure)
* [Support](#Support)




## Technologies
Project is created with - 
* Test execuetion Framework: Behaviour Driver Development (BDD)
* BDD language: Cucumber
* Web test Scripting language: Selenium
* Unit testing framework: Junit
* Design pattern: Page Object Model & Page Factory 
	



## Design test case

Test case is shown in path /features/component/demo.feature

It simulates the process of creating a purchase order form from app. As an admin user, he/she is able to create and save purchase order form. The test verifies create success message is displayed after clicking save button.




## Project infrastructure
	frontend testing demo/
		features/
			component/
				demo.feature
		src/
			controller/
				pages/
					DemoPage.java
					LoginPage.java
					MainPage.java
				CommonController.java
			data/
				ProjectConstants.java
			library/
				pages/
					DemoPage_Library.java
					LoginPage_Library.java
					MainPage_Library.java
		read.me
   
   

## Support 
By modifying webdriver, it can support UI testing with the following browsers:

* Chrome
* Firefox
* Internet Explorer
   


* Contributor: Rebecca
* Date: 10/06/2020