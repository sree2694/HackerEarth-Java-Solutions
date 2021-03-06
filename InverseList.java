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
int t=sc.nextInt();
    while(t!=0){
    int n=sc.nextInt();
    int[] arr=new int[n+1];
    int[] temp=new int[n+1];
    boolean flag=true;
    for(int i=1; i<=n; i++){arr[i] = sc.nextInt();
    temp[arr[i]]=i;
    }
    for(int i=1; i<=n; i++){if(arr[i]!=temp[i]){flag=false; break;}}
    if(flag){
    System.out.println("inverse");
    }else{
    System.out.println("not inverse");
    }
    t--;
    }
    }
}
