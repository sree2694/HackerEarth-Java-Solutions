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
       int t=Integer.parseInt(br.readLine());
       while(t-->0)
       {
           StringTokenizer st=new StringTokenizer(br.readLine());
           String str1=st.nextToken();
           String str2=st.nextToken();
 
         int sum=Reverse(str1)+Reverse(str2);
          int r=Reverse(String.valueOf(sum));
            System.out.println(r); 
 
 
       }
    }
      static int Reverse(String str)
    {
        int i=0;
        int j=str.length()-1;
         char temp='a';
         char[] c=str.toCharArray();
        if(c[j]==0)
        j=str.length()-2;
        while(i<j)
        {
             temp= c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        return Integer.parseInt(new String(c));
    }
}
