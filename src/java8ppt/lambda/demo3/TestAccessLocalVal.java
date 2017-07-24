package java8ppt.lambda.demo3;

public class TestAccessLocalVal {
	
	static int b = 100;
	
	public static void main(String[] args) {
		int a = 123;
		
		Runnable runnable = ()->{
			
			System.out.println(a); 
			System.out.println(b);
		};
		runnable.run();
		//a = 456;
		b = 110;
	}
}
