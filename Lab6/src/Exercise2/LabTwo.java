package Exercise2;
import java.util.HashMap;
import java.util.Map;

public class LabTwo {

	public static void main(String[] args) {
		char[] arr= {'a','e','i','a','i'};
		LabTwo labTwo=new LabTwo();
		System.out.println(labTwo.countChars(arr));
	}
	//method that accepts a character array and count the number of times each character is present in the array.
     Map<Character,Integer> countChars(char[] chars) {
    	 
    	Map<Character,Integer> count=new HashMap<Character,Integer>();
    	for(char c: chars)
    	{
    		if(count.containsKey(c))
    		{
    			count.put(c, count.get(c)+1);
    		}
    		else
    		{
    			count.put(c, 1);
    		}
    	}
    	return count;

    }
}