package exam01;

public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi =()->{
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		fi =()->{
			String str = "method call2";
			System.out.println(str);
		};
		fi.method();
		
		fi =()->{
			String str = "method call3";
			System.out.println(str);
		};
		fi.method();

	}

}
