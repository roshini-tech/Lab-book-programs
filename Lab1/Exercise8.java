class Exercise8 {
boolean checkNumber(int n) {
 boolean result = false;
if (n == 0) 
        return false; 
    while (n != 1) 
    { 
        if (n%2 != 0) 
            return false; 
        n = n/2; 
    } 
   return true;
}  
 public static void main(String[] args) {

 Exercise8  ex8 = new Exercise8 ();
 boolean result = ex8.checkNumber(128);
if(result==true) {
System.out.println("Number is a power of 2");
 }
else {
System.out.println("Number is not a power of 2");
       }
}
}