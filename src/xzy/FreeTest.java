package xzy;

import java.util.ArrayList;
import java.util.List;

import doctest.Test;
import doctest.TestInterface;

public class FreeTest {

	public static void main(String[] args) {

		// int a=3, b=5;
		// a=a^b;
		// b=a^b;
		// a=a^b;
		// System.out.println("a="+a+" b="+b);
		// int c;
		// c=b<<2;
		// System.out.println("b<<2="+c);
		// System.out.println(4/2*3);

		List<String> list = new ArrayList<String>();
		list.add("x");
		list.add("z");
		list.add("y");
		System.out.println(list.get(list.size() - 1));

		List<String> largelList = new ArrayList<String>();
		largelList.add("a");
		largelList.addAll(list);

		for (int i = 0; i < largelList.size(); i++)
			System.out.print(largelList.get(i) + " ");
		System.out.println();

		ExtendsTest extendsTest = new ExtendsTest();
		HighArray highArray = extendsTest.getHighArray();
		if (highArray != null) {
			System.out.println("HighArray-nums: " + highArray.getNums());
		}

		
		
		Student student = new Student();
		System.out.println(student instanceof Person);
		Test test = new Test(123, "xzy");
		System.out.println(test instanceof TestInterface);
		
		
		
		
		
		
	}
	
}
