package org.malleswara.empmodel;

public class Employee {
	
	private String name;
	private int empNo;
	private String address;
	private String phonenumber;
	
	public Employee() {
		
	}
	
	public Employee(String name, int empNo, String address, String phonenumber) {
		
		this.name = name;
		this.empNo = empNo;
		this.address = address;
		this.phonenumber = phonenumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empNo=" + empNo + ", address=" + address + ", phonenumber=" + phonenumber
				+ "]";
	}
	
	

}
