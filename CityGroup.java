/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
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
 Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();
		
		int[] S=new int[N+1];
        for(int i=1;i<=K;i++)
        {
            int a=s.nextInt();
          
            for(int k=1;k<=a;k++)
            {
                S[s.nextInt()] = i;
            }
        }
        int Q=s.nextInt();
        //System.out.println("Q "+Q);
        for(int k=0;k<Q;k++)
        {
            int x=s.nextInt();
            int y=s.nextInt();
 
            System.out.println(Math.min(Math.abs(S[y] - S[x]), K-Math.abs(S[y]-S[x])));
                // S[y] == 1 || S[x] == 1 ? 1 : 
                // (isGroup1Empty ? Math.abs(S[y] - S[x]) : 2));
        
        }
 
    }
}
