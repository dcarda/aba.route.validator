::  Personal Comment...
::  This is mainly a “Dan Carda” thing!
::  
::  In my career I have found it nearly impossible to keep all projects
::  on the save version of compiler, and build environment.
::  
::  The other thing I’ve noticed is that these modern IDE’s, while a 
::  godsend, are a little bit TO smart.  They have the ability To 
::  inadvertently mask problems.
::  
::  Consequently, what I’ve learned to do is build at the command line.  
::  Because every project might be different I use a batch file to configure
::  the command prompt window.  This solves all problems!
cls
@echo off

::  Set the path for Java
set JAVA_HOME=D:\Projects\WildFly\jdk-11.0.7

::  Set the path for Apache Maven
set MAVEN_HOME=D:\Tools\Java\Apache\apache-maven-3.6.3

::  Update the command window Path setting
set PATH=%JAVA_HOME%\bin;%MAVEN_HOME%\bin;%PATH%

echo.
echo.
echo.
ECHO ---Display Console Information
echo  --  JAVA        -------------------------------------------------
java -version 
echo.
echo  --  MAVEN       -------------------------------------------------
mvn -version
