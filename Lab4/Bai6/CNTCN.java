package Bai6;

import java.util.Scanner;

public class CNTCN extends CongNhan{
	private int luongCB, ngayCong; 
	private float hsLuong;
	public CNTCN(int luongCb) {
		this.luongCB = luongCb;
		setLoaiCN("Tinh Cong Nhat");
	}
	public void NhapThongTin() {
		super.NhapThongTin();
		
		Scanner s= new Scanner(System.in);
		System.out.printf("Nhap hs Luong: ");
		this.hsLuong = s.nextFloat();
		System.out.printf("Nhap ngay cong: ");
		this.ngayCong = s.nextInt();
	}
	public void InThongTin() {
		super.InThongTin();
		
		System.out.println("Luong Co ban: " + this.luongCB);
		System.out.println("He so luong: " + this.hsLuong);
		System.out.println("So ngay cong: " + this.ngayCong);
		System.out.println("Thuong: " + this.getThuong());
	}
	@Override
	float Luong() {
		if(this.ngayCong >= 20)
			setThuong((float)(1.2 * this.luongCB));
		else
			setThuong(0);
		return this.luongCB * this.hsLuong + getThuong();
	}

}
