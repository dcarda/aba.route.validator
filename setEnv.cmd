@echo off
cls

:: Set Java Environment Variables.
set JAVA_HOME=D:\Tools\Java\JDK\jdk1.8.0_251
set  JRE_HOME=D:\Tools\Java\JDK\jre1.8.0_251

REM Set Maven environment Variables.
set MAVEN_HOME=D:\Tools\Java\Apache\apache-maven-3.6.3


REM  --------------------------------------------------------------------
REM                    ---  MODIFY DATA ABOVE LINE  ---


REM Update the PATH statement
set PATH=%JAVA_HOME%\bin;%MAVEN_HOME%\bin;%PATH%
@echo on



::  Display Information
::  echo  --  BASH        -------------------------------------------------
::  which bash
::  bash --version
::  echo
echo   --  JAVA        -------------------------------------------------
which java
java -version
echo
REM   --  MAVEN       -------------------------------------------------
which mvn
mvn -version
echo
echo
echo