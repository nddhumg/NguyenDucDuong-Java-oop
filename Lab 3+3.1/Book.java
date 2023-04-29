import java.util.Scanner;

public class Book{
	private String ms,ts,tg,loai,nxb;
	private int strang,stap, gia;
	
	public void InSach() {
		System.out.println("Thong tin sach:");
		System.out.println("Ma sach: " + this.ms );
		System.out.println("Ten sach: " + this.ts );
		System.out.println("Ten tac gia: " + this.tg );
		System.out.println("So trang: " + this.strang );
		System.out.println("Loai sach: " + this.loai );
		System.out.println("Nha xuat ban: " + this.nxb );
		System.out.println("So tap: " + this.stap );
		System.out.println("Gia sach: " + this.gia );
		
	}
	public void NhapSach() {
		Scanner s = new Scanner(System.in);
		System.out.printf("Nhap Ma sach");
		this.ms = s.nextLine();
		System.out.printf("Nhap Ten sach");
		this.ts = s.nextLine();
		System.out.printf("Nhap Ten tac gia");
		this.tg = s.nextLine();
		System.out.printf("Nhap So trang");
		this.strang = s.nextInt();
		s.nextLine();
		System.out.printf("Nhap Loai sach");
		this.loai = s.nextLine();
		System.out.printf("Nhap Nha xb");
		this.nxb = s.nextLine();
		System.out.printf("Nhap So tap");
		this.stap = s.nextInt();
		System.out.printf("Nhap Gia sach");
		this.gia = s.nextInt();

	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Book[] a = new Book[10];		
		System.out.printf("Nhap so luong sach :");
		int sl = s.nextInt();
		for(int i = 0;i < sl; i++) {
			a[i] = new Book();
			a[i].NhapSach();
		}
		for(int i=0; i< sl ;i++) {
			a[i].InSach();
			System.out.printf("--------------------");
		}
	}	 
}

 