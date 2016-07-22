package com.ezdi.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ezdi.transaction.beans.EmployeeY;
import com.ezdi.transaction.dao.EmployeeYDAO;

@Service("employeeYService")
public class EmployeeYServiceImpl implements EmployeeYService{
		
	@Autowired
	EmployeeYDAO ydao;

	public void saveEmployeesY(EmployeeY employeeY) throws Exception {
		//ydao.saveEmployee(employeeY);
		throw new Exception();
	}

}
