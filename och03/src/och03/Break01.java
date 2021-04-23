package och03;

public class Break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0,sum=0;
		while (true) {
			num++;
			sum+=num;
			if(num==5) break;
			
		}
		System.out.println("합계 :" +sum);
		System.out.println("끝");

	}

}
