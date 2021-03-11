import java.util.Arrays;
class Exercise4 {

int[] modifyArray(int[] arr)
{
   Arrays.sort(arr);
   int l=arr.length;
   int b[]=new int[l];
  int j=0;

  for(int i=0;i<l-1;i++)
  {
   if(arr[i]!=arr[i+1])
   {
    b[j]=arr[i];
     j++;
   }
    
  }
  b[j]=arr[l-1];
  j++;
  int[] c=new int[j];
  for(int i=0;i<j;i++)
  {
    c[i]=b[i];
  }
  
  for(int i=0;i<j;i++)
  {
   for(int m=i+1;m<j;m++)
    {
      int temp=0;
      if(c[i]<c[m])
      {
        temp=c[i];
        c[i]=c[m];
        c[m]=temp;
      }
    }
}
return c;
}
 
}


class Exercise4demo {

public static void main(String[] args) {
Exercise4 ex4=new Exercise4();
int[] a={10,20,20,50,70,30,20,60,70};
int[] arr1=ex4.modifyArray(a);
for(int i=0;i<arr1.length;i++)
System.out.print(arr1[i]+" ");

  }
}