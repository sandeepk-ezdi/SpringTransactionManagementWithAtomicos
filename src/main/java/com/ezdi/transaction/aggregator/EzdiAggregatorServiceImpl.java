package com.ezdi.transaction.aggregator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ezdi.transaction.beans.EmployeeX;
import com.ezdi.transaction.beans.EmployeeY;
import com.ezdi.transaction.beans.EmployeeZ;
import com.ezdi.transaction.dao.EmployeeXDAO;
import com.ezdi.transaction.dao.EmployeeYDAO;
import com.ezdi.transaction.dao.EmployeeZDAO;
import com.ezdi.transaction.service.EmployeeXService;
import com.ezdi.transaction.service.EmployeeYService;
import com.ezdi.transaction.service.EmployeeZService;

@Service("employeeService")
public class EzdiAggregatorServiceImpl implements EzdiAggregatorService{
	
	@Autowired
	private EmployeeXService  xService;
	
	@Autowired
	private EmployeeYService  yService;
	
	@Autowired
	private EmployeeZService  zService;
	
	
	@Transactional(rollbackFor=Exception.class)
	public void saveAllEmployees() throws Exception {
		
		EmployeeX employeeX= new EmployeeX(4, "Ravi", 35);
		
		System.out.println("Persist EmpX");
		xService.saveEmployeesX(employeeX);
		System.out.println("Persist EmpX- OK");
		

		EmployeeY employeeY= new EmployeeY(4, "Ravi", 35);
		
		System.out.println("Persist EmpY");
		yService.saveEmployeesY(employeeY);
		System.out.println("Persist EmpY- OK");
		
		
		EmployeeZ employeeZ= new EmployeeZ(4, "Ravi", 35);
		
		System.out.println("Persist EmpZ");
		zService.saveEmployeesZ(employeeZ);
		System.out.println("Persist EmpZ- OK");


	}

}
