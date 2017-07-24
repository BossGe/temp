package java8ppt.optional.demo1;

import java.util.Optional;

public class Cat {
	private Optional<String> nickName;
	private int age;
	
	
	public Cat(Optional<String> nickName, int age) {
		super();
		this.nickName = nickName;
		this.age = age;
	}


	public Optional<String> getNickName() {
		return nickName;
	}

	public int getAge() {
		return age;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
		return result;
	}

	
	@Override
	public String toString() {
		return "Cat [nickName=" + nickName + ", age=" + age + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (age != other.age)
			return false;
		if (nickName == null) {
			if (other.nickName != null)
				return false;
		} else if (!nickName.equals(other.nickName))
			return false;
		return true;
	}

	
	
	
}
