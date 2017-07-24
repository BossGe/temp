package java8ppt.defaultmethod.demo1;

public class ClassE implements A, B{

	@Override
	public void sayHello() {
		System.out.println("I am E");
	}
	
	public static void main(String[] args) {
		ClassE e = new ClassE();
		e.sayHello();
	}

}
