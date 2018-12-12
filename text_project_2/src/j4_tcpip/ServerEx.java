package j4_tcpip;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			//serverSocket.bind(new InetSocketAddress("localhost",5001));
			serverSocket.bind(new InetSocketAddress("192.168.18.11",5001));
			
			while(true) {
				System.out.println("server waiting");
				Socket socket = serverSocket.accept();
				
				InputStream is = socket.getInputStream();
				byte[] bytes = new byte[1024]; // 1kbyte
				int readBytecount = is.read(bytes);
				String message = new String(bytes, 0, readBytecount, "UTF-8");
				System.out.println("Input Data : " + message);
				
				OutputStream os = socket.getOutputStream();
				message = "Hello Client";
				bytes = message.getBytes("UTF-8");				
				os.write(bytes);
				os.flush();
				System.out.println("message ¿Ï·á");
				
				is.close();
				socket.close();
				
			}
			
		} catch (IOException e) {}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {}
		}
	}

}
