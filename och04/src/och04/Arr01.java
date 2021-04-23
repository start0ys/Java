package och04;

public class Arr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a =new int[5];
		a[0] =7;
		a[1] =34;
		a[2] =67;
		a[3] =6;
		a[4] =234;
		int [] b = new int[5];
		b[0] =7;
		b[1] =34;
		b[2] =67;
		b[3] =6;
		b[4] =234;
		
		System.out.println("a.length = "+a.length);
		
		for(int i =0; i<a.length ; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		for(int i =0; i<b.length ; i++) {
			System.out.println("b["+i+"] = "+b[i]);
		}
	

	}

}
