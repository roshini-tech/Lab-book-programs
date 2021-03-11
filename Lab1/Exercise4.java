class Exercise4 {

void prime(int n)
{ 
for(int j=2;j<=n;j++){
 int flag=0;
  for(int i=2;i<=Math.sqrt(j);i++)
  {
    if(j%i==0)
    {
    flag=1;
    }
  }
if(flag==0)
System.out.print(j+" ");
}
}

public static void main(String[] args){

Exercise4 ex4=new Exercise4();
ex4.prime(20);
 }
}