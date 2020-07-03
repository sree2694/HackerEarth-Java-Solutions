/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int n=N;
        Queue<Integer> a=new ArrayDeque();
        for(int i=1;i<=n;i++)
        {
            a.add(i);
        }
        String s=br.readLine();
        int i=0,j=0;
        while(a.size()>1)
        {
            if(s.charAt(j%N)=='y')
            {
                a.remove();
            }
            else
                a.add(a.remove());
            j++;
 
        }
        System.out.println(a.peek());
    }
}
