package org.wizio.homecloud.commons.utils;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class CommandUtilsTest {

	@Test
	public void testExecuteCommand() throws IOException, InterruptedException {
		assertEquals(0, CommandUtils.executeCommand("java -version"));
	}

}
