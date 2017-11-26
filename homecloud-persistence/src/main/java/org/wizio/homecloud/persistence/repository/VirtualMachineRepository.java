package org.wizio.homecloud.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wizio.homecloud.persistence.entity.VirtualMachine;

/**
 * Virtual Machine DAO
 * @author Meidi
 *
 */
public interface VirtualMachineRepository extends JpaRepository<VirtualMachine, Long>{

}
