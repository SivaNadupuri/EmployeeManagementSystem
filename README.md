# EmployeeManagementSystem
---------------------------------------
Application Name: EmployeeManagementSystem
----------------------------------------

-------------------------
Technical stack
-------------------------

Java 1.8, Springboot 2.0, Spring DataJPA, H2 in memory Database, Maven , Integration test for junti test case.

----------------------------------------------------------------
Application Setup and Instructions of Application to make it run.
------------------------------------------------------------------
you need to have java 1.8 or higher version in machine to run this application. you need one rest client(postman, ARC or SoapUI) to test rest api's.

Spring tool suite or Eclipse or intellijIDEA required for develop applications, I have used inmemory database(H2) to store the data in databse temporarily.

Once you statrt the Application H2 database console is enabled, If you stop application data got deleted from DB.

for this application added for update and delete operations as well.

Application deployed in embedded tomcat which is provided by Springboot.


Rest end points:

POST: http://localhost:2020/api/v1/employees 

Sample Json request: 

{
	"firstName": "Siva",
    "lastName": "Nadupuru",
    "emailId" :"siva.nadupuru@gmail.com"
}

GET:   http://localhost:2020/api/v1/employees 


PUT:  http://localhost:2020/api/v1/employees/1

    Sample json requeust for update:
    
    {
	"firstName": "Siva",
    "lastName": "Nadupuru",
    "emailId" :"siva.nadupuru@gmail.com"
}

DELETE:http://localhost:2020/api/v1/employees/11.



H2 console link:
--------------

http://localhost:2020/h2















