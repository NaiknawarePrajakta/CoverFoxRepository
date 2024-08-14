package array;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		
		int numbers[]=new int[5];
		
		numbers[0]=4;
		numbers[1]=1;
		numbers[2]=5;
		numbers[3]=3;
		numbers[4]=2;
		
		System.out.println("=============printing array using for loop===========");
		
		for(int i=0;i<=numbers.length-1;i++)
		{
			System.out.println(numbers[i]);
		}
		
		System.out.println("========printing array in ascending order===========");
		
		Arrays.sort(numbers);//to sort our Array
		
		for(int i=0;i<=numbers.length-1;i++)
		{
			System.out.println(numbers[i]);
		}
		
		System.out.println("=============printing array in descending order=========");
		
		for(int i=numbers.length-1;i>=0;i--)
		{
			System.out.println(numbers[i]);
		}
		
		
	}

}
