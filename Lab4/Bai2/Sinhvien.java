package Bai2;


class Sinhvien extends Bai1.Nguoi{
	private String lop, nganh;
	private Truong truong;
	
	public Sinhvien() {
		this.truong = new Truong();
		this.CheckTruong();
	}
	public Sinhvien(String name, int old, char sex, String lop, String nganh, String nameTrg, String addressTrg, String nameHT) {
		this.setNguoi(name, old, sex);
		truong = new Truong(nameTrg,addressTrg,nameHT);
		this.lop = lop;
		this.nganh = nganh;
		this.CheckTruong();
	}
	private void CheckTruong() {
		if(truong == null)
			System.out.println("NULL BenhVien");
	}
	public String getLop() {
		return this.lop;
	}
	public Truong getTruong(){
		if(this.truong != null)
			return this.truong;
		else
			return null;
	}
	public String getNganh() {
		return this.nganh;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public void setChuanDoan(String nganh) {
		this.nganh = nganh;
	}
	public void Show() {
		super.Show();
		System.out.println("Lop : " +this.lop);
		System.out.println("Nganh : " +this.nganh);
		truong.Show();
	}
}

