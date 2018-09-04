Technology Used:
	-Java 8
	-Spring Boot, Cache, Security
	-JPA, H2 database.
	-AngularJS
	-JSP
	-IDE: Eclipse Oxygen
	-Apache commons-validator To provide Email validation as per RFC
	-JUnit Test Cases

How to run application.

First Way:
	-Either you can run application by WebApplication.Java class main method or by using right click and then run as Spring Boot app.

Second Way:
	-Use mvn clean install either from Eclipse or from CMD to build the project then Copy .war file from target folder to Tomcat webapps folder. Then start the tomcat.
		
		
Access URL:
	http://localhost:8080/login

Welcome Page Fields/Buttons:
	-Current Rates: This will provide you the popular current Currency Rates on the BASE of USD.
	-Historical Rates: Choose FROM, TO, AMOUNT, Historic Dates and click Historical Rates to get that particular Date data.
	-Get Previous Data: To fetch the last 10 data.
	
EmailValidation Pattern Used:
	Email validation used as mentioned in https://www.w3.org/TR/html5/forms.html#valid-e-mail-address(RFC1123).




	

	