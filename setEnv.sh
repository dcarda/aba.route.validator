#!/bin/bash

clear

export JAVA_HOME=/d/Tools/java/JDK/Amazon/jdk17.0.9_8
export ANT_HOME=/d/Tools/Java/Apache/apache-ant-1.10.11
export MAVEN_HOME=/d/Tools/Java/Apache/apache-maven-3.9.6

export PATH=$JAVA_HOME/bin:$ANT_HOME/bin:$MAVEN_HOME/bin:$PATH

# Update the Path
export PATH=$JAVA_HOME/bin:$PATH

#  --------------------------------------------------------------------
# Record our starting directory
startDir=$(pwd)

# Change to the base repository directory.
myvariable=$(whoami)
cd /c/Users/$myvariable/.m2/repository/

echo
echo Repository Root:
echo /c/Users/$myvariable/.m2/repository/
#
#  Delete all the *.lastUpdated and resolver files.
echo
echo "-----------------------------------------------------------"
echo "Cleaning up dead files in the Maven repository...."
find .  -type f -name "*.lastUpdated" -exec rm --force "{}" +;
find .  -type f -name "resolver-status.properties" -exec rm --force "{}" +;
echo "Finished Cleaning!  Maven repository is clean..."
echo "-----------------------------------------------------------"
echo
echo

# Change back to the starting directory.
cd $startDir

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
