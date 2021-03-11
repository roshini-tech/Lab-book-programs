class Exercise1{

int getSecondSmallest( int[] arr)
{ 
   int i,j,temp=0,small=0;
int n=arr.length;
   for(i=0;i<n;i++)
    {
         for(j=0;j<n-i-1;j++)
         {
           if(arr[j]>arr[j+1])
           {
             temp=arr[j];
             arr[j]=arr[j+1];
             arr[j+1]=temp;
             
           }
         }
    }
  small=arr[1];
  return small;
}


}

class Exercise1demo{

public static void main(String[] args) {

Exercise1 ex1=new Exercise1();
int[] arr={30,40,10,60,20};
int element=ex1.getSecondSmallest(arr);
System.out.println(element);


  }
}