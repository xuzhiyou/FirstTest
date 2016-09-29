package xzy;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * javadoc: class HighArray
 * Array class test
 * @author xuzhiyou
 *
 */
public class HighArray {

	private long[] arr;
	private int nums;
	
	/**
	 * the number is test for javadoc
	 */
	public int num = 10;     //for javadoc test
	
	public HighArray(int max){
		arr=new long[max];
		nums=0;
	}
	
	public HighArray(){
		arr = null;
		num = 0;
	}
	
	public boolean insert(long newnum){
		if(nums==arr.length)
			return false;
		arr[nums]=newnum;
		nums++;
		return true;
	}
	
	/**
	 * find a number-HighArray
	 * @param value find the number-HighArray
	 */
	public boolean find(long value){
		for(int i = 0; i < nums; i ++){
			if(value == arr[i])
				return true;
		} 
		return false;
	}
	
	
	/**
	 * delete a value:-HighArray
	 * @param value delete-the-value-HighArray
	 * @return true or false-HighArray
	 * @exception IOException exception-HighArray
	 */
	public boolean delete(long value) throws IOException, FileNotFoundException{
		int i;
		for(i=0;i<nums;i++){
			if(arr[i]==value)
				break;
		}
		if(i==nums)
			return false;
		for(int j=i;j<nums-1;j++)
			arr[j]=arr[j+1];
		nums--;
		return true;
	}
	
	public void show(){
		System.out.println("the arrays is: ");
		for(int i=0;i<nums;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	
	//test for javadoc
	
	public static final int VALUE = 100;
	
	/**
	 * the method override object method-HighArray
	 * @return nothing-HighArray
	 */
	public String toString() {
		return "";
	}
	
	
	/**
	 * comments-HighArray
	 * @param line input-HighArray
	 * @throws FileNotFoundException if there no file-HighArray
	 */
	public String getString(String line) throws FileNotFoundException {
		return "";
	}
	
	/**
	 * twoPara2-HighArray
	 * @param string1 first string-HighArray
	 * @param string2 second string-HighArray
	 */
	public void twoPara2(String string1,String string2) {
		
	}
	
	
	/**
	 * twoPara3-HighArray
	 * @param string1 first string-HighArray
	 * @param string2 second string-HighArray
	 */
	public void twoPara3(String string1,String string2) {
		
	}
	
	
	public long[] getArr() {
		return arr;
	}

	public void setArr(long[] arr) {
		this.arr = arr;
	}

	public int getNums() {
		return nums;
	}

	public void setNums(int nums) {
		this.nums = nums;
	}
	
	
	
	
	
	
	private void test() {
		
	}
	
	
	public  String test2( String  string) {
		return string;
	}
	
	
	
	
	
	
}
