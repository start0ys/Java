package och04;

public class Score {

	public static void main(String[] args) {
//		이름 국어 영어 수학 총점 평균
//		==============================================
//		안예은 90 80 70
//		김소현 76 86 90
//		정선아 90 78 90
//		김준수 80 80 80
//		==============================================
//		합계
		int sum = 0; int[]tot = new int[3];
		String[] tit  = { "이 름","국어","영어","수학","총점","평균"};
		String[] name = { "안예은","김소현","정선아","김준수"};
		int[][] score = { {90,80,70}, {76,86,90}, {90,78,90}, {80,80,80} };
		
		System.out.println("\t\t성적표\n");
		for (String t : tit) {
			System.out.print(t+"\t");
		}
		System.out.println();
		System.out.println("===========================================");
		for(int i =0;i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
				sum += score[i][j];
				tot[j] += score[i][j];
			}
			System.out.println(sum+"\t"+sum/score[i].length);
			sum=0;
		}
		System.out.println("===========================================");
		System.out.print("합 계 \t");
		for ( int i=0;i<tot.length;i++) {
			System.out.print(tot[i]+"\t");
			sum += tot[i];
		}
		System.out.println(sum + "\t"+sum/tot.length);
		System.out.print("평 균 "+ "\t");
		for(int i = 0; i<tot.length;i++) {
			System.out.print(tot[i]/name.length+"\t");
		}
		System.out.println(sum/name.length+"\t"+sum/tot.length/name.length);
	}

}
