package org.wizio.homecloud.persistence.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Machine Type
 * @author Meidi
 *
 */
@Entity
@Table(name="TA_VIRTUAL_MACHINE_TYPE")
public class VirtualMachineType {

	/**
	 * Unique ID
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_VIRTUAL_MACHINE_TYPE")
	private long id;
	
	/**
	 * VM Type Name
	 */
	@Column(nullable=false, length=200)
	private String name;
	
	/**
	 * Virtual Machines for this type
	 */
	@OneToMany(fetch = FetchType.LAZY)
	private List<VirtualMachine> virtualMachines = new ArrayList<VirtualMachine>();
	
	/**
	 * Create VM Command for Type
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_VIRTUAL_MACHINE_TYPE_COMMAND")
	private VirtualMachineTypeCommand createCommand;

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
	 * @return the virtualMachines
	 */
	public List<VirtualMachine> getVirtualMachines() {
		return virtualMachines;
	}

	/**
	 * @param virtualMachines the virtualMachines to set
	 */
	public void setVirtualMachines(List<VirtualMachine> virtualMachines) {
		this.virtualMachines = virtualMachines;
	}

	/**
	 * @return the createCommand
	 */
	public VirtualMachineTypeCommand getCreateCommand() {
		return createCommand;
	}

	/**
	 * @param createCommand the createCommand to set
	 */
	public void setCreateCommand(VirtualMachineTypeCommand createCommand) {
		this.createCommand = createCommand;
	}
	
}
