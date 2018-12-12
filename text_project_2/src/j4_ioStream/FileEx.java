package j4_ioStream;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileEx {

	public static void main(String[] args) throws URISyntaxException, IOException {
		File dir = new File("c:/test/Dir");
		File file1 = new File("c:/test/file1.txt");
		File file2 = new File("c:/test/file2.txt");
		File file3 = new File(new URI("file:///c:/test/file3.txt"));
		
		if (dir.exists() == false) { dir.mkdirs(); }
		if (file1.exists() == false) { file1.createNewFile(); }
		if (file2.exists() == false) { file2.createNewFile(); }
		if (file3.exists() == false) { file3.createNewFile(); }
		
		File tmp = new File("c:/test");
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd a HH:mm");
		File[] contents = tmp.listFiles();
		
		System.out.println("날짜             시간                 형태                크기           이름");
		System.out.println("--------------------");
		
		for (File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified()))); // 날짜, 시간
			if (file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName()); // 형태
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName()); // 크기, 이름
			}
			System.out.println();
		}
		
	}

}
