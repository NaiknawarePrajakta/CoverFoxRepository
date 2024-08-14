package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;



public class HashSetStudy {

	public static void main(String[] args) {
		
		HashSet<Object> hs=new HashSet<Object>();
		
		hs.add("Pune");
		hs.add(12);
		hs.add(12.11);
		hs.add("Pune");
		hs.add(null);
		hs.add('A');
		hs.add(null);
		hs.add(true);
		
		System.out.println(hs);
		System.out.println(hs);
		System.out.println(hs);
		
		System.out.println(hs.add("Pune"));
		System.out.println(hs.add("Pune1"));
		
		
		//traversing through set
		
		//does not support-->for loop, list Iterator,enumerator
		
		//supports only --> for each, iterator
		
		System.out.println("==========================for each=============");
		
		for(Object h:hs)
		{
			System.out.println(h);
			
		}
		
		System.out.println("============iterator===============");
		
	   Iterator<Object> It = hs.iterator();
	   
	   while(It.hasNext())
	   {
		   System.out.println(It.next());
	   }

	}
}
