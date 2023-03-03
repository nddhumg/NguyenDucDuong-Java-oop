import java.util.Scanner;
public class Bai10 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a;
		do {
		System.out.println("Nhap chuoi:");
		 a = sc.nextLine();
		}while(a.length() >80);
		System.out.println("Nhap ky tu kiem tra:");
		char kytu = sc.next().charAt(0);
		int dem=0;
		 for(int i=0;i<a.length();i++)
		 {
			 if(kytu == a.charAt(i))
				 dem++;
		 }
		 System.out.println("So ky tu kiem tra trong chuoi la:"+dem);
	}	 
}
