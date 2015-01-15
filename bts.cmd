@rem THIS FILE WILL BUILD THE MODULE (NO UNIT TESTS).
ECHO OFF
cls

ECHO ===============================  DELETE THE ARTIFACTS
@rem call mvn clean

ECHO
ECHO ===============================  BUILD THE APPLICATION
call mvn ^
    -Dmaven.test.skip=false ^
     package test site -X
 
ECHO
ECHO ===============================  DONE!
