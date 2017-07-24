package java8ppt.lambda.demo4;

import java.util.List;
import java.util.function.Predicate;

import java8ppt.lambda.demo1.Person;
import java8ppt.lambda.demo1.PersonHelper;

public class FindPerson {
	public static void main(String[] args) {
		List<Person> list = PersonHelper.create();
		List<Person> find = PersonHelper.find(list, FindPerson::isYoung);
		PersonHelper.print(find);
		
		
		//list.stream().forEach(System.out::println);
		//Predicate<Person> young = p->p.getAge() < 10;
		//Predicate<Person> predicate = young.or(p->p.getAge()> 15);
		//PersonHelper.print(PersonHelper.find(list, predicate));
	}
	
	
	static boolean isYoung(Person person){
		return person.getAge() < 10;
	}
	
	
}
