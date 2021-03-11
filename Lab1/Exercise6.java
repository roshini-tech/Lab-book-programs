class Exercise6demo{

  int calculateDifference(int n){
  int i,ss=0,s=0;
  for(i=1;i<=n;i++)
  {  
       s+=i*i;
       ss+=i;
  }
  return Math.abs(s-(ss*ss));
  }
}

class Exercise6{

public static void main(String[] args){

   Exercise6demo ex6=new Exercise6demo();
   int ans=ex6.calculateDifference(5);
   System.out.println(ans); 


}
}