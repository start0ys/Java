package och04;

public class MultiArr02 {

	public static void main(String[] args) {
		int[][] a = { {12,45,23}, {16,4,879}, {45,87,12} };
		
		for (int i =0; i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("=====확장=======");
		for (int []k : a) {
			for (int kk : k) {
				System.out.print(kk+"\t");
			}
			System.out.println();
		}

	}

}
