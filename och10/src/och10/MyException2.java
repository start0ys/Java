package och10;

public class MyException2 extends Exception{

	@Override
	public String getMessage() {
		String ErrMsg;
		ErrMsg = "1000만원은 너무 많습니다.";
		return ErrMsg;
	}

}
