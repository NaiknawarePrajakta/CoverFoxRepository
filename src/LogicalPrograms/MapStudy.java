package LogicalPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapStudy {

	public static <K> void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
       System.out.println(hm);
       // put-->add element in hashmap
       
       hm.put("MH12", "Pune");
       hm.put("MH13", "Solapur");
       hm.put("MH14", "PCMC");
       
       System.out.println(hm);
       hm.put("MH12", "Mumbai");
       System.out.println(hm);
       hm.put("MH01", "Mumbai");
       System.out.println(hm);
       System.out.println("=================================");
       
       //get() in hashmap
       System.out.println(hm.get("MH13"));
       
       System.out.println("========================");
       
       //containsKey() in hash map
       System.out.println(hm.containsKey("MH01"));
       System.out.println(hm.containsKey("MH50"));
       
       //containsValue() in hash map
       
       System.out.println(hm.containsValue("Mumbai"));
       System.out.println(hm.containsValue("Nagpur"));
       System.out.println("==================================");
       
       //entrySet()  in hash map
       
       Set<Entry<String, String>> mySet = hm.entrySet();
       
       for(Entry<String, String> m:mySet)
       {
    	   //System.out.println(m);
    	   //System.out.println(m.getKey());
    	  // System.out.println(m.getValue());
    	   System.err.println(m.getKey()+" "+m.getValue());
       }
	}

}
