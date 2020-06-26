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
  Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if (str.length() >= 1 && str.length() <= 200) {
            int sumX = 0;
            int sumY = 0;
            for (int i = 0; i < str.length(); i++) {
                char value = str.charAt(i);
                ;
                switch (value) {
                    case 'L': {
                        sumX -= 1;
                        break;
                    }
                    case 'R': {
                        sumX += 1;
                        break;
                    }
                    case 'U': {
                        sumY += 1;
                        break;
                    }
                    case 'D': {
                        sumY -= 1;
                        break;
                    }
                }
            }
            System.out.print(sumX +" "+ sumY);
        }
    }
}
