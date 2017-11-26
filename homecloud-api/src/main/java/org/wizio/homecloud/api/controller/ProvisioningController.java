package org.wizio.homecloud.api.controller;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wizio.homecloud.api.vo.VirtualMachineVO;
import org.wizio.homecloud.business.service.ProvisioningBusinessService;

@RestController
@RequestMapping("/provision")
public class ProvisioningController {
	
	@Autowired
	Mapper mapper;
	
	@Autowired
	private ProvisioningBusinessService provisionningBusinessService;

	@PostMapping()
	public VirtualMachineVO provisionNewMachine(@RequestBody VirtualMachineVO vm) {
		return mapper.map(provisionningBusinessService.createVirtualMachine(vm.getVirtualMachineTypeId()), VirtualMachineVO.class);
	}
}
