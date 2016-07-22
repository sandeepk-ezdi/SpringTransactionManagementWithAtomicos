package com.ezdi.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ezdi.transaction.beans.EmployeeX;
import com.ezdi.transaction.dao.EmployeeXDAO;

@Service("employeeXService")
public class EmployeeXServiceImpl implements EmployeeXService{
	
	@Autowired
	EmployeeXDAO xdao;

	public void saveEmployeesX(EmployeeX employeeX) throws Exception {
		xdao.saveEmployee(employeeX);
		
	}

}
