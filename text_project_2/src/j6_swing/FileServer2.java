package j6_swing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer2 {

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

		String FilePath = "c:/test/client message.txt";
		File File = new File(FilePath);
		String text = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));// IP Port
			System.out.println("연결대기");
			socket = serverSocket.accept();
			System.out.println("연결수락");
			checkIP(socket);

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
					
					System.out.println("Client Message: " + receiveMessage);
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
			// is.close();
			// os.close();
			// socket.close();
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

	private static void checkIP(Socket socket) {
		InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
		System.out.println(isa.getHostName());
		System.out.println(isa.getPort());
		System.out.println(isa.toString());
	}
}