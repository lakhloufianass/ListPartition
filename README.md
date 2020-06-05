# ListPartition

# Launch the project

In order to test the project you can import the project to the IDE as a maven project and go to the Main class in com.partition and comment from the line 12 to 24 and uncomment line 25.
  > customizeTest()
You can then play with the values and parameter as you want 😄.

otherwise you can run the project from the command line with the following command : 

> mvn exec:java -Dexec.mainClass="com.partition.Main"

This command will launch the Main class of the application and will use parameters from the pom.xml in the configuration part.

The last argument represent the size of the sublists. A default value of 2 is given if the given argument weren’t a number

# Launch the project tests

If you have imported the project to the IDE you can run the tests directly fom the tests's class or with maven with the following command
> mvn test
