class Exercise7 {
boolean checkNumber(int n) {
 boolean result = false;
int r1,r2;
while(n>0)
{
r1=n%10;
n=n/10;
r2=n%10;
//System.out.println(r1+" "+r2);
if(r1>=r2){
continue;
}
else{
return false;
}

}

return true;  
}
 public static void main(String[] args) {

 Exercise7  ex7 = new Exercise7 ();
 boolean result = ex7.checkNumber(12345);
if(result==true) {
System.out.println("Number is in increasing order");
 }
else {
System.out.println("Number is not in increasing order");
       }
}
}