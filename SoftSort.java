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
    static Scanner sc=new Scanner(System.in);
    static long mod=1000000007 ;
    static long[] fact=new long[1000001];
    private static void factorial(){
        fact[0]=1;
	for(int i=1;i<=1000000;i++)
	{
		fact[i]=((fact[i-1]*i)%mod);
	}
    }
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
   int t=sc.nextInt(); long ans;
    factorial();
    while(t!=0){
    int n=sc.nextInt();
    ans=(((3*fact[n])%mod+3)%mod);
    System.out.print(ans+"\n");
    t--;
    }
    }
}
