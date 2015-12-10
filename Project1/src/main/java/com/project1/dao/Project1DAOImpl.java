package com.project1.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.project1.domain.Employee;

public class Project1DAOImpl implements Project1DAO {

	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf)
	{
        this.sessionFactory = sf;
	}
	@Override
	public List<Employee> getEmployee(String dept_Name)
	{
		Session session=sessionFactory.openSession();
		Query query=session.getNamedQuery("Employee.FindEmployeeBasedOnDepartment").setParameter(0, dept_Name);
		List<Employee> eList=query.list();
		System.out.println("size "+eList.size());
		return eList;
	}

}
