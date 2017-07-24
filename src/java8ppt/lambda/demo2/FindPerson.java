package java8ppt.lambda.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import java8ppt.lambda.demo1.Person;
import java8ppt.lambda.demo1.PersonHelper;

public class FindPerson {
	
	public static void main(String[] args) {
		List<Person> list = PersonHelper.create();
		
		//version 1
		/*PersonHelper.print(findYoung(list));
		PersonHelper.print(findLongName(list));*/
		
		//version 2
		
		PersonHelper.print(find(list, p -> p.getAge()< 10 ));
		PersonHelper.print(find(list, p -> p.getName().length() > 3));
		
	}
	
	static List<Person> findYoung(List<Person> list){
		List<Person> result = new ArrayList<>();
		for (Person person : list) {
			if (person.getAge() < 10) {
				result.add(person);
			}
		}
		return result;
	}
	
	static List<Person> findLongName(List<Person> list){
		List<Person> result = new ArrayList<>();
		for (Person person : list) {
			if (person.getName().length() > 3) {
				result.add(person);
			}
		}
		return result;
	}
	
	
	static List<Person> find(List<Person> list, Predicate<Person> predicate){
		List<Person> result = new ArrayList<>();
		for (Person person : list) {
			if (predicate.test(person)) {
				result.add(person);
			}
		}
		return result;
	} 
	
	
	
	
	
	
	
}
