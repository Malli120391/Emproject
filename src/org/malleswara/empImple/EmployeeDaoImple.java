package org.malleswara.empImple;

import java.util.ArrayList;
import java.util.List;

import org.malleswara.empdao.EmployeeDAO;
import org.malleswara.empmodel.Employee;

public class EmployeeDaoImple implements EmployeeDAO {
	
	List<Employee> employees;
	
	

	public EmployeeDaoImple() {
		super();
		employees = new ArrayList<>();
		Employee emp1 = new Employee("Malleswara", 1, "Hyderabad", "9505873779");
		Employee emp2 = new Employee("Sandeep", 2, "Hyderabad", "1478523690");
		Employee emp3 = new Employee("Naresh", 3, "Vithalapuram", "7412589630");
		Employee emp4 = new Employee("Nazeer", 4, "Nandyala", "3698521470");
		Employee emp5 = new Employee("Mohan", 5, "Bangalore", "2587413690");
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return employees;
	}

	@Override
	public void saveEmployee(Employee employee) {
		
		employees.add(employee);

	}

	@Override
	public Employee getEmployee(int empNo) {
		return  (Employee) employees.get(empNo);
	}

	@Override
	public void updateEmployee(Employee employee, int index) {

		employees.get(index).setName(employee.getName());
		System.out.println("Employee: Emp No " + employee.getEmpNo() + ", updated in the database");
	}

	@Override
	public void deleteEmployee(Employee employee) {
		employees.remove(employee.getEmpNo());
		System.out.println("Employee: Emp No " + employee.getEmpNo() + ", deleted from database");

	}

}
