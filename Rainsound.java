/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
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
        int totalCases = Integer.parseInt(br.readLine());  
        StringBuilder sb = new StringBuilder();   
        while(totalCases -- > 0){
            String[] arr = br.readLine().split(" ");
            double l = Double.parseDouble(arr[0]);
            double r = Double.parseDouble(arr[1]);
            double s = Double.parseDouble(arr[2]);
            if(s>r)
            {
                sb.append(-1+" "+-1);
            }else{
                int min = (int)Math.ceil(l/s);
                int max = (int)Math.floor(r/s);
                if(min>max) 
                    sb.append(-1+" "+-1);
                else 
                    sb.append(min+" "+max);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
