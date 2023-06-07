package threads;

public class ThreadMethSync implements Runnable{
	int available=1;
	int wanted;
	
	public ThreadMethSync(int wanted) {
		super();
		this.wanted=wanted;
	}
	
	public synchronized void process() {
		System.out.println("Available berths:"+available);
		
		if(available>=wanted) {
			String name=Thread.currentThread().getName();
			System.out.println(wanted+" berths are reserved by "+name);
			try {
				Thread.sleep(1500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			available=available-wanted;
		}
		else {
			System.out.println("Sorry, no berths");
		}
	}
	
	@Override
	public void run() {
		process();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadMethSync reserve =new ThreadMethSync(1);
		
		Thread t1=new Thread(reserve);
		Thread t2=new Thread(reserve);
		
		t1.setName("First Person");
		t2.setName("Second Person");
		
		t1.start();
		t2.start();

	}

}
