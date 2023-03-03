import java.util.Scanner;
public class Bai9 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi ktra:");
		String a = sc.nextLine();
		int t=0,h=0,s=0;
		char kytu;
		for(int i=0;i<a.length();i++) {
			kytu = a.charAt(i);
			if(kytu>=48 && kytu<=57) {
				s++;
			}else if(kytu>=65 && kytu<=90) {
				h++;
			}else if(kytu>=97 && kytu<=122) {
				t++;
			}
		}
		System.out.println("So chu Hoa trong string:"+ h );
		System.out.println("So chu Thuong trong string:"+ t );
		System.out.println("So chu So trong string:"+ s );
	}	 
}
