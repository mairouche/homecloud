package org.wizio.homecloud.persistence.repository;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wizio.homecloud.persistence.configuration.AbstractRepositoryTest;

public class VirtualMachineTypeRepositoryTest extends AbstractRepositoryTest {

	@Autowired
	private VirtualMachineTypeRepository virtualMachineTypeRepository;
	
	@Test
	public void testFindVirtualMachineTypeById() {
		assertNotNull(virtualMachineTypeRepository.findOne(1L));
	}

}
