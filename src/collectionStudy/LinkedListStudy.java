package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
		
		LinkedList<Object> ll=new LinkedList<Object>();
		
		ll.add("Hello");
		ll.add(null);
		ll.add(null);
		ll.add("Hello");
		ll.add(12);
		ll.add(true);
		ll.add(12.12);
		ll.add('A');
		
		System.out.println(ll);
		System.out.println(ll.get(5));
		
		System.out.println(ll.element());
		System.out.println(ll);
		
		System.out.println(ll.peek());
		System.out.println(ll);
		
		System.out.println(ll.poll());
		System.out.println(ll);
		
		System.out.println(ll.pop());
		System.out.println(ll);
		
		ll.push("Velocity");
		
		System.out.println(ll);
		
		ll.addFirst("Pune");
		ll.addLast("MH");
		System.out.println(ll);
		
		System.out.println(ll.size());
		
		System.out.println(ll.contains(12));
		
		Object l1=ll.clone();
		System.out.println(l1);
		
		System.out.println(ll.contains("Pune123"));
		
		//System.out.println(ll.elementAt(1));//get()
		
		//ll.ensureCapacity(25);
		//System.out.println(ll.capacity());
		
		System.out.println(ll.equals(l1));
		
		System.out.println(ll.get(0));
		
		System.out.println(ll.indexOf(12));
		
		//ll.insertElementAt("Mumbai", 1);
		
		System.out.println(ll);
		
		//v.clear();
		
		System.out.println(ll.isEmpty());
		
		System.out.println(ll.lastIndexOf("Good"));
		
		System.out.println(ll.remove(0));
		
		System.out.println(ll);
	    ll.set(0, "INDIA");
		System.out.println(ll);
		
System.out.println("===============for loop==============");
		
		//for,
		//for each
		//iterator
		//list iterator
		//enumeration
		
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));//0,1,2,3,...12
		}
		
		
		System.out.println("==============for each================");
		
		for(Object a:ll)
		{
			System.out.println(a);
		}
		
		System.out.println("====================Iterator==================");
		
     Iterator<Object> it=ll.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("==============================list-Iterator==========");
		
		ListIterator<Object> lit=ll.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println("====================================");
		
		while(lit.hasPrevious())

		{
			System.out.println(lit.previous());
		}
		
		
		
	}

}
