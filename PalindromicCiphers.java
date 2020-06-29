/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
/*
 * uncomment this if you want to read input.
//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
        int a=0;
            BigInteger sum=BigInteger.valueOf(1);
            String str=br.readLine();
           if(IsPalindrome(str))
           System.out.println("Palindrome");
           else
           {
               for(int i=0;i<str.length();i++)
               {
             a=str.charAt(i)-96;
             sum=sum.multiply(BigInteger.valueOf(a));
           }
           System.out.println(sum);
           }
 
        }
    }
       static boolean IsPalindrome(String str)
    {
          int i=0;
          int j=str.length()-1;
          while(i<j)
          {
            if(str.charAt(i)==str.charAt(j))
            {
            i++;
            j--;
            }
            else
            return false;
          }
 
return true;
    }
}
