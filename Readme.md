#Introduction

This is me messing around with args4j library. This allows you to parse commands via the command line.

###This is WIP:

###Without the exec-maven-plugin

Prior to me adding the 'exec-maven-plugin' in the pom.xml file, in order to parse the arguments, I needed to first:

1) Run: 

```sh
$ mvn compile
```

2) On the command line, I then did this...

```sh
$ mvn exec:java -Dexec.mainnamClass="com.richard.Main" -Dexec.arguments=-name=richard,-age=12
```

NOTE:

mvn exec:java -Dexec.mainClass="com.richard.Main" -Dexec.args=-name=richard,-age=12 DID NOT WORK. 

The maven build was a success but 'name' was assigned both parsed arguments:

> name: richard,-age=12
> age: null

###With the exec-maven-plugin

1) Run:

```sh
$ mvn compile
```

2) On the command line, I can then do...

```sh
$ mvn exec:java -Dname=roger -Dage=43
```

...and the following is printed

> name: roger
> age: 54
> Unknown name

###Next Steps:

2) Get to a stage where i can just do a 'mvn clean install -Dname=richard -Dage=12' on the command line



###Websites I've used so far:

- http://args4j.kohsuke.org/sample.html
- http://www.vineetmanohar.com/2009/11/3-ways-to-run-java-main-from-maven/
- http://stackoverflow.com/questions/1200054/java-library-for-parsing-command-line-parameters
- http://www.mojohaus.org/exec-maven-plugin/usage.html
- https://redstack.wordpress.com/2010/12/22/configuring-maven-to-run-your-java-application/
- http://stackoverflow.com/questions/5396749/pass-command-line-params-in-mvn-execexec