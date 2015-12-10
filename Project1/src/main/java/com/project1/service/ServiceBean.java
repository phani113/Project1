package com.project1.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import com.project1.dao.Project1DAO;
import com.project1.domain.Employee;
import com.project1.model.EmployeeModel;

public class ServiceBean
{
	@Autowired
	private Project1DAO dao;
	private List<EmployeeModel> eModelList=null;

	public void setDao(Project1DAO dao) 
	{
		this.dao = dao;
	}
	
	public List<EmployeeModel> getEmployee(String dept_Name)
	{
		List<Employee> eList=dao.getEmployee(dept_Name);
		if(!CollectionUtils.isEmpty(eList))
		{	
			eModelList=new ArrayList<EmployeeModel>();
			Iterator<Employee> ite= eList.iterator();
			while(ite.hasNext())
			{
				Employee emp=ite.next();
				EmployeeModel eModel =new EmployeeModel();
				
			   eModel.setId(emp.getId());
			   eModel.setName(emp.getName());
			   eModel.setSal(emp.getSal());
		       eModelList.add(eModel);
			}
		}
		return eModelList;
	}
	
}
