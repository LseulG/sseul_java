package j5_jdbc;

import java.io.*;
import java.net.*;

public class FileClient {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;

		byte[] sendBytes = new byte[1024];
		byte[] receiveBytes = new byte[1024];
		String sendMessage = null;
		String receiveMessage = null;
		int readByteCount = 0;
		InputStream is;
		OutputStream os;

		String filePath = "c:/Enrol Data";
		String fileName = "/enrol.txt";
		File dir = new File(filePath);
		File file = new File(filePath + fileName);

		try {
			socket = new Socket();
			System.out.println("연결 요청");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("연결 성공");
			is = socket.getInputStream();
			os = socket.getOutputStream();

			// send message !!
			FileInputStream fis = new FileInputStream(file);
			fis.read(sendBytes);

			os.write(sendBytes);
			os.flush();
			System.out.println("C File Send");

		} catch (Exception e1) {
		}

		if (!socket.isClosed()) {
			try {
				// fis.close();
				socket.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

}