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

class Anagrams {
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
        int ntcs = sc.nextInt();
        sc.nextLine();
        while(ntcs-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int[] arr = new int[256];
            for(int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                arr[(int)ch]++;
            }
            for(int i = 0; i < s2.length(); i++) {
                char ch = s2.charAt(i);
                arr[(int)ch]--;
            }
            int count = 0;
            for(int i = 0; i < 256; i++) {
                if(arr[i] != 0)
                    count += Math.abs(arr[i]);                
            }
            System.out.println(count);            
        }
 
    }
}

