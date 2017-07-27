Documentation:

	Project name : Finacc klt user crud
	Days took to build : Approximately 2hours.
------------------------------------------------------------------------------------------------------------------------
Steps to run the project:

Step 1.

	Open terminal and goto the basediretory :

	cd /path/to/project/klt

for listing the files in the directory.

	ls

Output :
You will get the following structure:

	pom.xml
	src
	target

Step 2.

a. Using Java :

You must to have java installed on your machine :
	If java is not installed, use  https://www.java.com/en/download/help/download_options.xml to install.
	If java is already installed, I have kept jar in run directory which can be used to directly run the code:

	java -jar target/klt-0.0.1-SNAPSHOT.jar

OR

b. Using Maven :
You much have maven installed on your machine :
If maven is not installed, use https://maven.apache.org/install.html to install.
If maven is already installed :

	mvn clean install spring-boot:run

Step 3. to check whether REST APIs of application is working or not. Open browser and go to below url:

	http://localhost:4040/api/v1/hello

Output:
You will get below text as response.

	Hello Engineers at Check24

Hurray! Application is ready to use.
------------------------------------------------------------------------------------------------------------------------
Step 4: to check the front-end of web application with the perspective of end user. Open browser and go to below url:

	http://localhost:4040

	Output :
	The above link will redirect to analysis page where you need to put input in the text field and press search button or hit enter.
------------------------------------------------------------------------------------------------------------------------

Step 5 : To check, the REST apis of web application. Open browser and go to below url :

	 http://localhost:4040/s or  http://localhost:4040/swagger or http://localhost:4040/swagger-ui.html

------------------------------------------------------------------------------------------------------------------------
Step 6 : To run the test of the application :
a. First stop the application(assuming you were already running the application using above steps) using following keys :

	ctrl+c

b. As this project is Maven project. If you run project using maven commands, test will automatically starts while running the application. Using following commands on terminal to run application via maven.

	mvn clean install spring-boot:run

Output :

This command also builds the project and runs test cases and followed by start the web application too.

	 Results : Tests run: 5, Failures: 0, Errors: 0, Skipped: 0 [INFO]  [INFO] --- maven-jar-plugin:2.6:jar (default-jar) @ klt ---[INFO] Building jar: /Users/sharif/Documents/Backup-data/My Documents/gitrepo/klt/target/klt-0.0.1-SNAPSHOT.jar



##Project Modules :

	This project consists of two major parts :
	a. Backend - RESTful api's build in Java Spring framework.
	b. Front-end - Single Page Application using Angular.
------------------------------------------------------------------------------------------------------------------------

Project architectural points:

	Points regarding the development phase:

i. Modularise :

	For the time being I have modularise the project on package level.
	Later we can also modularise in maven modules.

------------------------------------------------------------------------------------------------------------------------
ii. Plugins used :

	Lombok : https://projectlombok.org/

------------------------------------------------------------------------------------------------------------------------
ii. Unit tests:

	Unit test written using spring boot test context and only exception thrown use cases.

------------------------------------------------------------------------------------------------------------------------
iii. Front-end :

	Single page application : Used Angular. Directory the source files are src/main/resources/frontend
	For the time being, all the source code is in same project later we can have different project for frontend.

	we can also run the frontend on any server, for development I have configured backend to accept all the request from localhost:4200 where the frontend was running while I code.

------------------------------------------------------------------------------------------------------------------------
iv. Documentation for RESTful apis:

	Swagger : http://swagger.io/
	I’ve added swagger framework for testing the apis.
	you can find it http://localhost:8080/swagger or http://localhost:8080/swagger-ui.html

------------------------------------------------------------------------------------------------------------------------
v. Comments :

	Entire code styling is influenced by Clean Code principle - Robert Martin
	Which says
	'Truth can only be found in one place: the code’.
	So you may not found any comments anywhere in the project.
	Keeping in mind that git can be used to manage version of file and method name should be kept as self explanatory.

	However, if you need comments on each file. I can do that too.

------------------------------------------------------------------------------------------------------------------------
vi. Design principles used in Project :

	a. SOLID (single responsibility, open-closed, Liskov subsitution, interface segragation, dependency inversion) principle,
	b. Composition over inheritance,
	c. DRY(Don’t repeat yourself),
	d. Test only exceptions,
	e. KISS(Keep it simple, stupid)
	f. and some experience principle ;)

------------------------------------------------------------------------------------------------------------------------
Testing (automation) and Test cases with TDD approach:

	a. I have written only exception thrown unit test case we can also write the positive test cases in future.

	b. E2E test can be written for automate the testing in Angular using protactor.

	c. We can also write Chakram test for testing RESTful API's.

	d. Right now, all the unit cases is check at the time of build the project but once the project is has team, we can also setup jenkins server and I can configure it to check stability of project reqularly with any version control.
