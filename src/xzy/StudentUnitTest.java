package xzy;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;

public class StudentUnitTest {
	Student student;
	Person person;
	@Test
	public void test(){
		person = EasyMock.createMock(Person.class);
		EasyMock.expect(person.getName(EasyMock.anyString())).andReturn("XiaoMing"); 
		EasyMock.expect(person.getAge(2)).andReturn(1).times(2);
		person.display();
		
		EasyMock.replay(person);
		
		student = new Student();
		student.setPerson(person);

		Assert.assertEquals("XiaoMing", student.name(" "));
		Assert.assertEquals(1, student.age(2));
		Assert.assertEquals(1, student.age(2));
		student.show();
		
		EasyMock.verify(person);
	}
}
