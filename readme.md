# BDD - Automate UI testing Demo
This project shows a simple test case - creating a purchase order form from app using automate UI testing. Code are modified from my [work project](https://rebecca-li-portfolio.imfast.io/)


<br>
This is a simplied architecture diagram based on my work project. It shows how front end connects with back end, production site and SAP in a higher level:

![alt text](https://github.com/Rebe001/BDD-automate-component-testing-demo/blob/master/images/project_archiecture.jpg?raw=true)




## Table of contents
* [Flow chart of app](#flow-chart-of-app)
* [Design test case](#design-test-case)
* [Built with](#built-with)
* [Directory tree structure](#directory-tree-structure)
* [Support](#support)
* [Author](#author)


## Flow chart of app

This is a simplied flow diagram of an app on UI layer. It demonstrates a sequence of pages will be prompted by various actions. 

The flows hightlighted in blue is the only one that will be included in `TestFormPage.feature`.
<br> 
![alt text](https://github.com/Rebe001/BDD-automate-UItesting/blob/master/images/flowChartFormPage.png?raw=true)

	



## Design test case

Test case [TestFormPage.feature](/features/component/TestFormPage.feature) is shown under path `/features/component/TestFormPage.feature`.


Automated UI test is created to verify a form is successfully created from an app thus feature can be deliverable. This test case simulates the process of creating a purchase order form from app, from login, create form, set product and quantity, to finally save purchase order form. The test then verifies create success message is displayed after clicking save button.

Here shows a step by step series of steps that explains the design of test case using Behaviour Driver Development (BDD) as the framework.

This step makes use of `@Given` Cucumber annotation, which describes pre-requisite for the test to be executed. The aim of this step is to simulate an admin user fill in default username and password and click on login. Main page is landed.

```
Given LoginPage click on login button
```
This step makes use of `@When` Cucumber annotation, which defines the trigger point for any test scenario execution. It simulates click action on create form button to direct to form detail page.

```
When MainPage click on create form button
```
This step makes use of `@And` Cucumber annotation, which provides the logical AND condition between any two statements. It set product to desired value.  `product` is parameterised by open-closde principle, so it can easily extended by other products.
```
And FormPage set product to "<product>"
```
This step set quantity to desired value.
```
And FormPage set quantity to "<quantity>"
```
This step simulate a clikc on save button.
```
And FormPage click on save button
```
This last step makes use of `@Then` Cucumber annotation, holds the expected result for the test to be executed. It verifies whether success message is displayed with desirable message.
```
Then Verify FormPage success message is displayed
```
`Scenario Outline` keyword can be used to run the same Scenario multiple times, with different combinations of values. `Èxamples` is container for different values.

```
Examples:
  |product    | quantity  |
  |product1   | 1    	  |
  |product2   | 99     	 |
```


   
## Built with
* Test execuetion Framework: [BDD](https://cucumber.io/docs/bdd/)
* BDD language: [Cucumber](https://cucumber.io/docs/guides/overview/)
* Web test Scripting language: [Selenium](https://www.selenium.dev/)
* Unit testing framework: [Junit](https://junit.org/junit4/)
* Design pattern: [Page Object Model & Page Factory](https://www.selenium.dev/documentation/en/guidelines_and_recommendations/page_object_models/)


## Directory tree structure
```
	└─ Bdd automate UI testing demo/
		├─ features/
		|	└─ component/
		|		└─TestFormPage.feature
		├─src/
		|	├─data/
		|	|	└─ProjectConstants.java
		|	|
		|	├─library/
		|	|	└──pages/
		|	|		├─FormPage_Library.java
		|	|		├─LoginPage_Library.java
		|	|		└─MainPage.java
		|	|	
		|	└─controller/
		|		├─pages/
		|		|	├─FormPage.java
		|		|	├─LoginPage.java
		|		|	└─MainPage.java
		|		└─DemoServiceController.java
		|	
		└─readme.md
``` 


## Support 
By modifying webdriver, it can support UI testing with the following browsers:

* Chrome
* Firefox
* Internet Explorer
   

## Author
* Contributor: Rebecca
* Date: 24/06/2020