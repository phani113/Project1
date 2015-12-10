package com.project1.dao;

import java.util.List;

import com.project1.domain.Employee;

public interface Project1DAO 
{
	List<Employee> getEmployee(String dept_Name);
}
