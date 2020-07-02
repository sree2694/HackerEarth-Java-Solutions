/* IMPORTANT: Multiple classes and nested static classes are supported */


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
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int t = Integer.parseInt(br.readLine());
       while(t-- >0)
       {
           
           int n = Integer.parseInt(br.readLine());
           int a;
           String b;
           int c[] = new int[32];
 
           for(int i=0;i<n;i++)
           {
               a = Integer.parseInt(br.readLine());
               b = Integer.toBinaryString(a);
               for(int j=b.length()-1;j>=0;j--)
               {
                   
                   if(b.charAt(j)=='1')
                    c[b.length()-j-1]++;
                   
               }        
           }
           int max = c[0];
           int pos = 0;
           for(int i=1;i<31;i++)
           {
               if(max<c[i]){
                  max = c[i];
                  pos = i;}
           }
 
          System.out.println(pos);           
       }
    }
}
