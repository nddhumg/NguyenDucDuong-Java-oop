package Bai5;

import java.util.Scanner;

abstract class Giangvien {
	private String hoTen, diaChi, giangVien;
	
	public void NhapThongTin() {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap thong tin giang vien: " +this.giangVien);
		System.out.printf("Nhap ho ten giang vien: ");
		this.hoTen = s.nextLine();
		System.out.printf("Nhap dia chi giang vien: ");
		this.diaChi = s.nextLine();
		
	}
	public void InThongTin() {
		System.out.println("Thong tin giang vien: " +this.giangVien);
		System.out.println("Ho ten giang vien: " +this.hoTen);
		System.out.println("Dia chi giang vien: " +this.diaChi);
		System.out.println("Loai giang vien: " +this.giangVien);
		System.out.println("Luong giang vien: " +(int)this.Luong());
	}
	
	public void setGiangVien(String gv) {
		this.giangVien = gv;
	}
	abstract float Luong();
}
