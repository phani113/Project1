package com.project1.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
@NamedQuery(name = "Employee.FindEmployeeBasedOnDepartment", query = "from Employee employee where employee.dept.dept_Name=?")

@Entity
public class Employee
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="Name")
	private String name;
	@Column
	private int sal;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Dept_ID",nullable = false)
	private Department dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Department getDept_Id() {
		return dept;
	}
	public void setDept_Id(Department dept) {
		this.dept = dept;
	}
	
}
