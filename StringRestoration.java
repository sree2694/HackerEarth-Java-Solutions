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
        StringBuilder  ans = new StringBuilder();
 
        while((t--) != 0){
            int n = Integer.parseInt(br.readLine());
            StringBuilder temp = new StringBuilder();
 
            String[] s = br.readLine().split(" ");
            if(Integer.parseInt(s[0]) > 1){
                ans.append("-1\n");
            }
            else{
                temp.append('a');
                boolean flag = true;
                int a = 97;
                for(int i=1;i<n;i++){
                    if(Integer.parseInt(s[i]) < Integer.parseInt(s[i-1])){
                        ans.append("-1\n");
                        flag = false;
                        break;
                    }
                    else if( Integer.parseInt(s[i]) == Integer.parseInt(s[i-1]) ){
                        temp.append('a');
                    }
                    else{
                        int j = Integer.parseInt(s[i]) - Integer.parseInt(s[i-1]);
                        if(j>1){
                           ans.append("-1\n");
                           flag = false;
                           break;
                        }
                        else{
                           int b = ++a;
                           if(b> 122){
                              b = b-26;
                           }
                           temp.append((char)b);
                        }
                    }
                }
                if(flag){
                   ans.append(temp).append("\n");
                }
            }
        }
        System.out.println(ans);
    }
}
