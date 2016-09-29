package xzy;

public class ExtendsTest{

	private String name;
	private int number;
	
	public HighArray highArray;
	
	public ExtendsTest() {}
	
	public ExtendsTest(String name, int number){
		this.name = name;
		this.number = number;
		this.highArray = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public HighArray getHighArray() {
		return highArray;
	}

	public void setHighArray(HighArray highArray) {
		this.highArray = highArray;
	}
	
}
