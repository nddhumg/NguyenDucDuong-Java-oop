package Bai6;

import java.util.Scanner;

public class CNKSP extends CongNhan{
	private int soLuong, donGia;
	public CNKSP(int dongia) {
		this.donGia = dongia;
		setLoaiCN("Khoang San Pham");
	}
	public void NhapThongTin() {
		super.NhapThongTin();
		
		Scanner s = new Scanner(System.in);
		System.out.printf("Nhap so luong sp: ");
		this.soLuong = s.nextInt();
	}
	public void InThongTin() {
		super.InThongTin();
	
		System.out.println("So luong sp: " + this.soLuong);
		System.out.println("Thuong: " + this.getThuong());
	}
	@Override
	float Luong() {
		setThuong(0);
		if(this.soLuong >= 1000 + 150) {
			setThuong(1500000);
		}else if(this.soLuong >= 1000 + 100)
			setThuong(1000000);
		return this.soLuong * this.donGia + getThuong();
	}
	
}
