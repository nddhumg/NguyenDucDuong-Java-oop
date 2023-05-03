package Bai3;

class PartTimeEmployee extends Employee{
	private int hoursPerWeek;
	public PartTimeEmployee() {}
	public PartTimeEmployee(String name,int old,char sex,String employerName, String dataHired, int hoursPerWeek) {
		setEmployee(name, old, sex, employerName, dataHired);
		this.hoursPerWeek = hoursPerWeek;
	}
	public int getHoursPerWeek() {
		return this.hoursPerWeek;
	}
	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	public void Show() {
		super.Show();
		System.out.println("HoursPerWeek: " +this.hoursPerWeek);
	}
	
}
