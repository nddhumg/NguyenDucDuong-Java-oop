package Bai4;
import java.util.Scanner;
public abstract class Hocvien {
	private String hoTen, diaChi;
	private int uuTien, soBuoi;
	public int donGia;
	public String chuongTrinh;
	
	public void NhapThongtin() {
		Scanner s = new Scanner(System.in);
		System.out.printf("Nhap ho ten: ");
		this.hoTen = s.nextLine();
		System.out.printf("Nhap dia chi :");
		this.diaChi = s.nextLine();
		System.out.printf("Nhap loai uu tien :");
		this.uuTien = s.nextInt();
		System.out.printf("Nhap so buoi :");
		this.soBuoi = s.nextInt();
		s.close();
	}
	
	public void InThongTin() {
		System.out.println("Ho ten:" +this.hoTen);
		System.out.println("Dia chi:" +this.diaChi);
		System.out.println("Ho ten:" +this.hoTen);
		System.out.println("Chuong trinh:" +this.chuongTrinh);
		System.out.println("Loai uu tien:" +this.uuTien);
		System.out.println("So buoi hoc:" +this.soBuoi);
		System.out.println("Hoc Phi:" +this.HocPhi());
	}
	public int getUuTien() {
		return this.uuTien;
	}
	public int getSoBuoi() {
		return this.soBuoi;
	}
	
	public void setSoBuoi( int sb) {
		this.soBuoi = sb;
	} 

	abstract int HocPhi();
}
