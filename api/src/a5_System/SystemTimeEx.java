package a5_System;

public class SystemTimeEx {
	/* 3
	 * currentTimeMillis(), nanoTime()
	 * ���� �ð�(���� �ҿ� �ð�)
	 * 
	 * System.currentTimeMillis(); -ms(1/1000��)
	 * x)1970�� 1�� 1�Ϻ��� ��������� �ð�
	 * 
	 * System.nanoTime(); -ns(1/1000000000��)
	 * x)����� �ð� ���� �� ���
	 * 
	 */
	public static void main(String[] args) {
		int sum = 0;
		long startMillis; // ���� ���� �ð�
		long endMillis; // ���� ���� �ð�
		
		long startNano; // ���� ���� �ð�
		long endNano; // ���� ���� �ð�
		
		startMillis = System.currentTimeMillis();
		startNano = System.nanoTime();
		
		// 9�� !!
		for (int i=0; i<900000000; i++) {
			sum += 1;
		}
		
		endMillis = System.currentTimeMillis();
		endNano = System.nanoTime();
		
		System.out.println("����ð�(ms):" + (endMillis-startMillis));
		System.out.println("����ð�(ns):" + (endNano-startNano));
	}

}
