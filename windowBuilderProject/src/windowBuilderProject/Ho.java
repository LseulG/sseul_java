package windowBuilderProject;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Ho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LocalDate currDate = LocalDate.of(2018, 11, 1);
//		int a = currDate.getYear();
//		int b = currDate.getMonthValue();

		
		
		Date currDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		System.out.println(sdf.format(currDate));
		System.out.println(currDate);
		
		String a = sdf.format(currDate);
	}

}
