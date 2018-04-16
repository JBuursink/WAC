package les1.practicum2;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Server {
	public static void main(String[] arg) throws Exception {
		ServerSocket ss = new ServerSocket(4711);
		Socket s = ss.accept();
		Scanner sc = new Scanner(System.in);
		// InputStream is = s.getInputStream();
		// int c = is.read();
		// while (c != -1) {
		// System.out.print((char) c);
		// c = is.read();
		// }
		System.out.println(sc);
		s.close();
		ss.close();
	}
}
