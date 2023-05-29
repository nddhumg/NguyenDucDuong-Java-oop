import java.util.ArrayList;

public class MyArrayList{
		private ArrayList<Object> myArrayList = new ArrayList<>();
		public MyArrayList(int arrInt, double arrDouble, boolean arrBool, String arrString) {
			myArrayList.add(arrInt); 
		    myArrayList.add(arrDouble); 
		    myArrayList.add(arrBool); 
		    myArrayList.add(arrString); 
			}
	        
		public void In() {
			 System.out.println("Gia tri trong myArrayList:");
		        for (Object value : myArrayList) {
			            System.out.println(value);
			    }
		}
		public static void main(String[] args) {
			MyArrayList a = new MyArrayList(1, 5.6, true, "MyArrayList");
			a.In();
		}
	}