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
 int n;
         String[] input; char key;
         HashMap<Character, Integer> map = new HashMap<Character, Integer>();
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        while(n>0){
            input= br.readLine().split(" ");
            for(int i=0; i < input[0].length(); i++){
                 key = input[0].charAt(i);
                 map.putIfAbsent(key, 0);
                 map.put(key, map.get(key)+1);
                 
            }
            
            for(int i=0; i < input[1].length(); i++){
                 key = input[1].charAt(i);
                 map.putIfAbsent(key, 0);
                 map.put(key, map.get(key)-1);
                 
            }
            
            if(checkforZero(map)){
            
        System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        n--; 
        map.clear();
        
        }
        
     }
     
    public static boolean checkforZero(HashMap map){
        Set<Character> keys = map.keySet();
        
        for(Character i: keys){
            Integer value = (Integer)map.get(i);
            //System.out.println(i);
            
            if(value != 0){
                return false;
            }
        }
        return true;
    }
}
