package Q0409;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	@Override
	public int compareTo(Person arg0) {
		if(getAge() < arg0.getAge())
			return -1;
		else if(getAge() == arg0.getAge())
			return 0;
		else
			return 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}