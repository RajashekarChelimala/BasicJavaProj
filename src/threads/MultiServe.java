package threads;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServe implements Runnable{
	
	static ServerSocket ss;
	static Socket s;
	
	public void run() {
		
		String name=Thread.currentThread().getName();
		for(;;) {
			System.out.println("Thread "+name+" Ready to accept....");
			try {
				s=ss.accept();
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Thread "+name+" accepted connection");
			
			PrintStream ps=null;
			
			try {
				ps=new PrintStream(s.getOutputStream());
			}catch(Exception e) {
				e.printStackTrace();
			}
			ps.println("Thread "+name+" contacted you");
			ps.close();
			
			try {
				s.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		MultiServe multiServe=new MultiServe();
		
		ss=new ServerSocket(999);
			
		Thread t1=new Thread(multiServe,"One");
		Thread t2=new Thread(multiServe,"Two");

		t1.start();
		t2.start();
	}

}
