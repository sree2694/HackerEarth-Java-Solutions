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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;
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
Integer t = Integer.parseInt(br.readLine());
StringBuilder out=new StringBuilder();
while(t-->0){
String[] s=br.readLine().split(" ");
double a=Double.parseDouble(s[0]);
double b=Double.parseDouble(s[1]);
double c=Double.parseDouble(s[2]);
double d=0;
int op=0;
d=(c-a)/2;
d=Math.abs((a+d)-b);
op= (int)Math.ceil(d);
out.append(op+"\n");
}
System.out.println(out);
    }
}
