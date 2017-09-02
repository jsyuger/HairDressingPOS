package org.jsyuger.web.util.strategy;
public class PercentDiscountStrategy implements Strategy {
	@Override
	public int[] sort(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {// ����
			for (int j = 0; j < array.length - i - 1; j++) {// �Ƚϴ���
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
}
