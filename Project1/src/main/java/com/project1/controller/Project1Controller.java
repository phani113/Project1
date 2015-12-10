package com.project1.controller;

import java.util.List;

import com.project1.model.EmployeeModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project1.model.DepartmentModel;
import com.project1.service.ServiceBean;

@Controller
public class Project1Controller
{   @Autowired
	ApplicationContext context;
  @RequestMapping(value="/get.form",method=RequestMethod.GET)
  public String get(@ModelAttribute("department") DepartmentModel dept,Model model)
  {
	 model.addAttribute(dept); 
	 return "home";
	  
  }
  @RequestMapping(value="/get.form",method=RequestMethod.POST)
  public String get(ModelMap model,@ModelAttribute("department") DepartmentModel dept)
  {
	  ServiceBean sb=(ServiceBean) context.getBean("sb");
	  List<EmployeeModel> eModel=sb.getEmployee(dept.getDept_Name());
	  model.addAttribute("list", eModel);
	  
	  return "emp";
	  
  }
}
