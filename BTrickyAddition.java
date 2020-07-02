/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.*;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
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
   FastReader s=new FastReader();
        int t=s.nextInt();
        StringBuilder res=new StringBuilder();
        while(t-->0){
            String num1=s.next();
            int len1=num1.length();
            String num2=s.next();
            int len2=num2.length();
            StringBuilder sb=new StringBuilder();
            int i=0,c=0,prev=0;
            while(i<len1 && i<len2){
                int sum=c+(int)num1.charAt(i)+(int)num2.charAt(i)-96;
                if(sum<10){
                    sb.append(sum);
                    prev=sum;
                    c=0;i++;
                    continue;
                }
                prev=sum;
                sb.append(sum/10);
                c=sum%10;
                i++;
            }
            if(i!=len1){
                while(i<len1){
                   int sum=c+(int)num1.charAt(i)-48;
                   if(sum<10){
                    sb.append(sum);
                    c=0;i++;
                    prev=sum;
                    continue;
                  }
                    sb.append(sum/10);
                    prev=sum;
                    c=sum%10;
                    i++; 
                }
            }
            if(i!=len2){
                 while(i<len2){
                   int sum=c+(int)num2.charAt(i)-48;
                   if(sum<10){
                    sb.append(sum);
                    c=0;i++;
                    prev=sum;
                    continue;
                   }
                    sb.append(sum/10);
                    prev=sum;
                    c=sum%10;
                    i++; 
                }
            }
            if(c!=0){
                sb.append(c);
            }
            if(prev%10==0&&prev!=0){
                sb.append(0);
            }
            res.append(sb.toString()+"\n");
 
        }
        System.out.println(res.toString());
    }
}
