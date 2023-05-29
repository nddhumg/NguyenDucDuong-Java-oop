import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Bai1 {
	private int n = 0;
	private List<Integer> lists = new ArrayList<>();;
	public void Nhap() {
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.print("Nhap n (n > 0):");
			this.n = scanner.nextInt();
		}while(n <= 0);
	}
	public void AddToTheList() {
		int temp;
		while(n != 0) {
			temp = n%10;
			n/=10;
			lists.add(temp);
		}
	}
	public boolean Kiemtra() {
		int length = lists.size();
		if(length == 0) {
			System.out.print("Error . LIST NOT VALUE");
			return false;
		}
		for(int i= 0; i < length/2; i++) 
			 if (lists.get(i) != lists.get(length - 1 - i)) 
				 return false;

		return true;
	}
	public static void main(String[] args) {
       Bai1 test = new Bai1();
      test.Nhap();
      test.AddToTheList();
      if(test.Kiemtra()) 
    	  System.out.print("So vua nhap la so nghich dao");
      else
    	  System.out.print("So vua nhap ko la so nghich dao");
    }
}
