package Bai4;

public class TestB4 {
	public static void main(String[] args) {
		System.out.println("DO HOA :");
		HocvienDH dh = new HocvienDH(1000);
		dh.NhapThongtin();
		
		System.out.println("L Trinh :");
		HocvienLT lt = new HocvienLT(1000000);
		lt.NhapThongtin();
		
		dh.InThongTin();
		System.out.println("--------------------- Laptrinh");
		lt.InThongTin();
	}
	
}
