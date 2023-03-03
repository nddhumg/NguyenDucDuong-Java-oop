import java.util.Scanner;
public class Bai11 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu:");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Nhap so nguyen " +i+" :");
			a[i] = sc.nextInt();
		}
		
		System.out.print ("Mang ban dau: " );
		for(int i=0;i<n;i++) {
			System.out.print(a[i] );
		}
		int temp;
		System.out.print("\nMang sau khi sap xep: ");
		for(int i=0;i<n;i++) {
			for(int y=i+1;y<n-1;y++)
			{
				if(a[i]>a[y])
				{
					temp = a[i];
					a[i] = a[y];
					a[y] = temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i] );
		}
		
	}	 
}
