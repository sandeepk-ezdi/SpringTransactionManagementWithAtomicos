package com.ezdi.transaction.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.ezdi.transaction.beans.EmployeeX;

@Repository
public class EmployeeXDAOImpl implements EmployeeXDAO{

	@PersistenceContext(unitName="PersistenceUnitX")
	private EntityManager entityManager;
	
	public void saveEmployee(EmployeeX employee)throws Exception {
		entityManager.persist(employee);	
		
	}

}
