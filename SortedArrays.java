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
       int n=Integer.parseInt(br.readLine());
       int min=-1;
       int a=0;
       StringTokenizer st=new StringTokenizer(br.readLine());
       int[] arr=new int[n];
       long count=0;
       for(int i=0;i<n;i++)
       {
       arr[i]=Integer.parseInt(st.nextToken());
       if(arr[i]>min)
       min=arr[i];
       else
       {
           a=min-arr[i]+1;
           count=count+a;
           min=arr[i]+a;
       }
       }
       System.out.println(count);
    }
}
