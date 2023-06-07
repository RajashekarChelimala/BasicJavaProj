package threads;

public class StartAliveEnd extends Thread{
	
	public StartAliveEnd(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("Thread name"+ getName());
	}
		
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StartAliveEnd thread=new StartAliveEnd("First Thread");
		thread.start();
		
		StartAliveEnd thread1=new StartAliveEnd("Second Thread");
		thread1.start();
		
		boolean alive=thread.isAlive();
		System.out.println("First Thread is alive "+alive);
		
		alive=thread1.isAlive();
		System.out.println("Second Thread is alive "+alive);
		
		thread.join();
		thread1.join();
		
		System.out.println("Main Ends");

	}

}
