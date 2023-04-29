import java.util.Scanner;
import java.lang.Math;

class DIEM {
	private int x,y;
	DIEM(int a,int b){
		this.x = a;
		this.y = b;
	}
	protected void NhapDiem() {
		Scanner s = new Scanner(System.in);
		System.out.printf("Nhap x: ");
		this.x = s.nextInt();
		System.out.printf("Nhap y: ");
		this.y = s.nextInt();
	}
	protected void InDiem() {
		System.out.print("(" + this.x + ',' + this.y + ")");
	}
	protected int GetX() {
		return this.x;
	}
	protected int GetY() {
		return this.y;
	}
}
class TamGiac{
	 private DIEM A,B,C;
	 private double AB,BC,AC;
	 TamGiac(){
		 A = new DIEM(0,0);
		 B = new DIEM(0,0);
		 C = new DIEM(0,0);
	 }
	 public void NhapTg() {
		 System.out.printf("Nhap x,y diem A\n");
		 this.A.NhapDiem();
		 System.out.printf("Nhap x,y diem B\n");
		 this.B.NhapDiem();
		 System.out.printf("Nhap x,y diem C\n");
		 this.C.NhapDiem();
		 this.DoDaiCacDiem();
	 }
	 public void InTamGiac() {
		 System.out.printf("Diem A: ");
		 this.A.InDiem();
		 System.out.printf("Diem B: ");
		 this.B.InDiem();
		 System.out.printf("Diem C: ");
		 this.C.InDiem();
	 }
	 protected boolean KiemTra() {
		  
		 if((AB+AC > BC) && (AB+BC > AC) && (BC+AC > AB))
			 return true;
		 return false;
	 }
	 protected double DoDai(DIEM x, DIEM y) {
		 return Math.sqrt(Math.pow((y.GetX() - x.GetX()), 2) + Math.pow((y.GetY() - x.GetY()), 2));
	 }
	 private void DoDaiCacDiem( ) {
		 this.AB = this.DoDai(A, B); 
		 this.BC = this.DoDai(B, C);
		 this.AC = this.DoDai(A, C);
		 
	 }
	 protected double ChuVi() {
		  
		  
		 return AB + AC + BC;
	 }
	 protected double DienTich() {
		 double p = this.ChuVi()/2;
		 return Math.sqrt(p*(p-AB)*(p-BC)*(p-AC));
	 }
	 
}
class HinhTron{
	private DIEM o;
	private int r;
	HinhTron(){
		o = new DIEM(0,0);
		r = 0;
	}
	protected void NhapDT() {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap tam duong tron:");
		o.NhapDiem();
		do {
			if(r<0) 
				System.out.println("ERROR bk < 0:");
		System.out.printf("Nhap bk duong tron:");
		this.r = s.nextInt();
		}while(r<0);
	}
	protected void InDT() {
		System.out.printf("Diem tam duong tron:");
		o.InDiem();
		System.out.printf("\nBk duong tron: " +r);
	}
	protected double ChuVi() {
		return r*2*Math.PI;
	}
	protected double DienTich() {
		return r*r*Math.PI;
	}
}
public class Bai3_2 {
	public static void main(String[] args) {
		TamGiac a = new TamGiac();
		a.NhapTg();
		a.InTamGiac();
		System.out.printf("CV:" +a.ChuVi() + "DT:" +a.DienTich());
	}
}

