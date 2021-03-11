package Exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
 
public class Ex1 {
	
    public static void main(String[] args) {
    	HashMap<String,String> map = new HashMap<String,String>();
        map.put("UK", "London");
        map.put("India", "New Delhi");
        map.put("Russia", "Mascow");
        map.put("US", "Washington");     
        
        Ex1 ex1=new Ex1();
        List values=ex1.getValues(map);
        
        System.out.println(values);
        
 
    }
  
    //Get the values of a map in sorted order 
     List<String> getValues(HashMap<String,String> map) {
    	 Collection<String> collection=map.values();//get values from map
    	 
    	 //store inside list
    	 List list=new ArrayList(collection);
    	 Collections.sort(list);
    	 
    	     	
    	return list;        
    }
 
}