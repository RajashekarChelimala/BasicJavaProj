package threads;

class MineThread extends Thread{
	
	public MineThread(String name) {
		super(name);
	}
	
	public void run() {
		for(int i=0;i<10000;i++) {
			System.out.println(i+"\t"+this.getName());
		}
	}
}

public class Mythread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MineThread myThread = new MineThread("First Thread");
//		myThread.setName("First Thread");
		myThread.start();
		MineThread myThread1=new MineThread("Second Thread");
		myThread1.start();
	}

}
