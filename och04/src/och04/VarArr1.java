package och04;

public class VarArr1 {

	public static void main(String[] args) {
		int[][] a = new int[3][];//new int[][3]; 은 오류 무조건 행값은 있어야함
		a[0] = new int[3];
		a[1] = new int[2];
		a[2] = new int[4];
		
		a[0][0] =7; a[0][1] =23; a[0][2]=13;
		a[1][0] =23; a[1][1] =3;
		a[2][0] =2; a[2][1] =21; a[2][2]=56; a[2][3]=71;
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
