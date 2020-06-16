package com.package1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.package1.dao.EmployeeDao;
import com.package1.service.EmployeeService;

@Configuration 
// we use this annotation instead of using xml file
@ComponentScan(basePackages = {"com.package1"})  
public class ConfigurationClass {

	@Bean// It represent Bean classes if there no @bean annotation then the bean classes are created.
	public Employee createemployee()
	{
		Employee e = new Employee();
		e.setEid(100);
		e.setEname("sai");
		e.setEpay(1000000);
		//e.setAddress(creationaddress());// we are injecting address bean class inside employee   class 
		
				
		return e;
		
	}
	
	@Bean
	public Address creationaddress()
	{
		Address a = new Address();
		a.setHouseNO(969);
		a.setStreet("durga Bhavani nagar");
		a.setStreet2("sontoshnagar");
		//a.setEngine(creationengine());
				
		return a;
		
	}
	
	@Bean
	public vehicle creationvehicle()
	{
		vehicle v = new vehicle();
		v.setVid(101);
		v.setVname("Duke");
		return v;
		
	}
	@Bean
	public Engine creationengine()
	{
		Engine e = new Engine();
		e.setEno(111);
		e.setMfg(2020);
		e.setName("Sai");
		return null;
		
	}
	 
	/*
	 * @Bean public EmployeeDao createemployeedao() {
	 * 
	 * 
	 * EmployeeDao dao = new EmployeeDao(); return dao; }
	 */
	
	/*
		 * @Bean public EmployeeService createemployeeservice() {
		 * 
		 * EmployeeService eservice = new EmployeeService(); //
		 * eservice.setEmployee(createemployeedao()); return eservice;
		 * 
		 * }
		 */
	 
	 
	
	
	
	

}
