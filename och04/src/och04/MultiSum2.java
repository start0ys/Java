package och04;

public class MultiSum2 {

	public static void main(String[] args) {
		int sum = 0 ;
		int [][] score = { {78,87,56}, {98,89,67}, {70,80,90} };
		String[] title = {"국어","영어","수학","합계","평균"};
		String line = "======================================";
		
		for(String str : title) {
			System.out.print(str+"\t");
		}
		System.out.println("\n"+line);
		for (int []sc :score) {
			for(int s : sc) {
				System.out.print(s+"\t");
				sum += s;
			}
			System.out.println(sum+"\t"+sum/sc.length);
			sum=0;
		}
	}

}
