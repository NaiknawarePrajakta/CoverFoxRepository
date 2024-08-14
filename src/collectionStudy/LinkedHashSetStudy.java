package collectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		
		lhs.add(12);
		lhs.add(null);
		lhs.add(null);
		lhs.add(12);
		lhs.add(13);
		lhs.add(14);
		lhs.add(15);
		
		System.out.println(lhs);
		
		System.out.println(lhs.getFirst());
		
		
		//for each , Iterator
		
       System.out.println("==========================for each=============");
		
		for(Object h:lhs)
		{
			System.out.println(h);
			
		}
		
		System.out.println("============iterator===============");
		
	   Iterator<Integer> It = lhs.iterator();
	   
	   while(It.hasNext())
	   {
		   System.out.println(It.next());
	   }
		
		
	}
}
