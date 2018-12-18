package Day4;

public class Day4_pro4 {
	//2�����迭�� �����ͺ��� ���ο� ���η� 1�� �� ū �迭�� �����ؼ�
	//�迭�� ��� ���� ������ ��ҿ� �� ���� ���� ������ �����ϰ� ����ϴ� ���α׷�
	/*
	100 100 100 300
	20 20 20 60
	30 30 30 90
	40 40 40 120
	50 50 50 150
	240 240 240 720
	*/
	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		
		int[][] result = new int[score.length+1][score[0].length+1];
		
		System.out.println(result[0].length);
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				result[i][j] = score[i][j];
				result[result.length-1][j] += result[i][j];	
				result[result.length-1][result[i].length-1] += result[i][j];
			}
			result[i][result[i].length-1] = result[i][0] + result[i][1] + result[i][2];
		}
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.printf("%4d",result[i][j]);
			}
			System.out.println();
		}

	}

}
