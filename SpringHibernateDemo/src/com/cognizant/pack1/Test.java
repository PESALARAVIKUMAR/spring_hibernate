package com.cognizant.pack1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
	
	Resource r=new ClassPathResource("applicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(r);
	
	EmployeeDAO dao=(EmployeeDAO)factory.getBean("d");
	
	Employee e=new Employee();
	e.setId(147);
	e.setName("kumar");
	e.setSalary(70000);
	
	dao.saveEmployee(e);
	dao.updateEmployee(e);
}
}
