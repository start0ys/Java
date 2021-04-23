package och09;

public class String2 {

	public static void main(String[] args) {
		char[] c = {'k','o','r','e','a'};
		String str1 = new String(c);  //오버로딩
		String str2 = new String("Fighting");
		String str3 = str1+str2;

		System.out.println(str3);
		System.out.println(2+1+1+5+"년");
		System.out.println("연1:"+2+1+1+5); //문자열이 먼저오면 문자열로 처리
		System.out.println("연2:"+(2+1+1+5));
		
	}

}
