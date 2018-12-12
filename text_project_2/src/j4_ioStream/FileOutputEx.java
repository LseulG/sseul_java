package j4_ioStream;


import java.io.*;

public class FileOutputEx {

	public static void main(String[] args) {
		String filePath = "c:/test";
		String fileName = "/a.txt";
		
		File file = new File(filePath + fileName);
		byte[] writeBytes = new byte[100];
		byte[] readBytes = new byte[100];
		writeBytes[0] = 65;
		writeBytes[1] = 66;
		writeBytes[2] = 67;
		writeBytes[3] = 68; // A B C D
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(writeBytes, 0, 4);
			
			FileInputStream fis = new FileInputStream(file);
			fis.read(readBytes, 0, 4);
			
			for (int i=0; i<4; i++) {
				System.out.println(readBytes[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
