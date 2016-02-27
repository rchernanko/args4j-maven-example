#Introduction

This is me messing around with args4j library. This allows you to parse commands via the command line.

###This is WIP:

At the time of writing - in order to parse the arguments, I need to first:

1) Run a mvn compile

2) On the command line, I can then do this...

mvn exec:java -Dexec.mainClass="com.richard.Test" -Dexec.arguments=-name=richard,-age=12

NOTE:

mvn exec:java -Dexec.mainClass="com.richard.Test" -Dexec.args=-name=richard,-age=12 DID NOT WORK. 

The maven build was a success but 'name' was assigned both parsed arguments:


"
Business-Logic
- name: richard,-age=12
- age: null
"


###Next Steps:

1) Install the maven exec plugin and get it working this way

2) Get to a stage where i can just do a 'mvn clean install -Dname=richard -Dage=12' on the command line



###Websites I've used so far:

http://args4j.kohsuke.org/sample.html
http://www.vineetmanohar.com/2009/11/3-ways-to-run-java-main-from-maven/
http://stackoverflow.com/questions/1200054/java-library-for-parsing-command-line-parameters
http://www.mojohaus.org/exec-maven-plugin/usage.html
https://redstack.wordpress.com/2010/12/22/configuring-maven-to-run-your-java-application/
http://stackoverflow.com/questions/5396749/pass-command-line-params-in-mvn-execexec