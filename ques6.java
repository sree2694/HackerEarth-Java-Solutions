/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


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
        String n = br.readLine(); 
        int T= Integer.parseInt(n);
        for(int i = 0;i < T;i++)
        {
            String n1 = br.readLine(); 
            int a=Integer.parseInt(n1);
            int p=a,q=a;
            for(int j=1;j<=a;j++)
            {
               for(int k=1;k<a*2 ;k++)
               {
                   if(k>=p&&k<=q)
                   {
                       System.out.print("*");
                   }
                   else
                   {
                       System.out.print(" ");
                   }
               }
               p--;
               q++;
               System.out.println(); 
            }
        }
    }
}
