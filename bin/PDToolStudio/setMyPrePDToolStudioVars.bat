@echo off
REM ############################################################################################################################
REM # (c) 2017 TIBCO Software Inc. All rights reserved.
REM # 
REM # Except as specified below, this software is licensed pursuant to the Eclipse Public License v. 1.0.
REM # The details can be found in the file LICENSE.
REM # 
REM # The following proprietary files are included as a convenience, and may not be used except pursuant
REM # to valid license to Composite Information Server or TIBCO(R) Data Virtualization Server:
REM # csadmin-XXXX.jar, csarchive-XXXX.jar, csbase-XXXX.jar, csclient-XXXX.jar, cscommon-XXXX.jar,
REM # csext-XXXX.jar, csjdbc-XXXX.jar, csserverutil-XXXX.jar, csserver-XXXX.jar, cswebapi-XXXX.jar,
REM # and customproc-XXXX.jar (where -XXXX is an optional version number).  Any included third party files
REM # are licensed under the terms contained in their own accompanying LICENSE files, generally named .LICENSE.txt.
REM # 
REM # This software is licensed AS-IS. Support for this software is not covered by standard maintenance agreements with TIBCO.
REM # If you would like to obtain assistance with this software, such assistance may be obtained through a separate paid consulting
REM # agreement with TIBCO.
REM #
REM ############################################################################################################################
REM #
REM #==========================================================
REM # setMyPrePDToolStudioVars.bat :: Set Environment Variables
REM #==========================================================
REM # This file gets invoked by setVars.bat before setVars.bat variables have been executed.
REM # 
REM # Instructions: 
REM #    1. Modify variables as needed.
REM #    2. Add new variables to the function :writeOutput at the bottom of this batch file when new variables are added.
REM #    3. Copy this file to a location outside of the PDToolStudio installation so that it is not overwritten during upgrade.
REM #    4. Modify setVars.bat "MY_VARS_HOME" variable to point to the directory that contains this file.
REM #    5. To encrypt the password in this file:
REM #       a) Open a windows command line
REM #       b) cd <path-to-pdtool>\PDToolStudio\bin
REM #       c) ExecutePDTool.bat -encrypt <path-to-file>\setMyPrePDToolStudioVars.bat
REM #=======================================================================================================
REM # CREATE/MODIFY CUSTOM PRE-PROCESSING VARIABLES BELOW THIS POINT
REM #=======================================================================================================
REM #
REM ################################
REM # CUSTOM USER DEFINED VARIABLES
REM ################################
REM #
REM ################################
REM # GENERAL GROUP ENVIRONMENT
REM ################################
REM # 0=Do not print this section, 1 or true=Print this section
set GEN_PRINT=1
REM # My Java Home
set MY_JAVA_HOME=
REM # PDTool Studio Substitute Drive Letter used for making the path shorter
REM # PDTool and PDTool Studio must use different drive letters.
set PDTOOL_SUBSTITUTE_DRIVE=
REM # PDTool Installation Home Directory
set PDTOOL_INSTALL_HOME=
REM # PDTool Home directory
set PDTOOL_HOME=
REM # Name of the configuration property file located in PDToolStudio7.0.0/resources/config
REM #    e.g. Default=studio.properties or SVN=studio_SVN.properties or TFS=studio_TFS.properties
set MY_CONFIG_PROPERTY_FILE=
REM # The editor to use for VCS viewing if needed.  Windows=notepad and UNIX=vi
set VCS_EDITOR=
REM # Initialize the general VCS username - do not set this here.
set VCS_USERNAME=
REM # Initialize the general VCS password - do not set this here.
set VCS_PASSWORD=
REM #
REM ################################
REM # TFS VARIABLES
REM ################################
REM # 0=Do not print this section, 1 or true=Print this section
set TFS_PRINT=0
REM # The TFS Home folder where tf.cmd client exists
set TFS_HOME=
REM # The TFS repository URL pointing to the repository's collection
set TFS_VCS_REPOSITORY_URL=
REM # The TFS folder path starting at the TFS project and ending where the DV base level root folders start
set TFS_VCS_PROJECT_ROOT=
REM # TFS user name including the domain.  If LDAP it may need to include the domain user@domain.
set TFS_VCS_USERNAME=
REM # TFS user password.  See notes at top of this file to encrypt.
set TFS_VCS_PASSWORD=
REM # Set the VCS Workspace name.
set TFS_VCS_WORKSPACE_NAME=
REM # Set the VCS Workspace temp name by adding a "t" to the end of the workspace name
if "%TFS_VCS_WORKSPACE_NAME%" NEQ "" set TFS_VCS_WORKSPACE_NAME_TEMP=%TFS_VCS_WORKSPACE_NAME%t
if "%TFS_VCS_WORKSPACE_NAME%" EQU "" set TFS_VCS_WORKSPACE_NAME_TEMP=
REM # Set the generic VCS variables for VCS_USERNAME and VCS_PASSWORD if defined in this section
if defined TFS_VCS_USERNAME set VCS_USERNAME=%TFS_VCS_USERNAME%
if defined TFS_VCS_PASSWORD set VCS_PASSWORD=%TFS_VCS_PASSWORD%
REM #
REM ################################
REM # SVN VARIABLES
REM ################################
REM # 0=Do not print this section, 1 or true=Print this section
set SVN_PRINT=0
REM # The SVN Home folder where svn.exe client exists
set SVN_HOME=
REM # The subversion repository path at trunk or any folder designation within trunk
set SVN_VCS_REPOSITORY_URL=
REM # The Subversion folder path starting directly after the Subversion repo URL and ending where the DV base level root folders start
set SVN_VCS_PROJECT_ROOT=
REM # Subversion user name
set SVN_VCS_USERNAME=
REM # Subversion user password.  See notes at top of this file to encrypt.
set SVN_VCS_PASSWORD=
REM # Set the VCS Workspace name.
set SVN_VCS_WORKSPACE_NAME=
REM # Set the VCS Workspace temp name by adding a "t" to the end of the workspace name
if "%SVN_VCS_WORKSPACE_NAME%" NEQ "" set SVN_VCS_WORKSPACE_NAME_TEMP=%SVN_VCS_WORKSPACE_NAME%t
if "%SVN_VCS_WORKSPACE_NAME%" EQU "" set SVN_VCS_WORKSPACE_NAME_TEMP=
REM # Set the generic VCS variables for VCS_USERNAME and VCS_PASSWORD if defined in this section
if defined SVN_VCS_USERNAME set VCS_USERNAME=%SVN_VCS_USERNAME%
if defined SVN_VCS_PASSWORD set VCS_PASSWORD=%SVN_VCS_PASSWORD%
REM #
REM ################################
REM # GIT VARIABLES
REM ################################
REM # 0=Do not print this section, 1 or true=Print this section
set GIT_PRINT=0
REM # The GIT Home folder where svn.exe client exists
set GIT_HOME=
REM # The GIT repository path at trunk or any folder designation within trunk
set GIT_VCS_REPOSITORY_URL=
REM # The GIT folder path starting directly after the GIT repo URL and ending where the DV base level root folders start
set GIT_VCS_PROJECT_ROOT=
REM # GIT user name
set GIT_VCS_USERNAME=
REM # GIT user password.  See notes at top of this file to encrypt.
set GIT_VCS_PASSWORD=
REM # Set the VCS Workspace name.
set GIT_VCS_WORKSPACE_NAME=
REM # Set the VCS Workspace temp name by adding a "t" to the end of the workspace name
if "%GIT_VCS_WORKSPACE_NAME%" NEQ "" set GIT_VCS_WORKSPACE_NAME_TEMP=%GIT_VCS_WORKSPACE_NAME%t
if "%GIT_VCS_WORKSPACE_NAME%" EQU "" set GIT_VCS_WORKSPACE_NAME_TEMP=
REM # Set the generic VCS variables for VCS_USERNAME and VCS_PASSWORD if defined in this section
if defined GIT_VCS_USERNAME set VCS_USERNAME=%GIT_VCS_USERNAME%
if defined GIT_VCS_PASSWORD set VCS_PASSWORD=%GIT_VCS_PASSWORD%
REM #
REM ################################
REM # P4 VARIABLES
REM ################################
REM # 0=Do not print this section, 1 or true=Print this section
set P4_PRINT=0
REM # The Perforce Home folder where svn.exe client exists
set P4_HOME=
REM # The subversion repository path at trunk or any folder designation within trunk
set P4_VCS_REPOSITORY_URL=
REM # The Subversion folder path starting directly after the Subversion repo URL and ending where the DV base level root folders start
set P4_VCS_PROJECT_ROOT=
REM # Subversion user name
set P4_VCS_USERNAME=
REM # Subversion user password.  See notes at top of this file to encrypt.
set P4_VCS_PASSWORD=
REM # Set the VCS Workspace name.
set P4_VCS_WORKSPACE_NAME=
REM # Set the VCS Workspace temp name by adding a "t" to the end of the workspace name
if "%P4_VCS_WORKSPACE_NAME%" NEQ "" set P4_VCS_WORKSPACE_NAME_TEMP=%P4_VCS_WORKSPACE_NAME%t
if "%P4_VCS_WORKSPACE_NAME%" EQU "" set P4_VCS_WORKSPACE_NAME_TEMP=
REM # Set the generic VCS variables for VCS_USERNAME and VCS_PASSWORD if defined in this section
if defined P4_VCS_USERNAME set VCS_USERNAME=%P4_VCS_USERNAME%
if defined P4_VCS_PASSWORD set VCS_PASSWORD=%P4_VCS_PASSWORD%
REM #
REM ################################
REM # CVS VARIABLES
REM ################################
REM # 0=Do not print this section, 1 or true=Print this section
set CVS_PRINT=0
REM # The Perforce Home folder where svn.exe client exists
set CVS_HOME=
REM # The subversion repository path at trunk or any folder designation within trunk
set CVS_VCS_REPOSITORY_URL=
REM # The Subversion folder path starting directly after the Subversion repo URL and ending where the DV base level root folders start
set CVS_VCS_PROJECT_ROOT=
REM # Subversion user name
set CVS_VCS_USERNAME=
REM # Subversion user password.  See notes at top of this file to encrypt.
set CVS_VCS_PASSWORD=
REM # Set the VCS Workspace name.
set CVS_VCS_WORKSPACE_NAME=
REM # Set the VCS Workspace temp name by adding a "t" to the end of the workspace name
if "%CVS_VCS_WORKSPACE_NAME%" NEQ "" set CVS_VCS_WORKSPACE_NAME_TEMP=%CVS_VCS_WORKSPACE_NAME%t
if "%CVS_VCS_WORKSPACE_NAME%" EQU "" set CVS_VCS_WORKSPACE_NAME_TEMP=
REM # Set the generic VCS variables for VCS_USERNAME and VCS_PASSWORD if defined in this section
if defined CVS_VCS_USERNAME set VCS_USERNAME=%CVS_VCS_USERNAME%
if defined CVS_VCS_PASSWORD set VCS_PASSWORD=%CVS_VCS_PASSWORD%
REM #
REM #=======================================================================================================
REM # CREATE/MODIFY VARIABLES ABOVE THIS POINT
REM #=======================================================================================================
REM #
if not defined PRINT_VARS echo PRINT_VARS is not defined.  Set default PRINT_VARS=1
if not defined PRINT_VARS set PRINT_VARS=1
REM # Print out the setVars.bat variables
if "%PRINT_VARS%"=="1" call:writeOutput %0
REM #
goto END
REM #
REM #==========================================================
REM # FUNCTIONS
REM #==========================================================
::#---------------------------------------------
:writeOutput
::#---------------------------------------------
::# Print out the setVars.bat variables
::# CALL:writeOutput %0
::# 
::# note: For printing passwords use the following processing style:
::#    1. Put quotes around firsr variable.
::#    2. Use PR_PASSWORD for the return variable
::#    3. Use delayed expansion !PR_PASSWORD! to print out return value.
::#    4. Example is shown below:
::#       CALL:printablePassword "%TFS_VCS_PASSWORD%" PR_PASSWORD
::#       set MSG=!MSG!TFS_VCS_PASSWORD          =!PR_PASSWORD!!LF!
::#---------------------------------------------
set filename=%1
set MSG=
set PR_PASSWORD=
REM # Convert true to 1
if "%GEN_PRINT%"=="true" set GEN_PRINT=1
if "%TFS_PRINT%"=="true" set TFS_PRINT=1
if "%SVN_PRINT%"=="true" set SVN_PRINT=1
if "%GIT_PRINT%"=="true" set GIT_PRINT=1
if "%P4_PRINT%"=="true"  set P4_PRINT=1
if "%CVS_PRINT%"=="true" set CVS_PRINT=1
SETLOCAL ENABLEDELAYEDEXPANSION
REM # LF must have 2 blank lines following it to create a line feed
set LF=^


