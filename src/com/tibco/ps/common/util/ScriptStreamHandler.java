/**
 * (c) 2017 TIBCO Software Inc. All rights reserved.
 * 
 * Except as specified below, this software is licensed pursuant to the Eclipse Public License v. 1.0.
 * The details can be found in the file LICENSE.
 * 
 * The following proprietary files are included as a convenience, and may not be used except pursuant
 * to valid license to Composite Information Server or TIBCO(R) Data Virtualization Server:
 * csadmin-XXXX.jar, csarchive-XXXX.jar, csbase-XXXX.jar, csclient-XXXX.jar, cscommon-XXXX.jar,
 * csext-XXXX.jar, csjdbc-XXXX.jar, csserverutil-XXXX.jar, csserver-XXXX.jar, cswebapi-XXXX.jar,
 * and customproc-XXXX.jar (where -XXXX is an optional version number).  Any included third party files
 * are licensed under the terms contained in their own accompanying LICENSE files, generally named .LICENSE.txt.
 * 
 * This software is licensed AS-IS. Support for this software is not covered by standard maintenance agreements with TIBCO.
 * If you would like to obtain assistance with this software, such assistance may be obtained through a separate paid consulting
 * agreement with TIBCO.
 * 
 */
package com.tibco.ps.common.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

import com.tibco.ps.common.util.CompositeLogger;

public class ScriptStreamHandler extends Thread {
	
	InputStream inputStream;
	OutputStream outputStream;
	PrintWriter printWriter;
	StringBuilder outputBuffer = new StringBuilder();


	ScriptStreamHandler(InputStream inputStream) {
		this.inputStream = inputStream;
	}


	ScriptStreamHandler(InputStream inputStream, OutputStream outputStream) {
		this.inputStream = inputStream;
		this.outputStream = outputStream;
		this.printWriter = new PrintWriter(outputStream);
	}

	public void run() {
	
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				outputBuffer.append(line + "\n");
			}
		} catch (IOException ioe) {
			CompositeLogger.logException(ioe, ioe.getMessage());
		} catch (Throwable t) {
			CompositeLogger.logException(t, t.getMessage());
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// ignore this one
			}
		}
	}

	public StringBuilder getOutputBuffer() {
		return outputBuffer;
	}

}
