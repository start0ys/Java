package och11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		String [] pet = {"지렁이","굼뱅이","애벌레","구렁이"};
		Stack<String> st = new Stack<>();
		Queue<String> qu = new LinkedList<>();
		for (String str : pet) {
			System.out.println("push-->"+str);
			st.push(str);
		}
		for (String str : pet) {
			System.out.println("offer-->"+str);
			qu.offer(str);
		}
		System.out.println("------------------");
		while(!st.isEmpty()) {
			System.out.println("pop->"+st.pop());
		}
		System.out.println("------------------");
		while(!qu.isEmpty()) {
			System.out.println("poll->"+qu.poll());
		}
	}

}
