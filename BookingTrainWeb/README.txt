// READ ME FIRST
AUT: http://booking.uz.gov.ua/ 
You have to implement the following Test Case: 
- Select Departure Station from list 
- Select Destination Station from list 
- Select Departure Date 
- Click "Search" button 
- Verify that table with results are displayed 
- Verify that table contains necessary train numbers 
Test Data: 
Departure     Destination             Train                         Date 
1. Kyiv         Ivano-Frankivsk      115 ?, 269 ?           1 month ahead from today 
Use PageObject and HTMLElements approaches to achieve DRY and KISS principles 
Note: You can use http://booking.uz.gov.ua/en/ for English version (Multilanguage is not a case for now)
As result - your maven project on GitHub





	How use this project
	We can open this project inside IntelIGIdea performing click on pom.xml file (may be you need add set environment variables - see p.2)

    How Create same Project - Steps to reproduce
    // 1. Create ProjectFolder "HomeWork2"
    // 2. Till execute command "mvn archetype:generate" – we must download maven package and set environment variables M2_HOME and PATH %M2_HOME %\bin
    // 3. Open CommandPromt as Administrator and go to ProjectFolder "HomeWork2"
    // 4. Execute command: mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.1 
          -DgroupId=com.gl.traneapp -DartifactId=bookingtrainweb -DinteractiveMode=false

	


	


