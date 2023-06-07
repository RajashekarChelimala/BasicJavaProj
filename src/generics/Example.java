package generics;

public class Example {

	public static void main(String[] args) {
//		Box box = new Box("water");
//		
//		box.container=123;
//		box.container="This is a string";
//		System.out.println(box.getValue());
//		This is not TypeSafe
		
		//SO USE THIS GENERICS
		Box<String> box = new Box<>("This is amazing");
		System.out.println(box.getValue());
		System.out.println(box.container.getClass().getName());
		
		Box<Integer> box1 = new Box<>(69);
		System.out.println(box1.getValue());
		System.out.println(box1.container.getClass().getName());
		
		Box<Boolean> box2 = new Box<>(true);
		System.out.println(box2.getValue());
		System.out.println(box2.container.getClass().getName());
		
		box.performSomeTask();
		box1.performSomeTask();
		
		
		
	}

}
