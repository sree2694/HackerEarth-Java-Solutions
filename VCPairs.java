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
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();                // Reading input from STDIN
        int T = Integer.parseInt(name);
        Set<Character> v = new HashSet<Character>(); 
        v.add('a');v.add('i');v.add('o');v.add('u');v.add('e');
        for(int t = 0;t < T;t++)
        {
            int l = Integer.parseInt(br.readLine());
            String str = br.readLine(); 
            int count=0;
            for(int i = 1 ;i < l;i++)
            {
                if(v.contains(str.charAt(i))&&!v.contains(str.charAt(i-1)))
                {
                    //System.out.println(str.charAt(i));
                   count++;
                }
            }
            sb.append(count+"\n");
        }
        System.out.print(sb);
    }
}
