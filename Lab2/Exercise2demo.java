import java.util.Arrays;
class Exercise2 {

String[] sortStrings( String[] str)
{ String temp;
 int n=str.length;
   for (int i = 0; i <n; i++) 
        {
            for (int j = i + 1; j <n; j++) 
            { 
                if (str[i].compareTo(str[j]) > 0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
 if(n%2==0)  //if even string array length
  {
   for (int i=0;i<n/2;i++)
   {
      str[i]=str[i].toUpperCase();
   }
  }
  else   // if odd string array length
{
  for (int i=0;i<=n/2;i++)
   {
      str[i]=str[i].toUpperCase();
   }
}

return str;
}

}


class Exercise2demo {

public static void main( String[] args) {

Exercise2 ex2=new Exercise2();
String[] arr={"Hello","Antara", "world","this","is"};
String[] arr2=ex2.sortStrings(arr);
System.out.print(Arrays.toString(arr2));

  }
}