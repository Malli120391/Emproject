package org.malleswara.empdao;

import java.util.List;

import org.malleswara.empmodel.Employee;

public interface EmployeeDAO {
	
	List<Employee> getAllEmployees();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployee(int empNo);
	
	void updateEmployee(Employee empoyee, int index);
	
	void deleteEmployee(Employee employee);
	
	
	

}
