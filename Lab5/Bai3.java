import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Nhap sl phan tu: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
        	System.out.print("Nhap phan tu " + i + " vao Queue: ");
            int num = scanner.nextInt();
            queue.add(num);
        }

        System.out.print("Nhap sl phan tu muon lay tu Queue: ");
        int m = scanner.nextInt();

        if (m > n) {
            System.out.println("Ko du phan tu trong Queue.");
        } else {
            System.out.println("Cac phan tu lay tu Queue:");
            for (int i = 0; i < m; i++) {
                int element = queue.poll();
                System.out.println(element);
            }
        }
    }
}
