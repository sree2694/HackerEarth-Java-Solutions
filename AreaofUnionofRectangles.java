/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
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
		int n=Integer.parseInt(br.readLine());
		boolean graph[][]=new boolean[1001][1001];
		int x1,y1,x2,y2;
		for(int k=0;k<n;k++){
			String temp[]=new String[4];
			temp=br.readLine().split(" ");
			x1=Integer.parseInt(temp[0]);
			y1=Integer.parseInt(temp[1]);
			x2=Integer.parseInt(temp[2]);
			y2=Integer.parseInt(temp[3]);
			
			for(int i=x1;i<x2;i++)
				Arrays.fill(graph[i],y1,y2,true);
		}
		int area=0;
		for(int i=0;i<1001;i++){
			for(int j=0;j<1001;j++)
				if(graph[i][j])
					area++;
		}
		System.out.println(area);
    }
}
