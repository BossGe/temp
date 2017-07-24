package java8ppt.lambda.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PersonHelper {
	public static void  print(List<Person> list){
		for (Person person : list) {
			System.out.println(person);
		}
	}
	
	public static List<Person> create(){
		List<Person> result = new ArrayList<>();
		result.add(new Person("Bob", 5));
		result.add(new Person("Tom", 20));
		result.add(new Person("Jack", 10));
		result.add(new Person("Frank", 25));
		return result;
		
	}
	
	
	public static List<Person> find(List<Person> list, Predicate<Person> predicate){
		List<Person> result = new ArrayList<>();
		for (Person person : list) {
			if (predicate.test(person)) {
				result.add(person);
			}
		}
		return result;
	} 
}
