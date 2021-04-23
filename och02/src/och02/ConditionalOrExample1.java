package och02;

public class ConditionalOrExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=0;
		if (++num1 > 0 && ++num2>0)
			System.out.println("num1이 0보다 크고 num2가 0보다 큽니다.");
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		
	
		if (++num1 > 0 || ++num2>0) {
			System.out.println("num1이 0보다 크거나 num2가 0보다 큽니다.");
			System.out.println("num1 = "+num1);
			//++num1 >0 가 true라서 뒷 조건은 체크를 하지않아서 num2는 ++되지않고 1 그대로 유지
			System.out.println("num2 = "+num2);
		}

	}

}
