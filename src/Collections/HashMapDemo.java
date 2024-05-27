package Collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaration
		//HashMap hm=new HashMap();
		//Map hm=new HashMap();
		
		HashMap <Integer,String>hm = new HashMap<Integer,String>();
		
		//adding paires value to hashmap
		hm.put(10,"John");
		hm.put(11, "Scott");
		hm.put(12, "John");
		hm.put(13, "Marry");
		hm.put(10, "David");
		
		System.out.println(hm);//{10=John, 11=Scott, 12=John, 13=Marry, 14=David}
		
		hm.size();//4
		
		System.out.println(hm.size());
		
		//remove pair
		hm.remove(11);//11 is key
		
		System.out.println("After removing pair"+ hm);//{10=David, 12=John, 13=Marry}
		
		hm.get(13);
		System.out.println(hm.get(13));//here 13 is key marry
		
		//print only keys from hashmap
		hm.keySet();
		System.out.println(hm.keySet());
		
		//how to read the data from hashmap
		
		//print values from hashmap
		for(Object k:hm.keySet())
		{
			System.out.println(k+"  "+ hm.get(k));
		}
		
		
		
		
	}

}
