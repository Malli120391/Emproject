package org.malleswara.empTest;

import org.malleswara.empImple.EmployeeDaoImple;
import org.malleswara.empdao.EmployeeDAO;
import org.malleswara.empmodel.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

		EmployeeDAO employeedao = new EmployeeDaoImple();
		
		 for(Employee employeeall : employeedao.getAllEmployees()) {
			 System.out.println("Employee: [Emp No : " + employeeall.getEmpNo() + ", " 
		 + "Name : " + employeeall.getName() + " , " + "Address :" + employeeall.getAddress() + "," + "PhNO :" 
					 + employeeall.getPhonenumber() + "]");
			 
			 
		 }
		 System.out.println("****************************************");
		 
		 Employee employee = employeedao.getAllEmployees().get(0);
		 employee.setName("Chennu");
		 employeedao.updateEmployee(employee, 0);
		 employeedao.saveEmployee(employee);
		 
		 //Employee employee = employeedao.getEmployee(0);
		 System.out.println("Employee: [Emp No : " + employee.getEmpNo() + ", " 
				 + "Name : " + employee.getName() + " , " + "Address :" + employee.getAddress() + "," + "PhNO :" 
				 + employee.getPhonenumber() + "]"); 
		
		//Employee employee = employeedao.getEmployee(0);
		employeedao.deleteEmployee(employee);
	}
	
	

}
