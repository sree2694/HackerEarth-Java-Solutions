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
 Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int x=sc.nextInt();
		ArrayList<Integer> ar=new ArrayList<Integer>();
		for(int i=1;i<=n;i++){
		ar.add(i);
		}
		int k1=0;
		while(k1==0){
		if(ar.size()==1){
		System.out.println(ar.get(0));
		return;
		}
		int mod=x%k;
		int j=0;
		int pos=ar.indexOf(x);
		pos=(pos+1)%ar.size();
		for(j=0;j<mod;j++){
		if(ar.size()==1){
		System.out.println(ar.get(0));
		return;
		}
		pos=pos%ar.size();
		ar.remove(pos);
		}
		pos=(pos)%(ar.size());
		x=ar.get(pos);
		}
    }
}
