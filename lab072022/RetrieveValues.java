package lab21072022;

/*
 * 2.Retrieve a value associated with a given key from the HashMap .
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("unused")
public class RetrieveValues
{

	public static void main(String[] args) 
	{
		
		@SuppressWarnings("resource")
		java.util.Scanner sc= new java.util.Scanner(System.in);

		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "additya");
		map.put(2, "Rohan");
		map.put(3, "raju");
		map.put(4, "Shubham");
		
		
		System.out.println("Enter the key : ");
		int a = sc.nextInt();
		
		
		System.out.println(map.get(a)); 
		
	}

}