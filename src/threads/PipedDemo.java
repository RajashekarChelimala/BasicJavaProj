package threads;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class WriterThread extends Thread{
	PipedOutputStream dest;
	
	public WriterThread(PipedOutputStream dest) {
		this.dest=dest;
	}
	
	public void run() {
		byte[] data="I like Java".getBytes();
		try {
			for(int i=0;i<data.length;i++) {
				dest.write(data[i]);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				dest.flush();
				dest.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class ReaderThread extends Thread{
	PipedInputStream source;

	public ReaderThread(PipedInputStream source) {
		super();
		this.source = source;
	}
	
	public void run() {
		try {
			int r=source.read();
			while(r!=-1) {
				System.out.write(r);
				r=source.read();
			}
			System.out.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				source.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class PipedDemo {

	public static void main(String[] args) {
		
		try {
			PipedOutputStream dest=new PipedOutputStream();
			PipedInputStream source=new PipedInputStream();
			
			dest.connect(source);
			
			WriterThread writerThread=new WriterThread(dest);
			ReaderThread readerThread=new ReaderThread(source);
			
			writerThread.start();
			readerThread.start();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
