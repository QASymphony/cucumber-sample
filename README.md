### Cucumber Sample Demo 

This package includes sample java code integrate with Cucumber testing framework.

This package can be compiled with Maven / Ant

Cucumber Sample demo integrate with qTest Automation Host

### How to use sample package to integrate with qTest Automation Host
- First, setup qTest Automation Host. And install Cucumber for Java framework in qTest Automation Host.
- Download Cucumber sample package and unzip in your directory (eg: D:\Demo\cucumber-sample).
- Compile and package cucumber sample into jar file with 
   - Open command prompt in windows or terminal command
   - Run command below to pack sample project into a jar file
     
     Maven command: mvn compile package test
     
     Ant command: ant all
     
- Set up new agent with configure Agent below:

### Agent Configuration

![Agent Configuration](/documentation/agent-configuration.png?raw=true)
