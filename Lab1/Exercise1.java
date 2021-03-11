class Exercise1 {

int sum (int n)
{
  int d,r=0,s=0;
  while(n>0){
    r=n%10;
    n=n/10;
    s=s+r*r*r;
}
return s;
}

public static void main( String[] args) {

Exercise1 ex1=new Exercise1();

int s=ex1.sum(123);
System.out.println(s);
}

}