package doctest;

/**
 * the second test class<br>
 * 在编码utf-8下编写的类
 * @author xuzhiyou
 *
 */
public class Test2 {

	public String getBid(TestInterface testInterface, TestConversionInterface testConversionInterface) {
		String string = "";
		return testInterface.doctest_In_1(string) + testConversionInterface.getConvertions();
	}
}
