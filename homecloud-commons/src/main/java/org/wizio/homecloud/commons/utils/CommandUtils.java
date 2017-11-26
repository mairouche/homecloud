package org.wizio.homecloud.commons.utils;

import java.io.IOException;

/**
 * Bash or MS-DoS commands
 * @author Meidi
 *
 */
public class CommandUtils {

	/**
	 * Execute a given command
	 * @return
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static int executeCommand(String command) throws IOException, InterruptedException {
		Process p;
		p = Runtime.getRuntime().exec(command);
		p.waitFor();
		return p.exitValue();
	}
}