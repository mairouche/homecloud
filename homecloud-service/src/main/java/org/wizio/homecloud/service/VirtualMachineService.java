package org.wizio.homecloud.service;

import java.util.List;

import org.wizio.homecloud.persistence.entity.VirtualMachineType;

/**
 * Virtual Machine Service
 * @author Meidi
 *
 */
public interface VirtualMachineService {

	/**
	 * Create a Virtual Machine
	 * @param idVirtualMachineType
	 * @return
	 */
	int create(long idVirtualMachineType);

	/**
	 * List all of the available Virtual Machine Types
	 * @return
	 */
	List<VirtualMachineType> listVirtualMachineTypes();
	
}
