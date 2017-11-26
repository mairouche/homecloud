package org.wizio.homecloud.persistence.repository;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wizio.homecloud.persistence.configuration.AbstractRepositoryTest;

public class VirtualMachineRepositoryTest extends AbstractRepositoryTest {

	@Autowired
	private VirtualMachineRepository virtualMachineRepository;
	
	@Test
	public void testFindVirtualMachineById() {
		assertNotNull(virtualMachineRepository.findOne(1L));
	}

}
