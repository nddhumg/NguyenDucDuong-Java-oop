import java.util.*;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap sl phan tu trong mang: ");
        int n = scanner.nextInt();

       
        double[] arr = new double[n];
        System.out.println("Nhap pt trong mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }

       
        Map<Double, Integer> elementCount = new HashMap<>();
        for (double num : arr) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }

        System.out.println("Cac pt xuat hien 1 lan trong mang:");
        for (Map.Entry<Double, Integer> entry : elementCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}