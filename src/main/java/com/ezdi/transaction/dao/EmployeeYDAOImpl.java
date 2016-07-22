package com.ezdi.transaction.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.ezdi.transaction.beans.EmployeeY;

@Repository
public class EmployeeYDAOImpl implements EmployeeYDAO{
	
	@PersistenceContext(unitName="PersistenceUnitY")
	private EntityManager entityManager;
	

	public void saveEmployee(EmployeeY employee) throws Exception {
		entityManager.persist(employee);
		
	}

}
