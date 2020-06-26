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
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
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
        StringBuilder sb = new StringBuilder();
        StringTokenizer st, token1;
        st = new StringTokenizer(br.readLine());
 
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        final BigInteger[] array = new BigInteger[n];
 
        token1 = new StringTokenizer(br.readLine());
 
        array[0] = new BigInteger(token1.nextToken());
        int i=1;
 
        while(token1.hasMoreTokens()){
            array[i] = BigInteger.valueOf(Long.parseLong(token1.nextToken())).add(array[i-1]);
            i++;
        }
 
 
 
        while(q-- > 0){
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
 
 
 
 
            sb.append(calcAvg(left-1,right-1,array));
            sb.append("\n");
 
        }
 
        System.out.println(sb.toString());
 

        
    }
 
         private static BigInteger calcAvg(int start, int end, BigInteger[] array){
        int noOfElements = (end-start)+1;
        BigInteger result = BigInteger.ZERO;
 
        if(start == 0){
            result = array[end];
        }
        else{
            result = array[end].subtract(array[start - 1]);
        }
 
        return result.divide(BigInteger.valueOf(noOfElements)) ;
    }
}