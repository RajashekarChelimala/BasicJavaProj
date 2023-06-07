package threads;

public class ReserveSync implements Runnable{
	int available=1;
	int wanted;
	
	public ReserveSync(int wanted) {
		super();
		this.wanted=wanted;
	}
	
	@Override
	public void run() {
		synchronized(this) {
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
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReserveSync reserve =new ReserveSync(1);
		
		Thread t1=new Thread(reserve);
		Thread t2=new Thread(reserve);
		
		t1.setName("First Person");
		t2.setName("Second Person");
		
		t1.start();
		t2.start();

	}

}
