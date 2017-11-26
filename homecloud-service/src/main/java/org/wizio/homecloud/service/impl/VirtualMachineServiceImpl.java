package org.wizio.homecloud.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wizio.homecloud.commons.utils.CommandUtils;
import org.wizio.homecloud.persistence.entity.VirtualMachine;
import org.wizio.homecloud.persistence.entity.VirtualMachineType;
import org.wizio.homecloud.persistence.entity.VirtualMachineTypeCommandArg;
import org.wizio.homecloud.persistence.repository.VirtualMachineRepository;
import org.wizio.homecloud.persistence.repository.VirtualMachineTypeRepository;
import org.wizio.homecloud.service.VirtualMachineService;

@Service("VirtualMachineService")
public class VirtualMachineServiceImpl implements VirtualMachineService {
	
	@Autowired
	private VirtualMachineTypeRepository virtualMachineTypeRepository;
	
	@Autowired
	private VirtualMachineRepository virtualMachineRepository;

	@Override
	public int create(long idVirtualMachineType) {
		StringBuilder sb = new StringBuilder();
		VirtualMachineType vmType = virtualMachineTypeRepository.findOne(idVirtualMachineType);
		VirtualMachine vm = new VirtualMachine();
		vm.setType(vmType);
		virtualMachineRepository.save(vm);
		vm.setName(vmType.getName()+"-"+vmType.getId()+"-"+vm.getId());
		virtualMachineRepository.save(vm);
		sb.append(vmType.getCreateCommand().getValue());
		for(VirtualMachineTypeCommandArg arg : vmType.getCreateCommand().getArgs()) {
			sb.append(" " + arg.getName() + " " + arg.getValue());
		}
		sb.append(" "+vm.getName());
		try {
			return CommandUtils.executeCommand(sb.toString());
		} catch (IOException | InterruptedException e) {
			return 1;
		}
	}

	@Override
	public List<VirtualMachineType> listVirtualMachineTypes() {
		return virtualMachineTypeRepository.findAll();
	}

}
