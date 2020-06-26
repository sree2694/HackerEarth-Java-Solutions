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
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            int N=sc.nextInt();
            int f=N-1;
            int s=f*2;
            for(int i=1;i<N;i++)
            {
                String str="";
                for(int j=1;j<=i;j++)
                    str+="*";
                for(int j=i+1;j<=2*N-i;j++)
                    str+="#";
                for(int j=1;j<=i;j++)
                    str+="*";
                System.out.println(str);
            }
            for(int i=1;i<=N*2;i++)
            {
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }
}
