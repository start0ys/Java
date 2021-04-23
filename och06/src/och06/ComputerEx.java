package och06;

public class ComputerEx {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		int [] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1 : "+result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2 : "+result2);
		
		int result31 = myCom.sum2(1,2);
		System.out.println("result3 : "+result31);
		
		int result32 = myCom.sum2(1,2,3);
		System.out.println("result3 : "+result32);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4 : "+result4);
	}

}
