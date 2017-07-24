package java8ppt.optional.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindCat {
	public static void main(String[] args) {
		List<Cat> list = create();
		
		//1
		//list.stream().forEach(a->System.out.println(a.getNickName().orElse("Unknow")));
		
		//2
		//list.stream().forEach(a->a.getNickName().ifPresent(b->System.out.println("Hi, my name is "+b)));
	}
	
	static void print(List<Cat> list){
		list.stream().forEach(System.out::println);
	}
	
	static List<Cat> create(){
		List<Cat> result = new ArrayList<>();
		result.add(new Cat(Optional.empty(), 10));
		//result.add(new Cat(null, 8));
		result.add(new Cat(Optional.of("snow"), 6));
		result.add(new Cat(Optional.of("cookie"), 4));
		result.add(new Cat(Optional.of("sunny"), 3));
		result.add(new Cat(Optional.ofNullable(null), 1));
		return result;
	}
	
}



