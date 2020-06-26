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
Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char s1[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(s1[i]>='a' && s1[i]<='z')
                s1[i]=(char)(s1[i]-'a'+'A');
            else if(s1[i]>='A' && s1[i]<='Z')
                s1[i]=(char)(s1[i]-'A'+'a');
        }
        for(int i=0;i<s.length();i++)
            System.out.print(s1[i]);
 
        sc.close();
    }
}
