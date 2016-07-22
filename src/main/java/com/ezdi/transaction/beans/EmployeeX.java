package com.ezdi.transaction.beans;

import javax.persistence.*;


@Entity
@Table(name = "EmployeeX")
public class EmployeeX {
	
	@Id
	@Column(name = "ID", nullable = false)
	private Integer  id;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "AGE", nullable = false)
	private Integer age;
	
	public EmployeeX() {
		// TODO Auto-generated constructor stub
	}
	
	
	public EmployeeX(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}





	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
