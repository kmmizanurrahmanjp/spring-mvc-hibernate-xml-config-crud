package xyz.mizan.spring.mvc.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import xyz.mizan.spring.mvc.model.Employee;

@Service
public interface EmployeeDAO {

	public void addEmployee(Employee employee);
	 
    public List<Employee> getAllEmployees();
 
    public void deleteEmployee(Integer employeeId);
 
    public Employee updateEmployee(Employee employee);
 
    public Employee getEmployee(int employeeid);
}
