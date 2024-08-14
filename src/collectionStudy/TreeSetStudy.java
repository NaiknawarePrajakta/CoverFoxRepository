package collectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		
		TreeSet<Object> ts=new TreeSet<Object>();
		
		//ts.add(9);
		//ts.add("Pune");//-->ClassCastException
		// ts.add(null);//-->NullPointerException
		
		
		ts.add(13);
		ts.add(4);
		ts.add(11);
		ts.add(7);
		ts.add(5);
		
		System.out.println(ts);
		
		//ts.addFirst(0);
		System.out.println(ts);
		
		System.out.println(ts.ceiling(7));
		
		System.out.println(ts.floor(3));
		
		System.out.println(ts.first());
		
		System.out.println(ts.higher(8));
		System.out.println(ts.lower(7));
		
		System.out.println(ts.size());
		
		System.out.println("=============for each==============");
		
		for(Object t:ts)
		{
			System.out.println(t);
		}
		
		System.out.println("=================iterator=============");
		
		Iterator<Object> it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
