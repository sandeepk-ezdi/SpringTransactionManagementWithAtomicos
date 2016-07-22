package com.ezdi.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ezdi.transaction.beans.EmployeeZ;
import com.ezdi.transaction.dao.EmployeeZDAO;

@Service("employeeZService")
public class EmployeeZServiceImpl implements EmployeeZService{
	
	@Autowired
	EmployeeZDAO zdao;

	public void saveEmployeesZ(EmployeeZ employeeZ) throws Exception {
		zdao.saveEmployee(employeeZ);		
	}

	

}
