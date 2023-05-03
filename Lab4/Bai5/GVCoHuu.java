package Bai5;

import java.util.Scanner;

public class GVCoHuu extends Giangvien{
	private int namcongTac,luongCB;
	private float heSoLuong;
	public GVCoHuu(int luongCB) {
		this.luongCB = luongCB;
		setGiangVien("Co Huu");
	}
	public void NhapThongTin() {
		Scanner s = new Scanner(System.in);
		super.NhapThongTin();
		System.out.printf("Nhap so nam cong tac: ");
		this.namcongTac = s.nextInt();
		System.out.printf("Nhap he so luong: ");
		this.heSoLuong = s.nextInt();
		
	}
	public void InThongTin() {
		super.InThongTin();
		System.out.println("So nam cong tac: " +this.namcongTac);
		System.out.println("He so luong: " + this.heSoLuong);
	}
	@Override
	 float Luong() {
		if(namcongTac < 5) 
			return (this.luongCB * this.heSoLuong) ;
		else
			return this.luongCB * this.heSoLuong + (((float)this.namcongTac/100) *this.luongCB);
	}

}
