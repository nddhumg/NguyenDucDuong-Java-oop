import java.util.Scanner;
import java.util.*;
public class SinhVien{
	private  String msv, hvt, lop;
	public void SetSinhvien() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap msv: ");
		this.msv = sc.nextLine();
		System.out.print("Nhap hvt: ");
		this.hvt = sc.nextLine();
		System.out.print("Nhap lop: ");
		this.lop = sc.nextLine();
	}
	public void GetSinhVien() {
		System.out.println("MSV: "+ this.msv+ ",  HVT: "+ this.hvt+ ",  Lop: "+ this.lop);
	}
	public String GetMsv() {
		return this.msv;
	}
	public String GetName() {
		return this.hvt;
	}
	public String GetClass() {
		return this.lop;
	}
	public static void main(String[] args) {
		Map<String, SinhVien> danhSachSinhVien = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap sl sinh vien: ");
		int sl = sc.nextInt();
		for(int i=0; i < sl; i++) {
			SinhVien sv= new SinhVien();
			sv.SetSinhvien();
			danhSachSinhVien.put(sv.GetMsv(),sv);
		}
		sc.nextLine();
		System.out.print("Nhap lop can tim: ");
		String tLop = sc.nextLine();
		for(SinhVien sv : danhSachSinhVien.values()) {
			if(sv.GetClass().equals(tLop)) {
				sv.GetSinhVien();
			}
		}
		
		System.out.print("Nhap msv can tim: ");
		String tMsv = sc.nextLine();
		for(SinhVien sv : danhSachSinhVien.values()) {
			if(sv.GetMsv().equals(tMsv)) {
				sv.GetSinhVien();
			}
		}
	}
}