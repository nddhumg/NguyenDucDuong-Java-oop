package Bai6;

import java.util.Scanner;

abstract class CongNhan {
	private String hoTen, diaChi, loaiCN, ngaySinh;
	private float thuong;
	public void NhapThongTin() {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap Thong Tin Cong nhan loai: " +this.loaiCN);
		System.out.printf("Nhap ho ten: ");
		this.hoTen = s.nextLine();
		System.out.printf("Nhap dia chi: ");
		this.diaChi = s.nextLine();
		System.out.printf("Nhap ngay sinh: ");
		this.ngaySinh = s.nextLine();
	}
	public void InThongTin() {
		System.out.println("Ho ten: " + this.hoTen);
		System.out.println("Dia chi: " + this.diaChi);
		System.out.println("Ngay sinh: " + this.ngaySinh);
		System.out.println("Loai Cong nhan: " + this.loaiCN);
		System.out.println("LUONG: " + (int)this.Luong());
	}
	public void setLoaiCN(String loai) {
		this.loaiCN = loai;
	}
	public void setThuong(float thuong) {
		this.thuong = thuong;
	}
	public float getThuong() {
		return this.thuong;
	}
	abstract float Luong();
}
