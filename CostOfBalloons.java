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
           //Scanner
        Scanner s = new Scanner(System.in);
        final int testCount = Integer.valueOf(s.nextLine());
        for(int i = 0; i < testCount; i++ ){
            final String[] baloonCosts = s.nextLine().split(" ");
            final int greenBaloonCost = Integer.valueOf(baloonCosts[0]);
            final int purpleBaloonCost = Integer.valueOf(baloonCosts[1]);
            final int studentCount = Integer.valueOf(s.nextLine());
            int firstProblemSolvers = 0;
            int secondProblemSolver = 0;
            for(int j = 0; j < studentCount; j++){
                final String[] results = s.nextLine().split(" ");
                if(results[0].equals("1")){
                    firstProblemSolvers++;
                }
                if(results[1].equals("1")){
                    secondProblemSolver++;
                }
            }
            
            System.out.println(
                Math.min(firstProblemSolvers,secondProblemSolver) * Math.max(greenBaloonCost, purpleBaloonCost) + Math.max(firstProblemSolvers,secondProblemSolver) * Math.min(greenBaloonCost, purpleBaloonCost)
                );
        }

    }
}

