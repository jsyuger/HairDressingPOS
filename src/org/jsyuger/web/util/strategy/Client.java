package org.jsyuger.web.util.strategy;
public class Client {
	public static void main(String[] args) {
		int[] array = { 9, 3, 5, 7, 10 };
		Strategy strategy = new AbsoluteDiscountStrategy();
		Context context = new Context(strategy);
		context.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
