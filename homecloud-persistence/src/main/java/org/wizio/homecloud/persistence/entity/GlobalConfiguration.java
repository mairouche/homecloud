package org.wizio.homecloud.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Global Configuration
 * @author Meidi
 *
 */
@Entity
@Table(name="TA_GLOBAL_CONFIGURATION")
public class GlobalConfiguration {

	/**
	 * Unique ID
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_GLOBAL_CONFIGURATION")
	private long id;

	/**
	 * The app has been first configured
	 */
	@Column(nullable=false)
	private boolean firstConfigured = false;
	
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
	 * @return the firstConfigured
	 */
	public boolean isfirstConfigured() {
		return firstConfigured;
	}

	/**
	 * @param firstConfigured the firstConfigured to set
	 */
	public void setFirstConfigured(boolean firstConfigured) {
		this.firstConfigured = firstConfigured;
	}
	
}
