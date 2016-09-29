package xzy;
import java.util.Random;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		int i;
		int length=arr.length;
		
		Random ran=new Random();
		int num1=ran.nextInt(50);
		int num2=ran.nextInt(50);
		for(i=0;i<length;i++){
			if(i==4){
				arr[4]=num1;
				continue;
			}
			if(i==5){
				arr[5]=num2;
				continue;
			}
			arr[i]=ran.nextInt(50);
		}
		
		System.out.println("the array is: ");
		for(i=0;i<length;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		
	
		for(i=0;i<length;i++){
			if(arr[i]==num1)
				break;
		}
		if(i==length)
			System.out.println("not find the number "+num1);
		else
			System.out.println("the number "+num1+" location is "+i);
		
		
		for(i=0;i<length;i++){
			if(arr[i]==num2)
				break;
		}
		if(i==length)
			System.out.println("not find the number "+num1);
		else{
			for(int j=i+1;j<length;j++){
				arr[j-1]=arr[j];
			}
			length--;
		}
		
		System.out.println("the array is: ");
		for(i=0;i<length;i++){
			System.out.print(arr[i]+"  ");
		}

		

	}
	
	

}
