package Bai1;

class TestB1 {
	public static void main(String[] args) {
		BenhNhan bn = new BenhNhan("duong", 21, 'n', "ko", "ko", "test", "test", "test");
		bn.Show();
		bn.setTen("duong1");
		bn.setGioiTinh('m');
		bn.setTienSu("co");
		bn.setChuanDoan("co");
		if(bn.getBenhVien() !=null) {
			bn.getBenhVien().setDiaChi("test moi");
			bn.getBenhVien().setNameGiamDoc("gd moi");
			bn.getBenhVien().setTen("h noi moi");
		}
		else
			System.out.println("Benh vien null");
		System.out.println("-------------------------");
		bn.Show();
	}
}
