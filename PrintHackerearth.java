/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.io.*;
 
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
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int[] arr = new int[11];
        String str = "hackerearth";
        int min = Integer.MAX_VALUE;
           for(int i=0; i<str.length(); i++) {
               int count = 0;
               for(int j=0; j<n; j++) {
                   if(str.charAt(i)==s.charAt(j)) {
                       count++;
                   }
                }
                arr[i] = count;
            }
        arr[0] /= 2;
        arr[1] /= 2;
        arr[4] /= 2;
        arr[5] /= 2;
        for(int i=0; i<11; i++){
            if(arr[i] < min) 
                min = arr[i];
        }  
        System.out.println(min);
    }
}
