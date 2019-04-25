package com.cognizant.pack1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDAO {
HibernateTemplate template;
public void setTemplate(HibernateTemplate template) {
	this.template = template;
}

public void saveEmployee(Employee e){
	template.save(e);
}

public void updateEmployee(Employee e){
	template.update(e);
}

public void deleteEmployee(Employee e){
	template.delete(e);
}
public Employee getById(int id){  
    Employee e=(Employee)template.get(Employee.class,id);  
    return e;  
}  
//method to return all employees  
public List<Employee> getEmployees(){  
    List<Employee> list=new ArrayList<Employee>();  
    list=template.loadAll(Employee.class);  
    return list;
}
