package java8ppt.lambda.demo1;

import java.util.Comparator;
import java.util.List;

public class FindPerson{

	public static void main(String[] args) {
		//sort1();
		sort2();
		hello();
	}
	
	static void sort1(){
		List<Person> list = PersonHelper.create();
		PersonHelper.print(list);
		
		list.sort(new Comparator<Person>() {
			@Override
			public int compare(Person person1, Person person2) {
				return person1.getAge() - person2.getAge();
			}
		});
		
		System.out.println("Sorted by inner class:");
		PersonHelper.print(list);
	}
	
	static void sort2(){
		List<Person> list = PersonHelper.create();
		PersonHelper.print(list);
		
		list.sort((person1, person2)-> person1.getAge()- person2.getAge());
		
		System.out.println("Sorted by Lambda:");
		PersonHelper.print(list);
	}
	
	
	
	
	
	
	
	
	
	static void hello(){
/*		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello World");
			}
		};*/
		Runnable runnable = ()-> System.out.println("Hello world");
		
		runnable.run();
	}
	
	
	

}
