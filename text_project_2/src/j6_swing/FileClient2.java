package j6_swing;

import java.io.*;
import java.net.*;
import java.net.Socket;

public class FileClient2 {

	public static void main(String[] args) {
		Socket socket = null;

		byte[] sendBytes = new byte[1024];
		byte[] receiveBytes = new byte[1024];
		String sendMessage = null;
		String receiveMessage = null;
		int readByteCount = 0;
		InputStream is;
		OutputStream os;
		
		String FilePath = "c:/test/server message.txt";
		File File = new File(FilePath);
		String text = null;

		try {
			socket = new Socket();
			System.out.println("연결 요청");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("연결 성공");
			is = socket.getInputStream();
			os = socket.getOutputStream();

			while (true) {
				// receive message
				if (is.available() != 0) {
					readByteCount = is.read(receiveBytes);
					receiveMessage = new String(receiveBytes, 0, readByteCount, "UTF-8");
					
					text = text + receiveMessage + "\r\n";
					
					try (FileOutputStream fos = new FileOutputStream(File)){
						fos.write(text.getBytes(), 0, text.getBytes().length);
						fos.write(receiveBytes, 0 , readByteCount);
					}

					System.out.println("Server Message: " + receiveMessage);					
				}

				// send message
				if (System.in.available() != 0) {

					int length = System.in.read(sendBytes);
					
					if (length != -1 && length != 0) {
						sendMessage = new String(sendBytes, 0, length);						
						os.write(sendMessage.getBytes("UTF-8"));												
						os.flush();
						System.out.println("message 전송");
					}
				}
			}
		} catch (Exception e1) {
		}

		if (!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

}