/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
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
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long d=Long.parseLong(br.readLine());
        String onlineCosts[]=br.readLine().split(" ");
        String classicCosts[]=br.readLine().split(" ");
        
        long oc=Long.parseLong(onlineCosts[0]);
        long of=Long.parseLong(onlineCosts[1]);
        long od=Long.parseLong(onlineCosts[2]);
 
        long cs=Long.parseLong(classicCosts[0]);
        long cb=Long.parseLong(classicCosts[1]);
        long cm=Long.parseLong(classicCosts[2]);
        long cd=Long.parseLong(classicCosts[3]);
 
        long onlineC = oc + (d-of)*od;
        long classicC = cb + (d/cs)*cm +cd*d;
        
        if(onlineC<=classicC){
            System.out.println("Online Taxi");
        }else{
            System.out.println("Classic Taxi");
        }
        br.close();
    }
}
