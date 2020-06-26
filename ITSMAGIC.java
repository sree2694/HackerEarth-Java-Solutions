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
		String name = br.readLine();
		int num = Integer.parseInt(name); // 5
		String p = br.readLine();
		String[] arr = p.split(" ");
		long min = 0;
		//int min2=0;
		long total = 0;
		int minindex=9999999;
		long[] array = new long[num];
		//int[] min_index = new int[arr.length];
		for (int i = 0; i < num; i++) {
			array[i] = Integer.parseInt(arr[i]);
            total=total+array[i];
 
		}
		
		
		 min=total+1;
        for(int j=0;j<num;j++)
        {
            if((total-array[j])%7==0)
            {
              if(array[j]<min)
              {
              min=array[j];
              minindex=j;
              }
            }
        }

		if(minindex==9999999)
        System.out.println("-1");
        else
        System.out.println(minindex);
    }
}
