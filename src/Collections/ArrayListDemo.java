package Collections;

import java.util.ArrayList;

public class ArrayListDemo 
//Heteroginus data allowed
//Insertion order preserved
//Duplicate element allowed
//multiple nulls allowed
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaration 
		ArrayList mylist=new ArrayList();
		//ArrayList <Integer> mylist=new ArrayList<Interger>();
		//ArrayList<String> mylist = new ArrayList<String>();
		
		//adding data elements into array
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		System.out.println(mylist);
		
		//size of arraylist
		mylist.size();
		System.out.println("Size of the arraylist"+ mylist.size());
		
		//remove value from arraylist
		mylist.remove(3);
		
		System.out.println("After removing element"+mylist);
		
		//inserting new element in the middle of the list
		 mylist.add(2,"java");
		 System.out.println("After insertion the element" + mylist);
		 
			System.out.println(mylist.get(3));
			
			//read all the data from arraylist
			for(Object x:mylist)
			{
				System.out.println(x);
			}
			
			mylist.clear();
			System.out.println("After Clearing"+mylist);
	}

}
