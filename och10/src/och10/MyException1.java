package och10;

public class MyException1 extends Exception {
	@Override
	public String getMessage() {
		String ErrMsg;
		ErrMsg = "100만원은 너무 적습니다.";
		return ErrMsg;
	}
}
