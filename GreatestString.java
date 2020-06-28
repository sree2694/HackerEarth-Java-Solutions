/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.io.*;

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
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String s=br.readLine();
            int n=Integer.parseInt(br.readLine());
            int len=s.length();
            char[] arr=s.toCharArray();
            int count=0;
            for(int i=0;i<len;i++)
            {
                if(count==n)
                break;
                if(arr[i]=='a')
                {
                    arr[i]='b';
                    count++;
                }
                if(arr[i]=='e')
                {
                    arr[i]='f';
                    count++;
                }
                if(arr[i]=='i')
                {
                    arr[i]='j';
                    count++;
                }
                if(arr[i]=='o')
                {
                    arr[i]='p';
                    count++;
                }
                if(arr[i]=='u')
                {
                    arr[i]='v';
                    count++;
                }
            }
            String q=new String(arr);
            System.out.println(q);
        }
    }
}
