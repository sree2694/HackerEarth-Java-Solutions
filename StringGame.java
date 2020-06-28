/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
     static     String inp="";
    static BufferedReader inpReader = new BufferedReader(new InputStreamReader(System.in));
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
  try {
            int test = Integer.parseInt(inpReader.readLine());
 
            int[] charBuffer;
            while (test > 0){
                inp = inpReader.readLine();
                charBuffer = new int[26];
 
                for (char c:inp.toCharArray()) {
                       charBuffer[Math.abs(c - 97)]++;
                }
                int count=0;
 
                for (int x :charBuffer) {
                    if (x !=0){
                        count++;
                    }
                }
 
                if (count%2 ==0){
                    System.out.println("Player2");
                }else {
                    System.out.println("Player1");
                }
                test--;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
