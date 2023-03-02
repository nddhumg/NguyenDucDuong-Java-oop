import java.util.Scanner;
public class NguyenDucDuong_App {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten:");
		String ten = sc.nextLine();
		System.out.println("Nhap nam sinh:");
		int namsinh = sc.nextInt();
		int tuoi = 2023 - namsinh;
		 
		if(tuoi<16)
		{
			System.out.println("Ban " +ten+ " o do tuoi thanh nien");
		}
		else if(tuoi >=18)
		{
			System.out.println("Ban " +ten+ " da gia");
		}
		else
		{
			System.out.println("Ban " +ten+ " o do tuoi truong thanh");
		}
	}
}
