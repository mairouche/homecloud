package org.wizio.homecloud.business.service;

import java.util.List;

import org.wizio.homecloud.persistence.entity.VirtualMachineType;

/**
 * Provisionning Business Service
 * @author Meidi
 *
 */
public interface ProvisioningBusinessService {

	/**
	 * Create a VM for a given type
	 * @param idVirtualMachineType
	 * @return
	 */
	int createVirtualMachine(long idVirtualMachineType);
	
	/**
	 * List all of the available Machine Types
	 * @return
	 */
	List<VirtualMachineType> getVirtualMachineTypes();
}
