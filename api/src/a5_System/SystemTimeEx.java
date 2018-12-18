package a5_System;

public class SystemTimeEx {
	/* 3
	 * currentTimeMillis(), nanoTime()
	 * 현재 시각(실행 소요 시간)
	 * 
	 * System.currentTimeMillis(); -ms(1/1000초)
	 * x)1970년 1월 1일부터 현재까지의 시간
	 * 
	 * System.nanoTime(); -ns(1/1000000000초)
	 * x)경과된 시간 측정 시 사용
	 * 
	 */
	public static void main(String[] args) {
		int sum = 0;
		long startMillis; // 실행 시작 시간
		long endMillis; // 실행 종료 시간
		
		long startNano; // 실행 시작 시간
		long endNano; // 실행 종료 시간
		
		startMillis = System.currentTimeMillis();
		startNano = System.nanoTime();
		
		// 9억 !!
		for (int i=0; i<900000000; i++) {
			sum += 1;
		}
		
		endMillis = System.currentTimeMillis();
		endNano = System.nanoTime();
		
		System.out.println("실행시간(ms):" + (endMillis-startMillis));
		System.out.println("실행시간(ns):" + (endNano-startNano));
	}

}
