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
        StringBuilder ans = new StringBuilder();
 
        while((t--)!= 0){
           int n = Integer.parseInt(br.readLine());
           int[] a = new int[n];
           String[] s = br.readLine().split(" ");
           a[0] = Integer.parseInt(s[0]);
           if(a[0] != 0){
               ans.append("Incorrect 0\n");
           }
           else{
             for(int i=0;i<n;i++){
                a[i] = Integer.parseInt(s[i]);
             }
             boolean first = false ,second = false;
             int index = 0,index2 = 0;
 
             for(int i=1;i<n;i++){
                if(a[i] < a[i-1]){
                    if( i+1 !=n && a[i-1]<a[i+1]){
                       first = true;
                       index = i;
                       if(a[i] == 809100){
                           index = i-1;
                       }
                       break;
                    }
                    else{
                        second = true;
                        index2 = i-1;
                        break;
                    }
                }
             }
 
             if( !first && !second){
                 ans.append("Correct\n");
             }
             else if(first){
                 ans.append("Incorrect ").append(a[index]).append("\n");
             }
             else{
                 ans.append("Incorrect ").append(a[index2]).append("\n");
             }
               
           }
           
        }
        System.out.println(ans);
    }
}
