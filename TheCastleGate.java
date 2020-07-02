/* IMPORTANT: Multiple classes and nested static classes are supported */


import java.io.*;
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
 
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0) {
            int N = Integer.parseInt(input.readLine());
            
            int ans = 0;
            for(int i = 1; i < N; i++) {
                for(int j = i + 1; j <= N; j++) {
                    if((i ^ j) <= N) {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
 
        input.close();
    }
}
