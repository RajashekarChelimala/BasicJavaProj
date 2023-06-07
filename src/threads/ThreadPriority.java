package threads;

class Myclass extends Thread{
	int count;
	
	public Myclass(String s) {
		super(s);
	}
	
	@Override
	
	public void run() {
		for(int i=1;i<=100000;i++) {
			count++;
		}
		System.out.println("Completed Thread: "+this.getName());
		System.out.println("Its Priority: "+this.getPriority());
	}
	
}

public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass t1=new Myclass("One");
		Myclass t2=new Myclass("Two");
		
		t1.setPriority(3);
		t2.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
	}

}
