class Exercise5demo   
{
   int calculateSum(int n)
   {
       int i; int s=0;
     for(i=1;i<=n;i++)
     {
        if(i%3==0 || i%5==0)
        s+=i;
     }
     return s;
    }
}

class Exercise5{

  public static void main(String[] arg) {


     Exercise5demo ex5= new Exercise5demo();

 

     int sum = ex5.calculateSum(8);

 

     System.out.println("Sum:"+sum);
  
  }

 
}