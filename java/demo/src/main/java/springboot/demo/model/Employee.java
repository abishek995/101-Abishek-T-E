package springboot.demo.model;

public class Employee {

	String empid;
	String empname;
	public Employee(String empid,String empname) {
		super();
		this.empid=empid;
		this.empname=empname;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
}
