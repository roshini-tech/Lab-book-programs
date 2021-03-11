class Exercise3 {

 int fibo(int n)
{

  if(n<=1)
     return n;
  else
  return fibo(n-1) +fibo(n-2);

}

public static void main(String[] args){
Exercise3 ex3=new Exercise3();
System.out.println(ex3.fibo(8));

}

}