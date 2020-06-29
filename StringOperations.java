/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * uncomment this if you want to read input.
//import for Scanner and other utility classes
import java.util.*;
*/

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
		String _S = br.readLine(); // Reading input from STDIN
		int _Q = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder(_S);
		while (_Q-- > 0) {
			String q = br.readLine();
			String[] Q = q.split("\\ ");
			int index = Integer.parseInt(Q[0]);
			String ch = Q[1];
			sb.replace(index - 1, index, ch);
		}
		String str = sb.toString();
		System.out.println(str);
 
		int _M = Integer.parseInt(br.readLine());
		while (_M-- > 0) {
			String m = br.readLine();
			String[] M = m.split("\\ ");
			int start = Integer.parseInt(M[0]);
			int end = Integer.parseInt(M[1]);
			StringBuilder subStr = new StringBuilder(sb.substring(start - 1, end));
			subStr.reverse();
			sb.replace(start - 1, end, subStr.toString());
		}
		System.out.println(sb.toString());
 
		int matchChar = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == sb.charAt(i)) {
				matchChar++;
			}
		}
		System.out.println(matchChar);
    }
}
