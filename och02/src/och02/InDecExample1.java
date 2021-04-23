package och02;

public class InDecExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0, num2 = 0, num3=0, num4=0;
		//num++은 num=num+1
		int result1 = num1++; //++ 연산의 결과는 num1의 기존 값
		int result2 = num2--; //-- 연산의 결과는 num2의 기존 값
		int result3 = ++num3; //++ 연산의 결과는 num3의 새로운 값
		int result4 = --num4; //-- 연산의 결과는 num4의 새로운 값
		int result5;         
		int result6;   
		//num이 아님 result임
		System.out.println("result1 = "+ result1);
		System.out.println("num1 = "+ num1);
		System.out.println("result2 = "+ result2);
		System.out.println("result3 = "+ result3);
		System.out.println("result4 = "+ result4);
		System.out.println("result3 = "+ ++result3);
		result3--;
		System.out.println("result3 = "+ result3);
		System.out.println("result3 = "+ result3++);
		System.out.println("result3 = "+ result3);

	}

}
