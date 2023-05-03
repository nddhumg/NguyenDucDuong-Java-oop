package Bai2;

 class Truong {
	private String ten,diaChi,hieuTruong;
	public Truong(String name, String address, String nameManager){
		this.ten = name;
		this.diaChi = address;
		this.hieuTruong = nameManager;
	}
	public Truong() {}
	public String getTen(){
		return this.ten;
	}
	public String getDiaChi(){
		return this.diaChi;
	}
	public String getNameHieuTruong(){
		return this.hieuTruong;
	}
	public void Show() {
		System.out.println("Ten Truong: " +this.ten);
		System.out.println("Dia chi Truong: " +this.diaChi);
		System.out.println("Ten Hieu Truong: " +this.hieuTruong);
	}
	public void setTen(String name) {
		this.ten = name;
	}
	public void setDiaChi(String address) {
		this.diaChi = address;
	}
	public void setNameHieuTruong(String nameManager) {
		this.hieuTruong = nameManager;
	}
}
