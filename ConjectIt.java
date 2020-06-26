/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;
import java.io.*;
import java.math.BigInteger;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    static Scanner sc = new Scanner(System.in);
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
 //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte T= sc.nextByte();
 
        while(T-- > 0){
            BigInteger N = sc.nextBigInteger();
           //process is to divide an even N continuously by 2, and when it's odd, its made even. So, ultimately, we'll be left with an even number so, always the result would be "YES".
           System.out.println("YES");
        }
    }
}
