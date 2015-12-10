package com.project1.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Department 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int dept_Id;
	@Column
	private String dept_Name;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dept")
	private Set<Employee> employee_Set;
	public int getDept_Id() {
		return dept_Id;
	}
	public void setDept_Id(int dept_Id) {
		this.dept_Id = dept_Id;
	}
	public String getDept_Name() {
		return dept_Name;
	}
	public void setDept_Name(String dept_Name) {
		this.dept_Name = dept_Name;
	}
	public Set<Employee> getEmployee_Set() {
		return employee_Set;
	}
	public void setEmployee_Set(Set<Employee> employee_Set) {
		this.employee_Set = employee_Set;
	}
	
}
