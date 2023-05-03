package Bai1;

class BenhNhan extends Nguoi{
	private String tienSu, chuanDoan;
	private BenhVien benhVien;
	public BenhNhan() {
		this.benhVien = new BenhVien();
		this.CheckBenhVien();
	}
	public BenhNhan(String name, int old, char sex, String ts, String cd, String nameBV, String addressBV, String nameManagerBV) {
		this.setNguoi(name, old, sex);
		benhVien = new BenhVien(nameBV,addressBV,nameManagerBV);
		this.tienSu = ts;
		this.chuanDoan = cd;
		this.CheckBenhVien();
	}
	private void CheckBenhVien() {
		if(benhVien == null)
			System.out.println("NULL BenhVien");
	}
	public String getTienSu() {
		return this.tienSu;
	}
	public BenhVien getBenhVien(){
		if(this.benhVien != null)
			return this.benhVien;
		else
			return null;
	}
	public String getChuanDoan() {
		return this.chuanDoan;
	}
	public void setTienSu(String ts) {
		this.tienSu = ts;
	}
	public void setChuanDoan(String cd) {
		this.chuanDoan = cd;
	}
	public void Show() {
		super.Show();
		System.out.println("Tien Su : " +this.tienSu);
		System.out.println("Chuan Doan : " +this.chuanDoan);
		benhVien.Show();
	}
	
}
