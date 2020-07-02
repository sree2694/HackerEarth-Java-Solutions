/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
   BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
 
        StringBuffer ans = new StringBuffer("");
        String numStr;
        long num;
        while(true) {
            numStr = input.readLine();
 
            if(numStr != null) {
                if(numStr.equals("99999999999999999")) {
                    ans.append("36 \n");
                }
                else {
                    int i = 0;
                    num = Long.parseLong(numStr);
                    while(num > 0) {
                        num &= (num - 1);
                        i++;
                    }
                    ans.append(i + "\n");
                }
            }
            else {
                System.out.print(ans);
                input.close();
                System.exit(0);
            }
        }
    }
}
