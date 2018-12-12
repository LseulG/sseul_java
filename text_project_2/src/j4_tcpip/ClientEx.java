package j4_tcpip;

import java.io.*;
import java.net.*;
import java.net.Socket;

public class ClientEx {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress("192.168.18.246",5001));
			
			while(true) {
				OutputStream os = socket.getOutputStream();
				String message = "babooooo";
				
				byte[] bytes = message.getBytes("UTF-8");
				
				os.write(bytes);
				os.flush();
				System.out.println("데이터 전송 완료");
				
				InputStream is = socket.getInputStream();
				bytes = new byte[1024]; // 1kbyte
				int readBytecount = is.read(bytes);
				message = new String(bytes, 0, readBytecount, "UTF-8");
				System.out.println("Input Data : " + message);
				
				os.close();				
			}
			
		} catch (IOException e) {}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {}
		}
	}

}
