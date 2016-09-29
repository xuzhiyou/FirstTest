package doctest;

import java.io.FileNotFoundException;

/**
 * this is a interface
 * @author xuzhiyou
 * @see Test
 */
public interface TestInterface {
	
	/**
	 * a double number-douIn
	 */
	public double douIn = 10;
	
	/**
	 * first interface method-TestInterface
	 * @param string the input is a string
	 * @return interface javadoc test
	 */
	public String doctest_In_1(String string);
	
	/**
	 * interface_2-TestInterface 
	 * @param line the input is a line
	 */
	public void doctest_In_2(String line);
	
	/**
	 * comment-TestInterface
	 * @param line input-TestInterface
	 * @return nothing-TestInterface
	 * @throws FileNotFoundException exception-TestInterface
	 */
	public String getString(String line) throws FileNotFoundException;
	
	

}
