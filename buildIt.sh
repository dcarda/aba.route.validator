#!/bin/bash
echo -ne "\e]0;      ◈   ABA Routing Validator Module Build   ◈\a"
 
clear
#================================================================
#
#          FILE:%A0 buildIt.sh
#
#         USAGE:  ./buildIt.sh
#
#   DESCRIPTION:  Used to build the ABA Routing Number validator.
#
#       OPTIONS:  ---
#  REQUIREMENTS:  ---
#          BUGS:  ---
#         NOTES:  ---
#        AUTHOR:  Daniel Carda
#                 CodeWarrior@CardaTechnologies.com
#       COMPANY:  CardaTechnologies, LLC
#       VERSION:  1.0
#       CREATED:  02/15/2015
#      REVISION:  ---
#
#================================================================
 
#numberOfArgs=0
#paramterArg=""
#
startDir=$(pwd)
 
#  These are used for timing.
begin=$(date +"%s")
startingTime=$(date +"%D %T.%3N")
 
#===  FUNCTION   ================================================
#         Name:  build_EarArtifact()
#  --------------------------------------------------------------
#  Description:  This will build the main EAR artifact.
#   Parameters:  None
#      Returns:  None
#================================================================
function build_EarArtifact() {
 
  echo
  echo
  echo
 
  # =======================================================================
  #  Build everything
  mvn clean install
 
  # Check results.
  if [ $? -ne 0 ]; then
    echo
    echo "Failure: Cannot Delete:  target/"
    terminationAbnormal
  fi
} # ---  End Function build_EarArtifact()
 
#===  FUNCTION   ================================================
#         Name:  build_SiteReports()
#  --------------------------------------------------------------
#  Description:  This will build the main EAR artifact.
#   Parameters:  None
#      Returns:  None
#================================================================
function build_SiteReports() {
 
  echo
  echo "NOT WORKING AT THIS TIME!"
  terminationAbnormal
 
  # =======================================================================
  #  Build everything
  mvn -P genReports clean install site
 
  # Check results.
  if [ $? -ne 0 ]; then
    echo
    echo "Failure: Cannot Delete:  target/"
   terminationAbnormal
  fi
} # ---  End Function build_SiteReports()
 
#===  FUNCTION   ================================================
#         Name:  delete_Artifacts()
#  --------------------------------------------------------------
#  Description:  This will run the Maven site build.
#   Parameters:  None
#      Returns:  None
#================================================================
function delete_Artifacts() {
 
  # =======================================================================
  echo "Cleaning up files and directories..."
 
  # Hammer Time!!!
  rm --force --recursive target/
  if [ $? -ne 0 ]; then
    echo
    echo "Failure: Cannot Delete: target/"
    terminationAbnormal
  fi
  echo -ne "."
  
} # ---  End Function delete_Artifacts()
 
#===  FUNCTION   ================================================
#         Name:  display_MainHeader()
#  --------------------------------------------------------------
#  Description:  Displays header.
#   Parameters:  None
#      Returns:  None
#================================================================
function display_MainHeader() {
 
  echo
  echo
  echo
  echo "-----------------------------------------------------------------------"
  echo "                     ABA Routing Validator Module"
  echo "                   Distributed Application Solutions"
  echo "-----------------------------------------------------------------------"
  echo
  echo
  echo
 
} # ---  End Function display_MainHeader()
 
#===  FUNCTION   ================================================
#         Name:  display_TaskChoices()
#  --------------------------------------------------------------
#  Description:  Displays header.
#   Parameters:  None
#      Returns:  None
#================================================================
function display_TaskChoices() {
 
  echo "-----------------------------------------------------------------------"
  echo " Task Selection"
  echo
  if [ $1 == "--help" ]; then
    echo "     ${0##*/}                <-- Build And Run Tests <default>"
    echo "     ${0##*/}  clean         <-- Deep Clean All Artifacts"
    echo "     ${0##*/}  site          <-- Build Maven Site Reports"
  fi
} # ---  End Function display_TaskChoices()
 
#===  FUNCTION   ================================================
#         Name:  terminationNormal()
#  --------------------------------------------------------------
#  Description:  Exits cleanly.
#   Parameters:  None
#      Returns:  None
#================================================================
function terminationNormal() {
 
  echo
  echo
  echo
  echo "-----------------------------------------------------------------------"
  echo "     Normal Program Termination..."
  echo
  echo "            Program Start: " $startingTime
  endingTime=$(date +"%D %T.%3N")
  echo "       Normal Termination: " $endingTime
 
  termin=$(date +"%s")
  difftimelps=$(($termin - $begin))
  echo
  echo "             Elapsed Time:  $difftimelps  Seconds (approx.) "
  echo
  echo "All Systems Nominal..."
  echo "-----------------------------------------------------------------------"
  echo
  echo
  #  Exit status code
  exit 0
 
} # ---  End Function terminationNormal()
 
#===  FUNCTION   ================================================
#         Name:  terminationAbnormal()
#  --------------------------------------------------------------
#  Description:  Exits poorly...
#   Parameters:  None
#      Returns:  None
#================================================================
function terminationAbnormal() {
 
  echo
  echo
  echo
  echo "-----------------------------------------------------------------------"
  echo "     ***  Abnormal Termination  ***"
  echo
  echo "            Program Start: " $startingTime
  endingTime=$(date +"%D %T.%3N")
  echo "       Normal Termination: " $endingTime
 
  termin=$(date +"%s")
  difftimelps=$(($termin - $begin))
  echo
  echo "             Elapsed Time:  $difftimelps  Seconds (approx.) "
  echo
  echo "Build Is In An Abend State..."
  echo "-----------------------------------------------------------------------"
  echo
  echo
  #  Exit status code
  exit 1
 
} # ---  End Function terminationAbnormal()
 
# =======================================================================
# MAIN SCRIPTING LOGIC
# =======================================================================
 
# This is the deployable artifact.  We will rename later.
numberOfArgs=$#
paramterArg=$1
 
clear
display_MainHeader
 
# The $# will check to see if there were any parameters.  If none, then
# this is just a regular compile and build.
if [ $# -eq 0 ]; then
  # if block code
  # Delete all the artifacts
  delete_Artifacts
 
  # Build Main EAR Artifact
  build_EarArtifact
 
  # End the program
  terminationNormal
else
  # =====================================================================
  #  Well, looks like they want to do something specific.
 
  if [ $1 == "--help" ]; then
    display_TaskChoices $1
  elif [ $1 == "clean" ]; then
    delete_Artifacts
    # End the program
    terminationNormal
  elif [ $1 == "site" ]; then
    build_SiteReports
    # End the program
    terminationNormal
  fi
 
fi #  End:  If/Else


