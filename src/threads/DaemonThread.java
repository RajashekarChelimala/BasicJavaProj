package threads;

class MyDaemon extends Thread{
	
	public void run() {
		System.out.println("Iam Daemon Thread..");
	}
}

public class DaemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDaemon myDaemon=new MyDaemon();
		
		myDaemon.setDaemon(true);
		System.out.println(myDaemon.isDaemon());
		
		myDaemon.start();
	}

}