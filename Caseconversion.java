import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String s = br.readLine();

            String out_ = caseConversion(s);
            System.out.println(out_);
            System.out.println("");
         }

         wr.close();
         br.close();
    }
    static String caseConversion(String s){
        // Write your code here that converts the given camel case string s  and
        // returns a snake case version of that string
  StringBuilder str = new StringBuilder(s);
 
        if(str.charAt(0)>=65 &&str.charAt(0)<=90){
            str.setCharAt(0,(char)(str.charAt(0)+32));
        }
        int k = str.length();
        for(int i=0;i<k-1;i++){
            if(str.charAt(i+1)>=65 &&str.charAt(i+1)<=90){
                str.setCharAt(i+1,(char)(str.charAt(i+1)+32));
                str.insert(i+1,'_');
                i=i+1;
                k++;
            }
        }
 
    return str.toString();
 
    
    }
}