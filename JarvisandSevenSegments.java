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
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.valueOf(br.readLine());
        StringBuilder ans = new StringBuilder();
        HashMap<Integer, Integer> bulbs = new HashMap<>();
        bulbs.put(1, 2);
        bulbs.put(2, 5);
        bulbs.put(3, 5);
        bulbs.put(4, 4);
        bulbs.put(5, 5);
        bulbs.put(6, 6);
        bulbs.put(7, 3);
        bulbs.put(8, 7);
        bulbs.put(9, 6);
        bulbs.put(0, 6);
 
        while(tests-- > 0) {
            int n = Integer.valueOf(br.readLine());
            String s[] = br.readLine().split(" ");
            int minBulbs = Integer.MAX_VALUE;
            int val = 0;
            for(int i=0; i<n; i++) {
                int count = countBulbs(s[i], bulbs);
                if(minBulbs > count) {
                    val = Integer.valueOf(s[i]);
                    minBulbs = count;
                }
            }
            ans.append(val).append("\n");
        }
        System.out.print(ans);
    }
     private static int countBulbs(String num, HashMap<Integer, Integer> map) {
        int bulbs = 0;
        for(char c : num.toCharArray()) {
            int n = Character.getNumericValue(c);
            if(map.containsKey(n))
                bulbs += map.get(n);
        }
        return bulbs;
    }
}
