package les1.practicum2;

import java.io.PrintWriter;
import java.net.Socket;

public class Main {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("localhost", 4711);
		PrintWriter out = new PrintWriter(s.getOutputStream(), true);
		out.print("tekst");
		out.flush();
		s.close();
	}

}
