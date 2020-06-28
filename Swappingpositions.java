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
        int t = Integer.parseInt(br.readLine());
        char[] first, second;
        int n;
        StringBuilder output = new StringBuilder();
        while(t-- > 0) {
        	n = Integer.parseInt(br.readLine());
        	String firstString = br.readLine();
        	String secondString = br.readLine();
        	if(firstString.equalsIgnoreCase(secondString)) {
        		output.append("YES").append("\n");
        	} else {
        		first = firstString.toCharArray();
        		second  = secondString.toCharArray();
        		List<Integer> list = new ArrayList<>();
        		for(int i = 0; i < n; i++) {
        			if(first[i] != second[i]) {
        				list.add(i);
        			}
        			if(list.size() > 3) 
        				break;
        		}
        		if(list.size() > 3) {
        			output.append("NO").append("\n");
        		} else if(list.size() == 1) {
        			output.append("YES").append("\n");
        		} else if(list.size() == 3) {
        			int firstPos = list.get(0);
        			int secondPos = list.get(1);
        			int thirdPos = list.get(2);
        			if(compareTwoPositions(first, second, firstPos, secondPos) 
        					|| compareTwoPositions(first, second, firstPos, thirdPos) 
        					|| compareTwoPositions(first, second, secondPos, thirdPos)) {
        				output.append("YES").append("\n");
        			} else {
        				output.append("NO").append("\n");
        			}
        		} else if(list.size() == 2) {
        			int firstPos = list.get(0);
        			int secondPos = list.get(1);
        			if(first[firstPos] == second[secondPos] 
        					|| first[secondPos] == second[firstPos]
							|| first[firstPos] == first[secondPos]
							|| second[firstPos] == second[secondPos]) {
            			output.append("YES").append("\n");
            		} else {
            			output.append("NO").append("\n");
            		}
        		}
        	}
        	
        }
        System.out.println(output);
        br.close();
    }
    	private static boolean compareTwoPositions(char[] first, char[] second, int firstPos, int secondPos) {
		return (first[firstPos] == first[secondPos] && second[firstPos] == second[secondPos])
				|| (first[firstPos] == second[secondPos] && first[secondPos] == second[firstPos]);
	}
}
