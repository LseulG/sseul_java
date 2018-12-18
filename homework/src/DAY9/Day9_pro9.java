package DAY9;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Day9_pro9 {

	public static void main(String[] args) {
		Date now = new Date();
		
		//코드 2024년 05월 08일 화요일 10시 30분
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		System.out.println(sdf.format(now));
	}

}
