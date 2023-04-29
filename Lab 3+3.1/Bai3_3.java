package Bai3;

import java.util.Scanner;
class NgayThang{
	private int ngay ,thang,nam;
	NgayThang(){
		Scanner s = new Scanner(System.in);
		do {
		System.out.printf("Nhap ngay:");
		this.ngay = s.nextInt();
		}while(this.ngay >31 || this.ngay < 1);
		do {
		System.out.printf("Nhap thang:");
		this.thang = s.nextInt();
		}while(this.thang >12 || this.thang <1);
			
		System.out.printf("Nhap nam:");
		this.nam = s.nextInt();
		
	}
	public void InNgayThang() {
		System.out.print(this.ngay + "/" + this.thang + "/" + this.nam);
	}
}
class HangHoa{
	protected String maHang ,tenHang ,nhaSx ;
	protected float gia;
	public HangHoa() {
		Scanner s = new Scanner(System.in);
		System.out.printf("Nhap Ma Hang:");
		this.maHang = s.nextLine();
		System.out.printf("Nhap Tem Hang:");
		this.tenHang  = s.nextLine();
		System.out.printf("Nhap Nha sx:");
		this.nhaSx = s.nextLine();
		System.out.printf("Nhap Gia :");
		this.gia = s.nextInt();
	}
	protected void In() {
		System.out.println("Ma Hang: "+this.maHang);
		System.out.println("Ten Hang: "+this.tenHang);
		System.out.println("Nha Sx: "+this.nhaSx);
		System.out.println("Gia: "+this.gia);
	}
}
class HangThucPham extends HangHoa{
	private NgayThang ngaySx,NgayHh;
	HangThucPham() {
		
		System.out.println("Nhap Ngay Sx:");
		this.ngaySx = new NgayThang();
		System.out.println("Nhap Ngay Het Han:");
		this.NgayHh = new NgayThang();
	}
	public void In() {
		super.In();
		System.out.printf("Ngay Sx:");
		this.ngaySx.InNgayThang();
		System.out.printf("\nNgay HH:");
		this.NgayHh.InNgayThang();
	}
}
class HangSanhSu extends HangHoa{
	private String loaiNguyenLieu;
	public HangSanhSu() {
		Scanner s = new Scanner(System.in);
		System.out.printf("Nhap loai nguyen lieu:");
		this.loaiNguyenLieu = s.nextLine();
	}
	public void In() {
		super.In();
		System.out.printf("Loai nguyen lieu" + this.loaiNguyenLieu);
		
	}
}
class HangDienMay extends HangHoa{
	private float tgBaoHanh ,dienAp ,congSuat;
	public HangDienMay() {
		Scanner s = new Scanner(System.in);
		System.out.printf("Nhap Thoi gian bao hanh:");
		this.tgBaoHanh = s.nextInt();
		System.out.printf("Nhap Dien Ap:");
		this.dienAp = s.nextInt();
		System.out.printf("Nhap Cong suat:");
		this.congSuat = s.nextInt();
	}
	public void In() {
		super.In();
		System.out.printf("TG Bao Hanh: " + this.tgBaoHanh);
		System.out.printf("\nDien Ap:" + this.dienAp);
		System.out.printf("Cong suat: " +this.congSuat);
	}
}

public class Bai3_3 {
	public static void main(String[] args) {
		HangThucPham a = new HangThucPham();
		
	}
	
}
