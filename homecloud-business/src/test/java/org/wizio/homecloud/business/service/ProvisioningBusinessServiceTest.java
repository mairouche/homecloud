package org.wizio.homecloud.business.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wizio.homecloud.business.config.AbstractBusinessServiceTest;

public class ProvisioningBusinessServiceTest extends AbstractBusinessServiceTest {
	
	@Autowired
	private ProvisioningBusinessService provisioningBusinessService;

	@Test
	public void testProvisionNewVM() {
		assertEquals(0, provisioningBusinessService.createVirtualMachine(1L));
	}

}
