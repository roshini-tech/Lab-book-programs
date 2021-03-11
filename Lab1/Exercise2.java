class Exercise2 {

void select(String s){
String s1="red";
String s2="yellow";
String s3="green";
if( s.equals(s1))
{
   System.out.print("stop");
}
else if(s.equals(s2))
{
   System.out.print("ready");
}
else
{  
   System.out.print("go");
}

}
public static void main(String[] args){

Exercise2 ex2=new Exercise2();
String str="yellow";
ex2.select(str);

}

}