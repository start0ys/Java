package och04;

public class MultiArr01 {

	public static void main(String[] args) {
		int [][] a = new int[2][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 11;
		a[1][1] = 12;
		a[1][2] = 13;
		for (int i=0;i<a.length;i++) {
			for(int j=0;j < a[i].length;j++) {
				System.out.print("일반 For "+a[i][j] + "\t");
			}
			System.out.println();
		}	
		System.out.println("=========확장==============");
		for (int [] k : a) { // a[0],a[1] 행을 의미
			for(int kk : k) { // 각각의 열
				System.out.print("확장 For "+kk + "\t");
			}
			System.out.println();
	
		}
	}
}
