package och03;

public class Sw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = args[0];
		int a1 = Integer.parseInt(args[1]);
		int b1 = Integer.parseInt(args[2]);
		
		switch(str) {
			case "+" : System.out.println("덧셈 " + (a1 + b1 )); break;
			case "-" : System.out.println("뺄셈 " + (a1 - b1 )); break;
			case "X" : System.out.println("곱셈 " + (a1 * b1 )); break;
			case "/" : System.out.println("나눗셈 " + (a1 / b1 )); break;
			case "%" : System.out.println("나머지셈 " + (a1 % b1 )); break;
			default  : System.out.println("없는연산자 " + (a1 + b1 )); 
		}

	}

}
