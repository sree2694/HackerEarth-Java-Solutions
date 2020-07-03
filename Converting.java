/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

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
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String s[]=br.readLine().split(" ");
            int k=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            int n=Integer.parseInt(s[2]);
            System.out.println(steps(k,m,n));
    }
}
   public static int steps(int k,int m,int n)
    {
        if(k>=m)
        return (k-m)/2+(k-m)%2;
        if(m%n==0)
        return 1+steps(k,m/n,n);
        else
        {
            int x=(m/n+1)*n;
            return (x-m)/2+(x-m)%2+steps(k,x,n);
        }
    }
}