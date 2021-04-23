package och04;

public class Arr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] {23,45,67,78,2};
		for(int i =0; i<a.length ; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		System.out.println("-------------확장형--------------");
		//
		for(int k : a) {
			System.out.println("k = "+k);
		}
	}

}
