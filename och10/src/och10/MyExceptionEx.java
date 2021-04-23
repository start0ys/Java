package och10;

public class MyExceptionEx {

	public static void main(String[] args) {
		int kkk =15;
		try {
			if(kkk>10) throw new MyException();
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

	}

}
