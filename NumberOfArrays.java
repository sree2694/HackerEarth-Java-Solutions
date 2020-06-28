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
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, k, q;
        String[] input;
        StringBuilder output = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            input = br.readLine().split(" ");
            n = Integer.parseInt(input[0]);
            k = Integer.parseInt(input[1]);
            q = Integer.parseInt(input[2]);
            input = br.readLine().split(" ");
            TreeSet<Long> firstSegment = new TreeSet<>();
            TreeSet<Long> lastSegment = new TreeSet<>();
            addElementsToSet(0, k - 1, input, firstSegment);
            addElementsToSet(k - 1, n, input, lastSegment);
            long smallestFromSegments = (k != 1) ? firstSegment.pollFirst() : -1;
            long smallestFromLast = lastSegment.pollFirst();
            long smallest = (k != 1) ? (smallestFromSegments < smallestFromLast ? smallestFromSegments : smallestFromLast) : lastSegment.pollLast();
            if(smallest < q) {
                output.append(smallest).append("\n");
            } else {
                output.append("NO").append("\n");
            }
        }
        System.out.println(output);
        br.close();
    }
      private static void addElementsToSet(int first, int last, String[] array, TreeSet<Long> set) {
        for(int i = first; i < last; i++) {
                set.add(Long.parseLong(array[i]));
            }
    }
}
