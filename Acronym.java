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
  int t=Integer.parseInt(br.readLine());
  String[] str=new String[t];
  int count=0;
  for(int i=0;i<t;i++)
  {
   str[i]=br.readLine();
  }
  
  int k=Integer.parseInt(br.readLine());
  StringTokenizer st=new StringTokenizer(br.readLine());
  String str2="";
 
  
      while(st.hasMoreTokens())
      {
          count=0;
         String str1=st.nextToken();
          for(int j=0;j<t;j++)
          {
              if(str[j].equals(str1))
              break;
              else
              count++;
          }
        if(count==t)
        str2=str2+(char)(str1.charAt(0)-32)+".";
       
      }
      System.out.println(str2.substring(0,str2.length()-1));
  
    }
}
