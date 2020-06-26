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
//BufferedReader
 Scanner s = new Scanner(System.in);
        int d=Integer.parseInt(s.nextLine());
        int t=0;
        while(d-->0){
            String str[]=s.nextLine().split(" ");
            int r=Integer.parseInt(str[0]);
            int x=Integer.parseInt(str[1]);
            r=r * 2 * 22 / 7;
            if(r<=(x*100)){
                t++;
            }
        }
        System.out.println(t);
    }
}
