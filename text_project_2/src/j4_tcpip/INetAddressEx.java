package j4_tcpip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class INetAddressEx {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			//System.out.println(local.getHostAddress());
			
			InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
			for (InetAddress inet : naver) {
				System.out.println(inet.getHostAddress());
			}
			
			InetAddress[] daum = InetAddress.getAllByName("www.daum.net");
			for (InetAddress inet : daum) {
				System.out.println(inet.getHostAddress());
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
