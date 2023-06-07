package threads;

public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let us find the current thread");
		Thread t= Thread.currentThread();
		System.out.println("Current thread= "+t);
		System.out.println("Its name= "+ t.getName());

	}
}