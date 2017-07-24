package java8ppt.stream.demo1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import java8ppt.lambda.demo1.Person;
import java8ppt.lambda.demo1.PersonHelper;

public class FindPerson {
	public static void main(String[] args) {
		List<Person> list = PersonHelper.create();
		System.out.println("init");
		PersonHelper.print(list);
		
		//List<String> names = findShortNameAndOrderByAge(list);
		List<String> names = findShortNameAndOrderByAgeWithStream(list);
		for (String string : names) {
			System.out.println(string);
		}
		
	}
	static List<String> findShortNameAndOrderByAge(List<Person> list){
		List<Person> temp1 = new ArrayList<>();
		for (Person person : list) {
			if (person.getName().length() < 5) {
				temp1.add(person);
			}
		}
		
		temp1.sort(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		
		List<String> names = new ArrayList<>();
		for (Person person :  temp1) {
			names.add(person.getName());
		}

		return names;
		
	}
	
	
	static List<String> findShortNameAndOrderByAgeWithStream(List<Person> list){
		List<String> names = list.stream().filter(a->a.getName().length()<5)
					 .sorted(Comparator.comparing(Person::getAge))
					 .map(Person::getName)
					 .collect(Collectors.toList());

		return names;
		
	}
	
	
}
