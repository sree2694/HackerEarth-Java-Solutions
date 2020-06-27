/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
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
    Scanner s = new Scanner(System.in);
        int no=s.nextInt();
        while(no!=0)
        {
            String str=s.next();
            int l=str.length();
            int k=l-1;
            for(int i=0;i<l;i++)
            {
                char first=str.charAt(i);
               // System.out.print(first);
                int f=(int)first;
                char last=str.charAt(k);
              //  System.out.print(last);
                int lastval=(int)last;
                int total=f+lastval-96;
               // System.out.println(total);
                if(total>122)
                {
                    total=total-26;
                   // total=total+96;
                }
                System.out.print((char)total);
                k--;
 
            }
            System.out.println();
            no--;
        }
        
    }
}
