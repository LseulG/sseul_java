package j4_ioStream;

import java.io.*;

public class StartEx {

	public static void main(String[] args) {
		String filePath1 = "c:/start";
		String filePath2 = "c:/end";
		String fileName = "/start.txt";
		String str = "start";
		
		File dir1 = new File(filePath1);
		File dir2 = new File(filePath2);
		
		File file1 = new File(filePath1 + fileName);
		File file2 = new File(filePath2 + fileName);
		
		byte[] writeBytes = str.getBytes();
		byte[] readBytes = new byte[100];
		
		if(dir1.exists() == false) { dir1.mkdirs(); }
		if(dir2.exists() == false) { dir2.mkdirs(); }
		
		try {
			FileOutputStream fos = new FileOutputStream(file1);
			fos.write(writeBytes, 0, writeBytes.length);
			
			FileInputStream fis = new FileInputStream(file1);
			fis.read(readBytes, 0, writeBytes.length);
			
			FileOutputStream fos2 = new FileOutputStream(file2);
			fos2.write(readBytes, 0, writeBytes.length);
			
			fos.flush();
			fos2.flush();
			
			fos.close();
			fos2.close();
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
