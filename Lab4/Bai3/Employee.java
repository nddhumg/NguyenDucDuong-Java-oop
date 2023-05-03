package Bai3;

class Employee extends Bai1.Nguoi{
	private String employerName, dataHired;
	public Employee() {
	
	}
	public Employee(String employerName, String dataHired) {
		this.employerName = employerName;
		this.dataHired = dataHired;
	}
	public Employee(String name,int old,char sex,String employerName, String dataHired) {
		setNguoi(name, old, sex);
		this.employerName = employerName;
		this.dataHired = dataHired;
	}
	public String getEmployerName() {
		return this.employerName;
	}
	public String getDataHired() {
		return this.employerName;
	}
	public void setDataHired(String dataHired) {
		this.dataHired = dataHired;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public void setEmployee(String employerName, String dataHired) {
		this.employerName = employerName;
		this.dataHired = dataHired;
	}
	public void setEmployee(String name,int old,char sex,String employerName, String dataHired) {
		setNguoi(name, old, sex);
		this.employerName = employerName;
		this.dataHired = dataHired;
	}
	public void Show() {
		super.Show();
		System.out.println("EmployerName: " +this.employerName);
		System.out.println("DataHired: " +this.dataHired);
	}
}
