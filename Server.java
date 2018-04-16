package les1.practicum2;
//package Opdracht1.practicum2;

import java.net.*;
import java.util.Scanner;


class Server {
	public static void main(String[] arg) throws Exception {
		ServerSocket ss = new ServerSocket(4711);
		Socket s = ss.accept();
		Scanner scanner = new Scanner(s.getInputStream());String line = scanner.nextLine();
		System.out.println(line);
		s.close();
		ss.close();
	}
}

