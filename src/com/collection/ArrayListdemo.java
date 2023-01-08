package com.collection;

import java.util.ArrayList;

public class ArrayListdemo {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Akshay");
		arrayList.add("Manisha");
		arrayList.add("Rohan");
		arrayList.add("Nikhil");
		
		//System.out.println(arrayList);
		
		for(String str: arrayList)
		{
			System.out.println(str);
		}
	}
	
}
