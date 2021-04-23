package exam04;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t+"8");
		consumer.accept("1.java");
		
		BiConsumer<String, String> bigConSumer = (t,u) -> System.out.println(t+u);
		bigConSumer.accept("2.Java", "8");
		
		DoubleConsumer doubleConsumer = d -> System.out.println("3.Java"+d);
		doubleConsumer.accept(8.0);
		
		ObjIntConsumer<String> objIntConsumer = (t,i) -> System.out.println(t+i);
		objIntConsumer.accept("4.Java", 8);

	}

}
