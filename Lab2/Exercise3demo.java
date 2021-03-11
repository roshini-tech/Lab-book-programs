import java.util.Arrays;
class Exercise3 {

int[] getSorted(int[] array)
{
  for(int i=0; i<array.length/2; i++)
 {   
       int temp = array[i]; 
       array[i] = array[array.length -i -1]; 
       array[array.length -i -1] = temp; 
 }
  Arrays.sort(array);
 return array;
 }

}

class Exercise3demo{

public static void main( String[] args) {

Exercise3 ex3=new Exercise3();
int[] arr1={10,40,5,45,21,3};
int[] demo=ex3.getSorted(arr1);
System.out.print(Arrays.toString(demo));


  } 
}