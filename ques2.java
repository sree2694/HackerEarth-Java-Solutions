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
        int no=s.nextInt();
        int x=s.nextInt();
        int y=s.nextInt();
        int count=0;
        if(x<=y)
        {
            for(int i=0;i<no;i++)
            {
                int k=s.nextInt();
                if(k>=x && k<=y)
                {
                    count++;
                }
                else{
                    System.out.println("NO");
                    break;
 
                }
            }
        }
        else
        {
            System.out.println("NO");
        }
        
       
       
       
        if(count==no)
        {
             System.out.println("YES");
        }
    }
}
