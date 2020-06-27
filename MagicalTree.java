/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.io.BufferedReader;
 
import java.io.InputStreamReader;
 
import java.io.IOException;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static BufferedReader br;
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
br = new BufferedReader(new InputStreamReader(System.in));
 
int a = Integer.parseInt(br.readLine());
 
int max = Integer.MIN_VALUE;
 
for(int a0=0; a0<a; a0++) {
 
String s = br.readLine();
 
int val = (s.charAt(0)-'0');
 
int len = s.length();
 
for(int i=1; i<len; i+=2) {
 
if(s.charAt(i)=='+') {
 
val += s.charAt(i+1)-'0';
 
}
 
else if(s.charAt(i)=='-') {
 
val -= s.charAt(i+1)-'0';
 
}
 
}
 
if(max<val) max=val;
 
}
 
System.out.println(max);
    }
}
