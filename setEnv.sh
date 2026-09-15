#!/bin/bash
# ==============================================================================
# Script Name:   setEnv.sh
# Description:   This scrip configures a terminal environment.
#                I have found that when working on multiple projects it's
#                easier to configure a terminal environment and compile there.
#
# Author:        Daniel Carda
# Usage:         source ./setEnv.sh
# ==============================================================================

clear

export JAVA_HOME=/opt/zulu17.68.203-ca-jdk17.0.20.1-linux_x64

export ANT_HOME=/opt/apache/apache-ant-1.10.18
export MAVEN_HOME=/opt/apache/apache-maven-3.9.16

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
echo ~/.m2/repository/
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
