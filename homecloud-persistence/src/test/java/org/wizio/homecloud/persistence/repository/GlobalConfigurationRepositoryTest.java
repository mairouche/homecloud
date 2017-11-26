package org.wizio.homecloud.persistence.repository;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wizio.homecloud.persistence.configuration.AbstractRepositoryTest;

public class GlobalConfigurationRepositoryTest extends AbstractRepositoryTest {

	@Autowired
	private GlobalConfigurationRepository globalConfigurationRepository;
	
	@Test
	public void testAppIsFirstConfigured() {
		assertTrue(globalConfigurationRepository.findOne(1L).isfirstConfigured());
	}

}
