/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.Scanner;
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
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int f=0;
int t=7;
int i=0;
for(i=0;i<n;i++)
{
    int c=sc.nextInt();
    if((t-c)<(c-f))
    {
        t=t-(t-c);
        System.out.println("B");
    }
    else if((c-f)<=(t-c))
    {
        f=c;
        System.out.println("A");
    }
}
    }
}
