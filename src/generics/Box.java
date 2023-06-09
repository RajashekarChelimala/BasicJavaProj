package generics;

public class Box<T> {

	T container;
	
	public Box(T container) {
		this.container = container;
	}
	
	public T getValue() {
		return this.container;
	}
	
	public void performSomeTask() {
		if(container instanceof String) {
			System.out.println("Length of "+container +" is "+((String) this.container).length());
		}
		else if(container instanceof Integer) {
			System.out.println("This is Integer value "+container);
		}
	}
}
