import java.util.Scanner;
public class Bai12 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int c,d;
		System.out.print("Nhap so cot:");
		c= sc.nextInt();
		System.out.print("Nhap so dong:");
		d= sc.nextInt();
		int[ ][ ]  arr = new int [d][c];
		for(int i=0;i<d;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("Dong " +(i+1)+ " Cot " +(j+1)+ " :");
				arr[i][j] =sc.nextInt();
			}
		}
		int max = 0;
		for(int i[] :arr)
		{
			for(int y : i)
			{
				if(max < y)
					max = y;
			}
		}
		System.out.print("Gia tri lon nhat trong array la :" + max);
		
	}	 
}
