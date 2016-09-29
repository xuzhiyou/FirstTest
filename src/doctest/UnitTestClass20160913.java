package doctest;

import java.io.FileNotFoundException;

import xzy.EasyMockTestInerface;

public class UnitTestClass20160913 {
	public  EasyMockTestInerface  easyMockTestInerface;
	
	public String unitTest1(String string) {
		return "1_" + string + easyMockTestInerface.doctest_In_1(string);
	}
	
	public void unitTest2(String lString) {
		easyMockTestInerface.doctest_In_2(lString);
		System.out.println("2_" + lString);
	}
	
	public void unitTest3(String line) throws FileNotFoundException {
		System.out.println("3_" + easyMockTestInerface.getString(line));
	}

	public EasyMockTestInerface getTestInterface() {
		return easyMockTestInerface;
	}

	public void setTestInterface(EasyMockTestInerface easyMockTestInerface) {
		this.easyMockTestInerface = easyMockTestInerface;
	}
	
	
	public int getNums(int num,String string) {
		return easyMockTestInerface.getNum(num,string);
	}
	
	public int getNums2(int num) {
		return easyMockTestInerface.getNum2(num);
	}
	
	
	public double[] getArrays(double[] arrs){
		return easyMockTestInerface.getArrays(arrs);
	}

	
	
}
