package och02;

public class Operator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 =33;
		int n2 = 10;
		int result;
		
		result = n1+n2;
		System.out.printf("%d %c %d= %d\n", n1,'+',n2,result);
		result = n1-n2;
		System.out.printf("%d %c %d= %d\n", n1,'-',n2,result);
		result = n1*n2;
		System.out.printf("%d %c %d= %d\n", n1,'*',n2,result);
		result = n1/n2;
		System.out.printf("%d %c %d= %d\n", n1,'/',n2,result);
		result = 10 % 3;
		System.out.printf("%d %c %d= %d\n", 10,'%',3,result);
		

	}

}
