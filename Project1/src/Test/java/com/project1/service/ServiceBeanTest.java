package com.project1.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.project1.dao.Project1DAO;
import com.project1.domain.Employee;

public class ServiceBeanTest
{ 
	
	@Mock
	Project1DAO dao;
	@Test
	public void getEmployee()
	{
		ServiceBean sb=new ServiceBean();
		Employee e=new Employee();
		e.setId(1);
		e.setName("Name");
		e.setSal(1000);
	    
		List<Employee> list=	new ArrayList<Employee>();
			list.add(e);
		Mockito.when(dao.getEmployee("dev")).thenReturn(list);
		sb.setDao(dao);
		//assert.equals(sb.getEmployee("dev"),);
		
		
	}
	
}
