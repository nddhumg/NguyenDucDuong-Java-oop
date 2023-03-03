import java.util.Scanner;
public class Bai8 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu:");
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Nhap phan tu " +i+ "  :");
			array[i] = sc.nextInt();
		}
		int tong = 0;
		for(int b :array) {
			tong += b;
		}
		System.out.println(tong);
		System.out.println("Trung binh trong mang la :" +(float)tong /(float)n);
	}	 
}
