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
       Scanner z = new Scanner(System.in);
       String a = z.next();
       int n=1,add=0, add1=0;
       int b=a.length();
       if(b==10){
            for(int i=0; i<10; i++){
                int s =a.charAt(i);
                add=n*s;
                add1=add1+add;
                n++;
            }
            if(add1%11==0){
                System.out.println("Legal ISBN");
            }
            else{
                System.out.println("Illegal ISBN");
            }
        }
        else{
            System.out.println("Illegal ISBN");
        }
    }
}
