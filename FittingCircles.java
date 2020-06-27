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
 
import java.util.StringTokenizer;
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
 
int l = Integer.parseInt(br.readLine());
 
for(int a0=0; a0<l; a0++) {
 
StringTokenizer st = new StringTokenizer(br.readLine());
 
int a = Integer.parseInt(st.nextToken());
 
int b = Integer.parseInt(st.nextToken());
 
if(a>b) {
 
System.out.println(a/b);
 
}
 
else {
 
System.out.println(b/a);
 
}
 
}
	
    }
}
