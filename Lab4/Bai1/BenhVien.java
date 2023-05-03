package Bai1;

class BenhVien {
	private String tenBv, diachiBv, giamDocBv;
	public BenhVien(String name, String address, String nameManager){
		this.tenBv = name;
		this.diachiBv = address;
		this.giamDocBv = nameManager;
	}
	public BenhVien() {}
	public String getTen(){
		return this.tenBv;
	}
	public String getDiaChi(){
		return this.diachiBv;
	}
	public String getNameGiamDoc(){
		return this.giamDocBv;
	}
	public void Show() {
		System.out.println("Ten Bv: " +this.tenBv);
		System.out.println("Dia chi Bv: " +this.diachiBv);
		System.out.println("Ten giam doc Bv: " +this.giamDocBv);
	}
	public void setTen(String name) {
		this.tenBv = name;
	}
		public void setDiaChi(String address) {
		this.diachiBv = address;
	}
	public void setNameGiamDoc(String nameManager) {
		this.giamDocBv = nameManager;
	}
	
}
