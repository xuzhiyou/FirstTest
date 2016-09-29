package xzy;

/**
 * 泛型练习.
 * @author xuzhiyou
 *
 * @param <T>  T代表泛型，类型参数声明，在具体应用时，可传入不同的类型参数.
 */
public class GenericsTest< T > {
	
	private T t;
	public void setT(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}
	
	public static void main(String[] args) {

		GenericsTest<Integer> gTest1 = new GenericsTest<Integer>();
		GenericsTest<String> gTest2 = new GenericsTest<String>();
		
		gTest1.setT(new Integer(2));
//		gTest1.setT(2);
		gTest2.setT("test");
		
		System.out.println("GenericsTest<Integer>: " + gTest1.getT());
		System.out.println("GenericsTest<String>: " + gTest2.getT());
		
		System.out.println(gTest1.getN(5));

		
	}
	
	/**
	 * 下面为泛型方法，在普通类中是可以正常使用.
	 * <T> 为类型参数声明，需要写在方法返回值类型前，可理解为该方法所用参数类型为T.
	 * 因此此时在泛型类中，所以此处提示<T>多余，但在正常类中必须这样写.
	 * @param t
	 * @author xuzhiyou
	 * @data 2016年9月25日 下午5:51:53
	 */
	public <T> void name( T t) {
		System.out.println(t);
	}
	public <T>  T getN( T t) {
		return t;
	}

}
