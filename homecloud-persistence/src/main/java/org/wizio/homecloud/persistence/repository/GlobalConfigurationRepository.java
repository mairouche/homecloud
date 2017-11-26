package org.wizio.homecloud.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wizio.homecloud.persistence.entity.GlobalConfiguration;

/**
 * Global Configuration DAO
 * @author Meidi
 *
 */
public interface GlobalConfigurationRepository extends JpaRepository<GlobalConfiguration, Long>{

}
