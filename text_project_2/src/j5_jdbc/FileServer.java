package j5_jdbc;

import java.io.*;
import java.net.*;

public class FileServer {

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
		String fileName = "/enrol2.txt";
		File dir = new File(filePath);
		File file = new File(filePath + fileName);
		if (dir.exists() == false) {
			dir.mkdirs();
		}

		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));// IP Port
			System.out.println("연결대기");
			socket = serverSocket.accept();
			System.out.println("연결수락");

			is = socket.getInputStream();
			os = socket.getOutputStream();

			// receive message !!
			if (is.available() != 0) {
				readByteCount = is.read(receiveBytes);

				FileOutputStream fos = new FileOutputStream(file);
				fos.write(receiveBytes, 0, readByteCount);

				System.out.println("S File Recevie");
			}

		} catch (Exception e1) {
			e1.printStackTrace();
		}

		if (!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
