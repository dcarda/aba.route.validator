#!/bin/bash

clear

export JAVA_HOME=/d/Tools/Java/JDK/jdk-11.0.11
export ANT_HOME=/d/Tools/Java/Apache/apache-ant-1.10.11
export MAVEN_HOME=/d/Tools/Java/Apache/apache-maven-3.9.0

export PATH=$JAVA_HOME/bin:$ANT_HOME/bin:$MAVEN_HOME/bin:$PATH

# Update the Path
export PATH=$JAVA_HOME/bin:$PATH

# Display Information
echo --  BASH   ----------------------------------------------------------
which bash
bash -version
echo
echo --  JAVA   ----------------------------------------------------------
which java
java -version
echo
echo --  MAVEN  ----------------------------------------------------------
which mvn
mvn -version
echo
echo --  ANT    ----------------------------------------------------------
which ant
ant -version
echo
#echo --  GRADLE   ----------------------------------------------------------
#which gradle
#gradle -version

