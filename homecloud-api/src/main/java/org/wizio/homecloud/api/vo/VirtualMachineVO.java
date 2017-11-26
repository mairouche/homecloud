package org.wizio.homecloud.api.vo;

import java.io.Serializable;

/**
 * Virtual Machine Value Object
 * @author Meidi
 *
 */
public class VirtualMachineVO implements Serializable{
	
	/**
	 * SUID
	 */
	private static final long serialVersionUID = -3792302913307912352L;

	/**
	 * UID
	 */
	private long id;

	/**
	 * Name
	 */
	private String name;

	/**
	 * Type ID
	 */
	private long virtualMachineTypeId;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the virtualMachineTypeId
	 */
	public long getVirtualMachineTypeId() {
		return virtualMachineTypeId;
	}

	/**
	 * @param virtualMachineTypeId the virtualMachineTypeId to set
	 */
	public void setVirtualMachineTypeId(long virtualMachineTypeId) {
		this.virtualMachineTypeId = virtualMachineTypeId;
	}
	
	
}
