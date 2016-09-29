package xzy;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MainTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		HighArray harr=new HighArray(20);
		harr.insert(77);harr.insert(99);harr.insert(44);harr.insert(55);harr.insert(22);
		harr.insert(88);harr.insert(11);harr.insert(00);harr.insert(66);harr.insert(33);
		harr.show();
		int value=35;
//		if(harr.find(35))
//			System.out.println("found "+value);
//		else
//			System.out.println("not found "+value);
		harr.delete(55);
		harr.delete(00);
		harr.delete(99);
		harr.delete(34);
		harr.show();
		
		
		mapTest();
		
		
	}
	
	
	
	
	
	
	
	
	
	/**
	 * 遍历Map集合的几种方法.
	 * @author xuzhiyou
	 * @data 2016年9月21日 下午6:52:26
	 */
	public static void mapTest(){
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("a", 1.0);map.put("d", 1.0);map.put("b", 2.0);
		map.put("f", 3.0);map.put("ac", 5.0);map.put("ab", 6.0);
		
		for(Map.Entry<String, Double> entry : map.entrySet()){
			System.out.println("key= " + entry.getKey() + "; value= " + entry.getValue());
		}
		System.out.println("---------------------------");
		
		for(String string : map.keySet()){
			System.out.println("key= " + string + "; value= " + map.get(string));
		}
		System.out.println("---------------------------");
		
		for(Double value : map.values()){
			System.out.println("value= " + value);
		}
		System.out.println("---------------------------");
		

		Iterator<Map.Entry<String, Double>> iterator = map.entrySet().iterator();
		
 		while(iterator.hasNext()){
			Entry<String, Double> entry = iterator.next();
			String key = entry.getKey();
			Double double1 = entry.getValue();
			System.out.println("key= " + key + "; value= " + double1);
			if (double1 == 1) {
				iterator.remove();	//直接map.remove(key)删除会出错，利用iterator删除可以。
			}
 		}
		

		System.out.println("---------------------------");

		for(Map.Entry<String, Double> entry : map.entrySet()){
			System.out.println("key= " + entry.getKey() + "; value= " + entry.getValue());
		}
		
	}
	

}
