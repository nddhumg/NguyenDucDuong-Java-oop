import java.util.*;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();

        
        for (int i = 0; i < n; i++) {
        	System.out.print("Nhap phan tu "+ i+" vao Stack: ");
            int num = scanner.nextInt();
            stack.push(num);
        }
        System.out.print("NNhap so luong phan tu muon lay tu Stack: ");
        int m = scanner.nextInt();

        if (m > n) {
            System.out.println("Ko du phan tu");
        } else {
            System.out.println("Cac phan tu tu Stack:");
            for (int i = 0; i < m; i++) {
                int element = stack.pop();
                System.out.println(element);
            }
        }
    }
}