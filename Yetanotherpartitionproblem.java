/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
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
 
        Scanner sc=new Scanner(System.in);
        Integer testCaseNum=Integer.parseInt(sc.nextLine()); //Number of TestCases
        for(int i=0;i<testCaseNum;i++)
        {
            Integer num=Integer.parseInt(sc.nextLine());//Number of Array_elements
            String s=sc.nextLine();
            String arrayElements[]=s.split(" ");
            long arrdata[]=new long[num];
            for(int j=0;j<arrayElements.length;j++)
                arrdata[j]=Long.parseLong(arrayElements[j]);
 
            long result=TestClass.Maxvalue(arrdata);
            System.out.println(result);
    }
}
    public static long Maxvalue(long [] arr)
    {
        long totalxor=0;
        for(int i=0;i<arr.length;i++)
        {
            totalxor^=arr[i];
        }
        long result=totalxor;
        long grap=0;
        for(int i=0;i<arr.length;i++)
        {
            grap^=arr[i];
            long st=(grap&(grap^totalxor));
            if(st>result)
            {
                result=st;
            }
        }
 
        return result;
    }
}