package com.package1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Teja {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext	 context = new AnnotationConfigApplicationContext(SpringController.class);
		
	 JdbcTemplate j = (JdbcTemplate)context.getBean(JdbcTemplate.class);
 //j.update("insert into employee values(200 ,'teja')");
	 List<Employee> list = j.query("select * from employee", new EmployeeRow());    
		
		  for(int i = 0;i<list.size();i++ )
		  { 
			  Employee e = list.get(i);
		  System.out.println(e.getEmpid());
		  System.out.println(e.getName() ); }
		 
	 
		/*
		 * for(Employee use :list) {
		 * 
		 * System.out.println(use.toString()); }
		 */
	}
}
	 class EmployeeRow implements RowMapper<Employee>
	{

		

		@Override
		public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			
			int employeeId = rs.getInt("empid");
		String s =	rs.getString("empname");
		
		Employee e = new Employee();
		e.setEmpid(employeeId);
		e.setName(s);
			
			return e;
		}
		 
	}


