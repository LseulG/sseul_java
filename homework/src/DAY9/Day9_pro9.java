package DAY9;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Day9_pro9 {

	public static void main(String[] args) {
		Date now = new Date();
		
		//�ڵ� 2024�� 05�� 08�� ȭ���� 10�� 30��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm��");
		System.out.println(sdf.format(now));
	}

}
