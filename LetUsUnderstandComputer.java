/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.*;

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
        int tests = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        long i;
        while(tests-- > 0) {
            long x = Long.parseLong(br.readLine());
            for(i=1; i<=Math.sqrt(x); i*=2);
                if(x/i >= i/2)
                    ans.append(x - x/i);
                else
                    ans.append(x - i/2 + 1);
            ans.append("\n");
        }
        System.out.print(ans);
    }
}
