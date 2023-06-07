package cgg.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	
	private int rollno;
	private String sname;
	public Student(int rollno, String sname) {
		super();
		this.rollno = rollno;
		this.sname = sname;
	}
	
	@Override
	public String toString() {
		return "Student rollno=" + rollno + ", sname=" + sname;
	}
	
}

public class SerializationEg1{
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream writer=new FileOutputStream("student.dat");
			ObjectOutputStream oos=new ObjectOutputStream(writer);
			
			Student s1=new Student(12,"ABC");
			System.out.println("Student Object S1= "+s1);
			
			oos.writeObject(s1);
			oos.flush();
			oos.close();
			
			Student s2;
			
			FileInputStream reader=new FileInputStream("student.dat");
			ObjectInputStream ois=new ObjectInputStream(reader);
			
			s2=(Student)ois.readObject();
			
			System.out.println("Student Object S2= "+s2);
			ois.close();
			
		}
		
		catch(Exception e) {
			
		}

}
}