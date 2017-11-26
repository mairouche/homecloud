package org.wizio.homecloud.persistence.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Machine Type Command
 * @author Meidi
 *
 */
@Entity
@Table(name="TA_VIRTUAL_MACHINE_TYPE_COMMAND")
public class VirtualMachineTypeCommand {

	/**
	 * Unique ID
	 */
	@Id
	@Column(name="ID_VIRTUAL_MACHINE_TYPE_COMMAND")
	private String key;
	
	/**
	 * Command value
	 */
	@Column(name="command_value", nullable=false, length=250)
	private String value;
	
	/**
	 * Command arguments
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy="command")
	private List<VirtualMachineTypeCommandArg> args = new ArrayList<VirtualMachineTypeCommandArg>();

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
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
	 * @return the args
	 */
	public List<VirtualMachineTypeCommandArg> getArgs() {
		return args;
	}

	/**
	 * @param args the args to set
	 */
	public void setArgs(List<VirtualMachineTypeCommandArg> args) {
		this.args = args;
	}
}
