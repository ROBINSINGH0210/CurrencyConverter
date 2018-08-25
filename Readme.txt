Technology Used:
	-Java 8
	-Spring Boot, Cache, Security
	-JPA, H2 database.
	-AngularJS
	-JSP
	-IDE: Eclipse Oxygen
	-Apache commons-validator To provide Email validation as per RFC

How to run application.

First Way:
	-Either you can run application by WebApplication.Java class main method or by using right click and then run as Spring Boot app.

Second Way:
	-Use mvn clean install either from Eclipse or from CMD to build the project then Copy .war file from target folder to Tomcat webapps folder. Then start the tomcat.
		
		
Access URL:
	http://localhost:8080/login

Welcome Page Fields/Buttons:
	-Current Rates: This will provide you the popular current Currency Rates on the BASE of USD.
	-Historical Rates: Choose Historic Dates and click Historical Rates to get that particular Date data.
	-Get Previous Data: To fetch the last 10 data.

Note: Currency Date timestamp is unique field to avoid duplication of data. If Want to allow duplication Please remove unique = true from callDate column from CurrencyEntity.java 

Possible Bug Present in openexchangerates.org in Historic Rates API.
	-Response send TimeStamp date of next date to historic date. Ex: If I hit for 12-Feb-2018 then API response contains the TimeStamp for 13-Feb-2018. 		
	

	