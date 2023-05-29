import java.util.*;

public class Bai5 {
	private double[] x;
	private double a;
	private Set<Double> setNew = new HashSet<>();
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		this.a = sc.nextDouble();
		System.out.print("Nhap so luong phan tu trong mang: ");
		int sl = sc.nextInt();
		x = new double[sl];
		for(int i=0; i<sl; i++) {
			System.out.print("Nhap pt " +i +" : ");
			x[i] = sc.nextDouble();
		}
	}
	public void AddSet() {
        for (double num : x) {
        	setNew.add(num);
        }
	}
	public boolean Kiemtra() {
        if (setNew.contains(a)) {
        	System.out.println("Mang chua gia tri a!");
            return true;
        } else {
        	System.out.println("Mang ko chua gia tri a!");
        	return false;
        }
	}
	public void InptXuatHien1Lan() {
		Set<Double> setTree = new TreeSet<>(Comparator.reverseOrder());
		setTree.addAll(setNew);
		for(double value : setTree){
			System.out.print(value + ", ");
		}
	}
	public static void main(String[] args) {
		Bai5 a = new Bai5();
		a.Nhap();
		a.AddSet();
		a.Kiemtra();
		a.InptXuatHien1Lan();

		}
}
		

