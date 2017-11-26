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
 * Machine Type Command Argument
 * @author Meidi
 *
 */
@Entity
@Table(name="TA_VIRTUAL_MACHINE_TYPE_COMMAND_ARG")
public class VirtualMachineTypeCommandArg {

	/**
	 * Unique ID
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_VIRTUAL_MACHINE_TYPE_COMMAND_ARG")
	private long id;
	
	/**
	 * Arg name
	*/
	@Column(name="arg_name", nullable=false, length=250)
	private String name;
	
	/**
	 * Arg value
	 */
	@Column(name="arg_value", nullable=false, length=250)
	private String value;
	
	/**
	 * Argument command
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_VIRTUAL_MACHINE_TYPE_COMMAND")
	private VirtualMachineTypeCommand command;

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
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the command
	 */
	public VirtualMachineTypeCommand getCommand() {
		return command;
	}

	/**
	 * @param command the command to set
	 */
	public void setCommand(VirtualMachineTypeCommand command) {
		this.command = command;
	}
}
