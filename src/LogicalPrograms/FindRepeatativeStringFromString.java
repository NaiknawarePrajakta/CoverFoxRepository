package LogicalPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindRepeatativeStringFromString {

	public static void main(String[] args) {
	
		String str="abc xyz abc lmn lmn pqr abc pqr";
		String[] ar = str.split(" ");
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for(int i=0;i<=ar.length-1;i++)
		{
			String temp = ar[i];
			
			if(hm.containsKey(temp))
			{
				hm.put(temp, hm.get(temp)+1);
			}
			else
			{
				hm.put(temp, 1);
			}
		}
		System.out.println(hm);
		
		Set<Entry<String, Integer>> hme = hm.entrySet();
		for(Entry<String, Integer> e:hme)
		{
			System.out.println(e.getKey()+": "+e.getValue());
		}

	}

}
