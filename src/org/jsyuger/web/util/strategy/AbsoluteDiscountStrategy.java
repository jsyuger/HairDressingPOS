package org.jsyuger.web.util.strategy;
public class AbsoluteDiscountStrategy implements Strategy {
	@Override
	public int[] sort(int[] array) {
		for (int i = 0; i < array.length; i++) { // ��������
			int least = i;// �赱ǰԪ��Ϊ��СԪ��
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[least]) // �����ǰԪ��array[j]С����СԪ��
					least = j;// ��¼��СԪ������
			}
			int temp = array[i];// ������СԪ�����i��Ԫ��
			array[i] = array[least];
			array[least] = temp;
		}
		return array;
	}
}
