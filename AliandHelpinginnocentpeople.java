/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.io.*;
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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        //StringBuffer[] sb=new StringBuffer[s.length()];
        int arr[]=new int[s.length()];
        char arr1[]=s.toCharArray();
        int sum=0;
 
 
            if (arr1[2] == 'A' || arr1[2]=='E' || arr1[2]=='I' || arr1[2]=='O' || arr1[2]=='U' || arr1[2]=='Y')
            {
                System.out.println("invalid");
            }
            else {
                int index = 0;
                for (int i = 0; i < arr1.length; i++) {
                    Boolean flag = Character.isDigit(arr1[i]);
                    if (flag) {
                        arr[index] = Character.getNumericValue(s.charAt(i));
                        index++;
                    }
                 }
                for(int i=0;i<arr.length-1;i++)
                {
                    Boolean flag2=((arr[i]+arr[i+1])%2)==0;
                    if(flag2)
                    {
                    }
                    else
                    {
                        if(i==1||i==4||i==6)
                        {
 
                        }
                        else
                        {
                            sum++;
 
                        }
 
                    }
 
                }
                if(sum==0)
                {
                    System.out.println("valid");
                }
                else
                {
                    System.out.println("invalid");
                }
            }
    }
}
