package ArrayList;

import java.util.ArrayList;

public class Sample {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		li.add(5);
		li.add(10);
		li.add(15);
		li.add(20);
		li.add(25);
		// System.out.println(li.get(3));
		System.out.println("Integer list : ");
		for (int i = 0; i < li.size(); i++) {
			if (li.get(i) % 2 == 0) {
				System.out.println("odd number is = " + li.get(i));
			}
		}
		for (Integer a : li) {
			System.out.println(a);
		}
		li.forEach((z) -> System.out.println(z));

		/* this is for String */

		ArrayList<String> st = new ArrayList<>();
		st.add("somu");
		st.add("sundaram");
		st.add("ragul");
		st.add("kowshik");
		st.remove(1);
		System.out.println(st.get(2));
		System.out.println("String list : ");
		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));
		}
		int max = 0;
		String x = null;
		for (int i = 0; i < st.size(); i++) {
			if (st.get(i).length() >= max) {
				max = st.get(i).length();
				x = st.get(i);
			}
		}
		System.out.println("max length string is = " + x);
		st.forEach((y) -> {
			if (y.startsWith("r") == true) {
				System.out.println(y);
			}
		});
	}
}
