package org.wizio.homecloud.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wizio.homecloud.persistence.entity.VirtualMachineType;

/**
 * Virtual Machine Type DAO
 * @author Meidi
 *
 */
public interface VirtualMachineTypeRepository extends JpaRepository<VirtualMachineType, Long>{

}
