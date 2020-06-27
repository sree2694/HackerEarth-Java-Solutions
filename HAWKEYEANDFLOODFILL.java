/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 
    int a=Integer.parseInt(bf.readLine());
String str=bf.readLine();
StringTokenizer st = new StringTokenizer(str);
     int i=Integer.parseInt(st.nextToken());
    int j=Integer.parseInt(st.nextToken());
    int p=Integer.parseInt(st.nextToken());
 
//  Scanner sc = new Scanner(System.in);
//     int a=sc.nextInt();
//     int i=sc.nextInt();
//     int j=sc.nextInt();
//     int p=sc.nextInt();
 
    for(int k=0;k<a;k++){
        for(int q=0;q<a;q++){
        int des=Math.max(Math.abs(i-k),Math.abs(j-q));
        int result=p-des;
        if(result<0)
        result= 0;
            
            System.out.print(result+" ");
        }
        System.out.println();
    }
    }
}
