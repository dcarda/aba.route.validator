::
::  This is just my generic build file for DOS.  It just 
::  automates all the steps I usually do anyway.
cls

::  Just a little cleanup.  Remove the Maven target/ directory.
DEL   /F/Q/S target  > NUL
RMDIR /Q/S target



::  This will run a Apache Maven dependency update.
::  This scan the maven pom.xml file and will download any
::  dependencies and place them in:
::      .\target\dependency
::call mvn clean package
::  Used to build the site reports
call mvn -P genReports clean package site
