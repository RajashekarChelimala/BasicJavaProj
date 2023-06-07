package threads;

class Reservation extends Thread{
	
	public Reservation(ThreadGroup tg,String s) {
		super(tg,s);
	}
	
	public void run() {
		System.out.println("Iam Reservation Thread");
	}
}

class Cancellation extends Thread{
	
	public Cancellation(ThreadGroup tg,String s) {
		super(tg,s);
	}
	
	public void run() {
		System.out.println("Iam Cancellation Thread");
	}
}

public class TGroups {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadGroup tg= new ThreadGroup("First Group");
		
		Reservation res=new Reservation(tg,"First Res Thread");
		Reservation res2=new Reservation(tg,"Second Res Thread");
		
		ThreadGroup tg2= new ThreadGroup(tg,"Second Group");//Passing the tg in TG2
		
		Cancellation can=new Cancellation(tg2,"First Can Thread");
		Cancellation can2=new Cancellation(tg2,"Second  Can Thread");
		
		//TG is Parent of TG2
		System.out.println("Parent of TG2: "+ tg2.getParent());
		
		tg2.setMaxPriority(7);
		
		System.out.println("TG1: "+res.getThreadGroup());
		System.out.println("TG2: "+can.getThreadGroup());
		
		
		res.start();
		res2.start();
		can.start();
		can2.start();
		
		System.out.println("No.of Threads active TG1: "+ tg.activeCount());
		System.out.println("No.of Threads active TG2: "+ tg2.activeCount());
		
	}

}
