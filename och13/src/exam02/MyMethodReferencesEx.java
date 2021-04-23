package exam02;

public class MyMethodReferencesEx {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		fi =(x)->{
			int result = x*5;
			System.out.println(result);
		};
		fi.method(3);

	}

}
