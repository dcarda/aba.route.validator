@rem THIS FILE WILL BUILD THE MODULE (NO UNIT TESTS).
ECHO OFF
cls

ECHO ===============================  DELETE THE ARTIFACTS
call mvn clean

ECHO
ECHO ===============================  BUILD THE APPLICATION
call mvn ^
    -Dmaven.test.skip=false ^
    clean package -fae
 
ECHO
ECHO ===============================  DONE!
