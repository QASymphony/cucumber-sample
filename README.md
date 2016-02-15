### Cucumber Sample Demo 

This package includes sample java code integrate with Cucumber testing framework.

This package can be compiled with Maven / Ant

Cucumber Sample demo integrate with qTest Automation Host

### How to use sample package to integrate with qTest Automation Host
- First, setup qTest Automation Host. And install Cucumber for Java framework in qTest Automation Host.
- Download Cucumber sample package and unzip in your directory (eg: D:\Demo\cucumber-sample).
- Set up new agent with configure Agent below:

### Agent Configuration
How to configure Cucumber for Java to run with Java Command Line

- Executable mode: Command
- Executable home: C:\Program Files\Java\jdk1.7.0_21
- Command: java
- Command arguments: -classpath D:\Demo\cucumber-sample\target; cucumber.api.cli.Main -g "com/glue" -p "pretty" "D:\Demo\cucumber-sample\resources\feature"

![Agent Configuration](/documentation/agent-configuration.png?raw=true)