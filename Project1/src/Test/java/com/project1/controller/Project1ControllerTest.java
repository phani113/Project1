package com.project1.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import com.project1.dao.Project1DAO;
import com.project1.model.DepartmentModel;
import com.project1.model.EmployeeModel;
import com.project1.service.ServiceBean;

@RunWith(MockitoJUnitRunner.class)
public class Project1ControllerTest
{    
	@Mock
	Project1DAO dao;
	@Mock
	 Model model;
	@Mock
	ModelMap map;
	@Mock
	ServiceBean sb;
	@Mock
	ApplicationContext context;

     @Test
	 public void getTest()
     {
		 DepartmentModel d=new DepartmentModel();
		 Project1Controller p=new Project1Controller();
		
		 p.get(d, model);
		 Mockito.verify(model, Mockito.times(1)).addAttribute(d);
		
	     
     }
     
     @Test
     public void getPost()
     { 
    	 DepartmentModel d=new DepartmentModel();
    	 d.setDept_Name("dev");
    	 
		 Project1Controller p=new Project1Controller();
		 p.context=this.context;
    	 
		 List<EmployeeModel> list=new ArrayList<EmployeeModel>();
		 EmployeeModel e=new EmployeeModel();
		 list.add(e);	
		 Mockito.when(context.getBean("sb")).thenReturn(sb);
		 Mockito.when(sb.getEmployee("dev")).thenReturn(list);
		
		 String retn = p.get(map, d);
		 System.out.println("retn : "+retn);
		 Mockito.verify(map, Mockito.times(1)).addAttribute("list",list);
		 
	  
     }
}
 