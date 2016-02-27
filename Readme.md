###WIP

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


###NEXT STEPS:

1) Install the maven exec plugin and get it working this way

2) Get to a stage where i can just do a 'mvn clean install -Dname=richard -Dage=12' on the command line