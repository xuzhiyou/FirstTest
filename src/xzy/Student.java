package xzy;

public class Student {
	Person person;
	
	public String name(String string) {
		return person.getName(string);
	}
	
	public int age(int num){
		return person.getAge(num);
	}
	
	public void show() {
		person.display();
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
