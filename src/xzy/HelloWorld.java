package xzy;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class HelloWorld {
	public static void main(String[] args){
		double num = 10;
		Random random = new Random(new Date().getTime());
		System.out.println("random: " + random);
		
		Random random2 = new Random(20);
		int i = random2.nextInt(100);
		int j = random2.nextInt(100);
		int z = random2.nextInt(100);
		System.out.println("random2:   " + "i: " + i + " j: " + j + " z: " + z);
		
		Random random3 = new Random(20);
		int i2 = random3.nextInt(100);
		int j2 = random3.nextInt(100);
		int z2 = random3.nextInt(100);
		System.out.println("random3:   " + "i: " + i2 + " j: " + j2 + " z: " + z2);
		
		System.out.println(Math.round(-2.5));
		
		double[] ds = {1,2};

		double[] ds2 = new double[ds.length + 2];
//		ds2= ds;
		System.arraycopy(ds, 0, ds2, 0, ds.length);
		System.out.println("length: " + ds2.length);
		for(int i1 = 0; i1 <ds2.length; i1++ ){
			System.out.print(ds2[i1] + " ");
		}
		System.out.println();
		
		DecimalFormat decimalFormat = new DecimalFormat("#.0000");
		System.out.println(Double.valueOf(decimalFormat.format(0)));
		
		
		
		String string = "﻿\"1180\",\"270\",\"66\",\"bracelets for women\",\"385\"";
		System.out.println(string);
		System.out.println(string.length());
		System.out.println(string.substring(string.indexOf("\"") + 1, string.length()-1));
		System.out.println(string.substring(1, string.length()-1));
		System.out.println("-------------------");
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1234);   list.add(12345);
		System.out.println(list.contains(1234) + "   " + list.contains(123));
		
	}

}
