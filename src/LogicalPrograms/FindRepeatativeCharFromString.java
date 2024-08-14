package LogicalPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindRepeatativeCharFromString {

	public static void main(String[] args) {
		String str="xyyzaabxcpqrabcpqrxlmnxy";
		
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		
		for(int i=0;i<=str.length()-1;i++)//0
		{
			char temp = str.charAt(i);//x
			if(hm.containsKey(temp))
			{
				hm.put(temp, hm.get(temp)+1);
			}
			else
			{
				hm.put(temp, 1);
			}
				
				
		}
		//System.out.println(hm);
          Set<Entry<Character, Integer>> hme = hm.entrySet();
          
          for( Entry<Character, Integer> h:hme)
          {
        	  System.out.println(h.getKey()+": "+h.getValue());
          }
          
          System.out.println("Print those who are repeated more than two times");
          
          for(Entry<Character, Integer> h:hme)
          {
        	  if(h.getValue()>2)
        	  {
        		  System.out.println(h.getKey()+": "+h.getValue());
        	  }
          }
	}

}
