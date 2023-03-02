import java.util.Scanner;
public class Bai1 
{
	public static void main(String[] args) 
	{
		float a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextFloat();
        System.out.println("Nhap b: ");
        b = sc.nextFloat();  
        System.out.println("Tong:"+(a+b));
        System.out.println("Hieu:"+(a-b));
        System.out.println("Thuong:"+(a/b));
        System.out.println("Thuong lay du:"+(a%b));
        if(a>b) 
        {
        	System.out.println("a>b");
        	 
        }
        else
        {
        	if(a==b) 
        	{
        		System.out.println("a=b");
        	}
        	else 
        	{
        		System.out.println("a<b");
        	}
        }
	}
}
