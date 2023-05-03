package Bai2;

class TestB2 {
	public static void main(String[] args) {
		Sinhvien bn = new Sinhvien("duong", 21, 'n', "ko", "ko", "test", "test", "test");
		bn.Show();
		bn.setTen("duong1");
		bn.setGioiTinh('m');
		bn.setLop("co");
		bn.setChuanDoan("co");
		if(bn.getTruong() !=null) {
			bn.getTruong().setDiaChi("test moi");
			bn.getTruong().setNameHieuTruong("Ht moi");
			bn.getTruong().setTen("h noi moi");
		}
		else
			System.out.println("Truong null");
		System.out.println("-------------------------");
		bn.Show();
	}
}
