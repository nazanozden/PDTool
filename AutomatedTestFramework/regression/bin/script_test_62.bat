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
REM # Author: Mike Tinius, Data Virtualization Business Unit, Advanced Services
REM # Date:   June 2015
REM # PDTool Regression Module - Regression Automated Test Framework
REM #=======================================================================================
REM # Instructions: 
REM #   script_test_62.bat ENV_TYPE_NAME DEPLOYMENT_PLAN [CUSTOM] [RENAME] [PAUSE]
REM # 
REM # Parameters:
REM #   ENV_TYPE_NAME - Example: [DEV,UAT,PROD]
REM #         1. The valid values are defined as a result of the variable: VALID_ENV_CONFIG_PAIRS
REM #
REM #   DEPLOYMENT_PLAN - The name of the deployment plan such as:
REM #         1. BusLineBusArea_1Smoke_gen.dp
REM #         2. BusLineBusArea_1Smoke_exec.dp
REM #         3. BusLineBusArea_1SmokeAsIs_exec.dp
REM #         4. BusLineBusArea_2Regression_exec.dp
REM #         5. BusLineBusArea_2Regression_compare.dp
REM #         6. BusLineBusArea_3Performance_exec.dp
REM #         7. BusLineBusArea_3Performance_compare.dp
REM #         8. BusLineBusArea_4Security_gen.dp
REM #         9. BusLineBusArea_4Security_exec.dp
REM #
REM #   CUSTOM - [optional] variable 
REM #         1. blank or "" - generate or execute using SQL SELECT COUNT(1) cnt or SELECT COUNT(*) cnt.
REM #         2. TOP - If the word TOP is provided then generate or execute using the SELECT TOP 1 * command.  Top is a special type of CUSTOM.
REM #         3. CUSTOM value - If any other word is used then execute the SQL file using this pattern and the value of the CUSTOM variable:
REM #                Example: Developer creates a custom SQL file where the custom name = MyQueries
REM #                         Template:                                             Example:
REM #                         \sql\BusLineBusArea_RegressionTest_SQL_%CUSTOM%.txt = \sql\BusLineBusArea_RegressionTest_SQL_MyQueries.txt
REM #                         \sql\BusLineBusArea_PerfTest_SQL_%CUSTOM%.txt       = \sql\BusLineBusArea_PerfTest_SQL_MyQueries.txt
REM #
REM #   RENAME_REL - [optional] variable. Default=true
REM #         1. blank or "" or true - force a rename of the release output folders upon each execution of this script.
REM #         2. false - disable the rename function and allow the results to go to the existing RELEASE_FOLDER1 directory.  
REM #              Example.  This can be useful when executing a series of tests for the same release such as the following:
REM #                        Smoke Test, Regression Test, Performance Test and Security Test.
REM #              Note:     This script will automatically ignore renaming the output folder for the following and thus the RENAME_REL does not have to be set.
REM #                        Generating Smoke Test, Compare Regression Test, Compare Performance Test and Generate Security Test.
REM #
REM #   PAUSE - [optional] variable. Default=true 
REM #         1. blank or "" or true - pause during script execution.
REM #         2. false - no pause during script execution.
REM #=======================================================================================
REM #
REM ######################################
REM EXECUTE THE SCRIPT
REM ######################################
REM # Invoke the script to set the variables
if not exist setVars.bat (
	echo.
	echo.ERROR:  Unable to locate and execute setVars.bat. 
	echo.        Execute from directory \AutomatedTestFramework\regression\bin
	echo.
	exit /b 1
)
call setVars.bat
REM # Set the location of PDTool 6.2
set PDTOOL_INSTALL_HOME=%PDTOOL_INSTALL_HOME_6%
REM List of valid Environments / Config property file name pairs.   Comma separated, no space and no double quotes.  Tilde separates pairs: ENV~ConfigFileName
REM # These are the property file names configured in the PDTool6.2\resources\config folder minus the .properties extension.
set VALID_ENV_CONFIG_PAIRS=%VALID_ENV_CONFIG_PAIRS_6%
REM Set the release folders to indicate which version is being tested
REM   Release folder 1 is designated as the CIS instance current folder.  R1 designates it is a release 1 primary, current folder.
REM   Release folder 2 is designated as the CIS instance previous folder.  R2 designates it is a release 2 secondary, previous folder.
set RELEASE_FOLDER1=%RELEASE_FOLDER1_6%
set RELEASE_FOLDER2=%RELEASE_FOLDER2_6%

REM Script CIS Version - Coincides with the id field <id></id> in the module XML file "BusLineBusAreaSubjArea_RegressionModule.xml"
REM   that is used to generate the module XML file for each project.
REM   DO NOT CHANGE
set SCRIPT_CIS_VERSION=6.2
REM # This is the script definition and invocation parameters
set SCRIPT_ORIGINAL_DEFINITION=SCRIPT_NAME             ENV_TYPE_NAME  DEPLOYMENT_PLAN  [CUSTOM]  [RENAME_REL]  [PAUSE]
set SCRIPT_ORIGINAL_INVOCATION=%0      %1 %2 [%3] [%4] [%5]
REM                         SCRIPT_NAME  ENV_TYPE_NAME DEPLOYMENT_PLAN [CUSTOM] [RENAME_REL] [PAUSE]
call script_test_common.bat %0           %1            %2              %3       %4           %5
set ERROR=%ERRORLEVEL%
if %ERROR% NEQ 0 exit /b 1
exit /b 0
