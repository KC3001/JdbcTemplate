package com.package1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.package1.service.EmployeeService;

public class Implementation {


	public static void main(String[] args)
	{
	
		AnnotationConfigApplicationContext apc = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		
		     Employee e = (Employee)apc.getBean(Employee.class);
		     System.out.println(e.getEid());
		    // System.out.println(e.getAddress().getHouseNO());
		     Address a = (Address)apc.getBean(Address.class);
		     System.out.println(a.getHouseNO());
		     EmployeeService s = (EmployeeService)apc.getBean("service");
		     System.out.println(s.getEmployee(100).getEname());
				/*
				 * EmployeeService ese = (EmployeeService)apc.getBean("service"); Employee e1 =
				 * ese.getEmployee(100); System.out.println(e1.getEname());
				 * System.out.println(e1.getEpay());
				 */
			     
		     
		     
		
		
		
	}
}
