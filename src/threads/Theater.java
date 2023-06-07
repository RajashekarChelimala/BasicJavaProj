package threads;

public class Theater implements Runnable{
	
	String str;
	
	public Theater(String str) {
		super();
		this.str=str;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(str+" "+i);
			
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theater obj1=new Theater("Cut the ticket");
		Theater obj2=new Theater("Show the Seat");
		
		Thread t1= new Thread(obj1);
		Thread t2= new Thread(obj2);
		
		t1.start();
		t2.start();
	}

}
