package Exercise3;

import java.util.HashMap;
import java.util.Map;

public class LabThree {
 
    public static void main(String[] args) {
    	int[] arr= {2,3,4,5};
    	LabThree lab=new LabThree();
    	System.out.println(lab.getSquares(arr));
    }

    //Accepts a list of numbers and return their squares
    public Map getSquares(int[] nums) {
    	Map<Integer,Integer> count=new HashMap<Integer,Integer>();
    	for(int i: nums)
    	{
    		count.put(i, i*i);
    	}
        return count;

    }
 
}