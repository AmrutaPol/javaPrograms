package Collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//heterogios data allowed
		//Insertion order- not preserved(index not supported)
		//Duplicate element - not allowed
		//multiple nulls not allowed/only single null is allowed
		
		//Delcaration
		HashSet myset =new HashSet();
		//Set myset=new HashSet (we can write like this also)
		//HashSet <Integer> myset=new HashSet<Integer>();
		
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset);//[null, 100, 10.5, welcome]--->insertion order not preserved
		
		System.out.println(myset.size());
		
		//remove value from hashset
		myset.remove(10.5);//we have to pass the value not the index -->index wont support here in hashset
		System.out.println("After removing "+ myset);
		
		//insertion is not possible in hashset-->always value gets added into end of the hashset
		
		//get specific value from hashset--not possible .due to index wont support in hashSet.
		
		//read the data by using loop
		
		for(Object y:myset)
		{
			System.out.println(y)
			;
		}
		
		
		
		

	}

}
