package com.coll.configuration;

import java.util.Properties;


import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.coll.models.Job;
import com.coll.models.User;





@Configuration
@EnableTransactionManagement
public class DBConfiguration {
  public DBConfiguration(){
	 System.out.println("DBConfiguration class is instantiated"); 
  }
  @Bean
	public DataSource getDataSource() {
		System.out.println("Inside getDataSource()");
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
	    dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
	    dataSource.setUsername("collaboration");
	    dataSource.setPassword("pass123");
	    return dataSource;	    
	}
  @Bean
	public SessionFactory sessionFactory() {
	  System.out.println("Inside sessionFactory()");
		LocalSessionFactoryBuilder lsf=
				new LocalSessionFactoryBuilder(getDataSource());
		Properties hibernateProperties=new Properties();
		hibernateProperties.setProperty("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto","update");
		hibernateProperties.setProperty("hibernate.show_sql","true");
		lsf.addProperties(hibernateProperties);
		lsf.scanPackages("com.coll.models");
		/*Class classes[]=new Class[]{User.class,Job.class}; //class objects of all entities
	    return lsf.addAnnotatedClasses(classes).buildSessionFactory();*/
		return lsf.buildSessionFactory();
	}
	@Bean
	public HibernateTransactionManager hibTransManagement(){
		return new HibernateTransactionManager(sessionFactory());
	}
}
