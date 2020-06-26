/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
*/
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.Scanner;
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
 
Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int key = sc.nextInt();
		int b[] = new int[s.length()];
		
		for(int i=0 ; i<s.length() ;i++) {
			b[i] = (int)s.charAt(i);
		}
		for(int i=0 ; i<s.length() ;i++) {
			if(b[i]>=(int)'A'&b[i]<=(int)'Z' )  change(b,key,s,(int)'A',(int)'Z',i);
			
			else if(b[i]>=(int)'a'&b[i]<=(int)'z') change(b,key,s,(int)'a',(int)'z',i);
			
			else if(b[i]>=(int)'0'&b[i]<=(int)'9') change(b,key,s,(int)'0',(int)'9',i); ;
		
		}
		for(int i=0 ; i<s.length();i++) {
			System.out.print((char)b[i]);
		}
	}
	static void change(int[] b , int key , String s , int start , int end , int i) {
		
		b[i] +=key;
	while(b[i]>end) {
		int temp = b[i]-end;
		b[i] = start + temp -1 ;
	}
  }  
}
 
 