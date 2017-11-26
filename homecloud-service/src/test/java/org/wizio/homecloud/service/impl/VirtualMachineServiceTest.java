package org.wizio.homecloud.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wizio.homecloud.service.VirtualMachineService;
import org.wizio.homecloud.service.configuration.AbstractServiceTest;

public class VirtualMachineServiceTest extends AbstractServiceTest {

	@Autowired
	private VirtualMachineService virtualMachineService;
	
	@Test
	public void testCreateVirtualMachine() {
		assertEquals(0, virtualMachineService.create(1L));
	}

}