set MSG=!MSG!########################################################################################################################################!LF!
set MSG=!MSG!%filename%: Setting pre-processing custom variables!LF!
set MSG=!MSG!########################################################################################################################################!LF!
if "%GEN_PRINT%"=="1" (
set MSG=!MSG!------------------!LF!
set MSG=!MSG!GENERAL VARIABLES!LF!
set MSG=!MSG!------------------!LF!
set MSG=!MSG!MY_JAVA_HOME               =!MY_JAVA_HOME!!LF!
set MSG=!MSG!PDTOOL_SUBSTITUTE_DRIVE    =!PDTOOL_SUBSTITUTE_DRIVE!!LF!
set MSG=!MSG!PDTOOL_INSTALL_HOME        =!PDTOOL_INSTALL_HOME!!LF!
set MSG=!MSG!PDTOOL_HOME                =!PDTOOL_HOME!!LF!
set MSG=!MSG!MY_CONFIG_PROPERTY_FILE    =!MY_CONFIG_PROPERTY_FILE!!LF!
)
if "%TFS_PRINT%"=="1" (
set MSG=!MSG!------------------!LF!
set MSG=!MSG!TFS VARIABLES!LF!
set MSG=!MSG!------------------!LF!
set MSG=!MSG!TFS_HOME                   =!TFS_HOME!!LF!
set MSG=!MSG!TFS_VCS_REPOSITORY_URL     =!TFS_VCS_REPOSITORY_URL!!LF!
set MSG=!MSG!TFS_VCS_PROJECT_ROOT       =!TFS_VCS_PROJECT_ROOT!!LF!
set MSG=!MSG!TFS_VCS_USERNAME           =!TFS_VCS_USERNAME!!LF!
CALL:printablePassword "%TFS_VCS_PASSWORD%" PR_PASSWORD
set MSG=!MSG!TFS_VCS_PASSWORD           =!PR_PASSWORD!!LF!
set MSG=!MSG!TFS_VCS_WORKSPACE_NAME     =!TFS_VCS_WORKSPACE_NAME!!LF!
set MSG=!MSG!TFS_VCS_WORKSPACE_NAME_TEMP=!TFS_VCS_WORKSPACE_NAME_TEMP!!LF!
)
if "%SVN_PRINT%"=="1" (
set MSG=!MSG!------------------!LF!
set MSG=!MSG!SVN VARIABLES!LF!
set MSG=!MSG!------------------!LF!
set MSG=!MSG!SVN_HOME                   =!SVN_HOME!!LF!
set MSG=!MSG!SVN_VCS_REPOSITORY_URL     =!SVN_VCS_REPOSITORY_URL!!LF!
set MSG=!MSG!SVN_VCS_PROJECT_ROOT       =!SVN_VCS_PROJECT_ROOT!!LF!
set MSG=!MSG!SVN_VCS_USERNAME           =!SVN_VCS_USERNAME!!LF!
CALL:printablePassword "%SVN_VCS_PASSWORD%" PR_PASSWORD
set MSG=!MSG!SVN_VCS_PASSWORD           =!PR_PASSWORD!!LF!
set MSG=!MSG!SVN_VCS_WORKSPACE_NAME     =!SVN_VCS_WORKSPACE_NAME!!LF!
set MSG=!MSG!SVN_VCS_WORKSPACE_NAME_TEMP=!SVN_VCS_WORKSPACE_NAME_TEMP!!LF!
)
if "%GIT_PRINT%"=="1" (
set MSG=!MSG!------------------!LF!
set MSG=!MSG!GIT VARIABLES!LF!
set MSG=!MSG!------------------!LF!
set MSG=!MSG!GIT_HOME                   =!GIT_HOME!!LF!
set MSG=!MSG!GIT_VCS_REPOSITORY_URL     =!GIT_VCS_REPOSITORY_URL!!LF!
set MSG=!MSG!GIT_VCS_PROJECT_ROOT       =!GIT_VCS_PROJECT_ROOT!!LF!
set MSG=!MSG!GIT_VCS_USERNAME           =!GIT_VCS_USERNAME!!LF!
CALL:printablePassword "%GIT_VCS_PASSWORD%" PR_PASSWORD
set MSG=!MSG!GIT_VCS_PASSWORD           =!PR_PASSWORD!!LF!
set MSG=!MSG!GIT_VCS_WORKSPACE_NAME     =!GIT_VCS_WORKSPACE_NAME!!LF!
set MSG=!MSG!GIT_VCS_WORKSPACE_NAME_TEMP=!GIT_VCS_WORKSPACE_NAME_TEMP!!LF!
)
if "%P4_PRINT%"=="1" (
set MSG=!MSG!------------------!LF!
set MSG=!MSG!PERFORCE VARIABLES!LF!
set MSG=!MSG!------------------!LF!
set MSG=!MSG!P4_HOME                    =!P4_HOME!!LF!
set MSG=!MSG!P4_VCS_REPOSITORY_URL      =!P4_VCS_REPOSITORY_URL!!LF!
set MSG=!MSG!P4_VCS_PROJECT_ROOT        =!P4_VCS_PROJECT_ROOT!!LF!
set MSG=!MSG!P4_VCS_USERNAME            =!P4_VCS_USERNAME!!LF!
CALL:printablePassword "%P4_VCS_PASSWORD%" PR_PASSWORD
set MSG=!MSG!P4_VCS_PASSWORD            =!PR_PASSWORD!!LF!
set MSG=!MSG!P4_VCS_WORKSPACE_NAME      =!P4_VCS_WORKSPACE_NAME!!LF!
set MSG=!MSG!P4_VCS_WORKSPACE_NAME_TEMP =!P4_VCS_WORKSPACE_NAME_TEMP!!LF!
)
if "%CVS_PRINT%"=="1" (
set MSG=!MSG!------------------!LF!
set MSG=!MSG!CVS VARIABLES!LF!
set MSG=!MSG!------------------!LF!
set MSG=!MSG!CVS_HOME                   =!CVS_HOME!!LF!
set MSG=!MSG!CVS_VCS_REPOSITORY_URL     =!CVS_VCS_REPOSITORY_URL!!LF!
set MSG=!MSG!CVS_VCS_PROJECT_ROOT       =!CVS_VCS_PROJECT_ROOT!!LF!
set MSG=!MSG!CVS_VCS_USERNAME           =!CVS_VCS_USERNAME!!LF!
CALL:printablePassword "%CVS_VCS_PASSWORD%" PR_PASSWORD
set MSG=!MSG!CVS_VCS_PASSWORD           =!PR_PASSWORD!!LF!
set MSG=!MSG!CVS_VCS_WORKSPACE_NAME     =!CVS_VCS_WORKSPACE_NAME!!LF!
set MSG=!MSG!CVS_VCS_WORKSPACE_NAME_TEMP=!CVS_VCS_WORKSPACE_NAME_TEMP!!LF!
)
echo.!MSG!
REM # Output to the default log file if the variable DEFAULT_LOG_PATH is defined in ExecutePDTool.bat
if not defined DEFAULT_LOG_PATH goto WRITEOUTPUTEND
if exist "%DEFAULT_LOG_PATH%" echo.!MSG!>>"%DEFAULT_LOG_PATH%"
:WRITEOUTPUTEND
ENDLOCAL
GOTO:EOF
REM #
::#---------------------------------------------
:printablePassword
::#---------------------------------------------
::# Return a printable password. 
::# If encrypted print as is. 
::# If not encryped return ******** for printing.
::# CALL:printablePassword "%PASSWORD%" PR_PASSWORD
::#   pswd    [in]  Enclose input in double quotes
::#   pswdout [out] printable password
::#---------------------------------------------
set pswd=%1
REM # Remove double quotes
setlocal EnableDelayedExpansion
if defined pswd set tpswd=!pswd:"=!
endlocal & SET pswd=%tpswd%
set pswdSubstr=%pswd:~0,10%
set pswdout=
if "%pswd%" NEQ "" set pswdout=********
if "%pswdSubstr%" == "Encrypted:" set pswdout=%pswd%
set %2=%pswdout%
GOTO:EOF
REM #
REM #==========================================================
REM # END FUNCTIONS
REM #==========================================================
:END