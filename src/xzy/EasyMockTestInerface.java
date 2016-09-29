package xzy;

import java.io.FileNotFoundException;
import doctest.Test;

/**
 * this is a EasyMock interface
 * @author xuzhiyou
 * @see Test
 * 
 */
public interface EasyMockTestInerface {
	
		/**
		 * a double number-douIn
		 */
		public double douIn = 10;
		
		/**
		 * method-EasyMockTestInerface
		 * @param string the input is a string
		 * @return interface javadoc test
		 */
		public String doctest_In_1(String string);
		
		/**
		 * interface_2-EasyMockTestInerface 
		 * @param line the input is a line
		 */
		public void doctest_In_2(String line);
		
		/**
		 * comment-EasyMockTestInerface
		 * @param line input-TestInterface
		 * @return nothing-TestInterface
		 * @throws FileNotFoundException exception-TestInterface
		 */
		public String getString(String line) throws FileNotFoundException;
		
		public int getNum(int num, String string);
		
		public int getNum2(int num);
		
		public double[] getArrays(double[] arrs);
		
		
		public void show();

}
