package Bai1;

public class Nguoi {
	private String ten;
	private int tuoi;
	private char gioiTinh;
	public Nguoi(String name,int old,char sex){
		this.setTen(name);
		this.setGioiTinh(sex);
		this.setTuoi(old);
	}
	public Nguoi(){	
	}
	public void setNguoi(String name,int old,char sex){
		this.setTen(name);
		this.setGioiTinh(sex);
		this.setTuoi(old);
	}
	public String getTen(){
		return this.ten;
	}
	public int getTuoi(){
		return this.tuoi;
	}
	public char getGioitinh(){
		return this.gioiTinh;
	}
	public void setTen(String name) {
		this.ten = name;
	}
	public void setTuoi(int old) {
		this.tuoi = old;
	}
	public void setGioiTinh(char sex) {
		this.gioiTinh = sex;
	}
	public void Show() {
		System.out.println("Ten : " +this.ten);
		System.out.println("Tuoi : " +this.tuoi);
		System.out.println("Gioi tinh : " +this.gioiTinh);
	}
}
