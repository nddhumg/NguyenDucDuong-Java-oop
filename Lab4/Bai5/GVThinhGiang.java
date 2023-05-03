package Bai5;

import java.util.Scanner;

public class GVThinhGiang extends Giangvien{
	private int donGia, tietDay;
	
	public GVThinhGiang(int donGia) {
		this.donGia = donGia;
		setGiangVien("Thinh Giang");
	}
	public void NhapThongTin() {
		super.NhapThongTin();
		
		Scanner s = new Scanner(System.in);
		System.out.printf("Nhap so tiet day: ");
		this.tietDay = s.nextInt();
		
	}
	public void InThongTin() {
		super.InThongTin();
		System.out.println("So tiet day: " +this.tietDay);
	}
	@Override
	float Luong() {
		int thuNhap = this.tietDay * this.donGia;
		return thuNhap - ((float)15/100) * thuNhap; 
	}
	
}
