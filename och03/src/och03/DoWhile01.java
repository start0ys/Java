package och03;

public class DoWhile01 {

	public static void main(String[] args) {
		int sum = 0 ,i=1;
		do {
			sum+=i;
			
			System.out.printf("i(증가) -> %d sum(합계)->%d \n ",i,sum);
			i++;
		}while(i<=10);
		System.out.println("합계 : "+sum);

	}

}
