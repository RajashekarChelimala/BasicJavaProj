package threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MultiClient {
	

	public static void main(String[] args) throws IOException {
		
		Socket socket=new Socket("localhost",999);
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		String s;
		while((s=br.readLine())!= null) {
			System.out.println(s);
		}
		
		br.close();
		socket.close();
	}

}
