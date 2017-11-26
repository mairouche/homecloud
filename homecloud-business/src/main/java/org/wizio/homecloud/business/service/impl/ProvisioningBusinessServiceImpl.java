package org.wizio.homecloud.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wizio.homecloud.business.service.ProvisioningBusinessService;
import org.wizio.homecloud.persistence.entity.VirtualMachineType;
import org.wizio.homecloud.service.VirtualMachineService;

@Service("ProvisionningBusinessService")
public class ProvisioningBusinessServiceImpl implements ProvisioningBusinessService {
	
	@Autowired
	VirtualMachineService virtualMachineService;

	@Override
	public int createVirtualMachine(long idVirtualMachineType) {
		return virtualMachineService.create(idVirtualMachineType);
	}

	@Override
	public List<VirtualMachineType> getVirtualMachineTypes() {
		return virtualMachineService.listVirtualMachineTypes();
	}

}
