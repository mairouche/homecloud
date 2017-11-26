package org.wizio.homecloud.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Machine
 * @author Meidi
 *
 */
@Entity
@Table(name="TA_VIRTUAL_MACHINE")
public class VirtualMachine {
	
	/**
	 * Unique ID
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_VIRTUAL_MACHINE")
	private long id;

	/**
	 * Machine Name
	 */
	@Column(unique=true, length=100)
	private String name;
	
	/**
	 * Virtual Machine Type
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_VIRTUAL_MACHINE_TYPE")
	private VirtualMachineType type;
	
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
	 * @return the type
	 */
	public VirtualMachineType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(VirtualMachineType type) {
		this.type = type;
	}

}
