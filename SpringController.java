package com.package1;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.mypackage"})
@PropertySource("classpath:db.properites")
public class SpringController {
	
	
	  /*Value("${url}") 
	  private String url;
	  
	  public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Value("${username}") 
	  private String username;
	  
	  @Value("${password}") 
	  private String password;
*/	 
	
	//private DataSource datasource;
	
	
	
		
		  @Autowired 
		  private Environment env;
		  
		  @Bean(value = "service")
		  
		  public JdbcTemplate createjdbctemplate() { 
			  JdbcTemplate jd = new JdbcTemplate(); //jd.setDataSource(createdatasource());
		  jd.setDataSource(createdatasource());
		  
		  return jd; }
		  
		  @Bean public DataSource createdatasource() {
		  
		  DriverManagerDataSource dv = new DriverManagerDataSource();
		  dv.setUrl(env.getProperty("dburl"));
		  dv.setUsername(env.getProperty("dbusername"));
		  dv.setPassword(env.getProperty("dbpassword"));
		  dv.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		  
		  
		  return dv;
		  
		  }
		  
		 	
/*	  @Bean
	  public static PropertyPlaceholderConfigurer createproperty() { return new
	  PropertyPlaceholderConfigurer(); }
*/	 	
	// this bean is injecting values into variables.
	

}
