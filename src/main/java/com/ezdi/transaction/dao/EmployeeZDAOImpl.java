package com.ezdi.transaction.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.ezdi.transaction.beans.EmployeeZ;

@Repository
public class EmployeeZDAOImpl implements EmployeeZDAO{


	@PersistenceContext(unitName="PersistenceUnitZ")
	private EntityManager entityManager;
	
	public void saveEmployee(EmployeeZ employe) throws Exception{
		entityManager.persist(employe);
		//throw new Exception();
		
	}

}
