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
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           int numberOfTable = Integer.parseInt(br.readLine());
           StringTokenizer token, token_1, token_2;
           while(numberOfTable-->0)
           {
               StringTokenizer st = new StringTokenizer(br.readLine());
               int numberOfColumn = Integer.parseInt(st.nextToken());
               int numberOfRow = Integer.parseInt(st.nextToken());
               
               String columnName[] = new String[numberOfColumn];
               int columnNameLength[] = new int[numberOfColumn];
               token = new StringTokenizer(br.readLine());
               for(int i =0;i<numberOfColumn;i++)
               {
                   String temp = token.nextToken();
                   columnName[i] = temp;
                   columnNameLength[i] = temp.length();
               }
               
               String fieldsName[][] = new String[numberOfRow][numberOfColumn];
               boolean rightAligned[] = new boolean[numberOfColumn];
               token_1 = new StringTokenizer(br.readLine());
               for(int i=0;i<numberOfColumn;i++)
               {
                   String temp = token_1.nextToken();
                   fieldsName[0][i] = temp;
                   columnNameLength[i] = Math.max(temp.length(), columnNameLength[i]);
                   if(Character.isDigit(temp.charAt(0)) && !temp.contains("/"))
                   {
                       rightAligned[i] = true;
                   }
               }
               
               for(int i=1;i<numberOfRow;i++)
               {
                  token_2 = new StringTokenizer(br.readLine());
                  for(int j=0;j<numberOfColumn;j++)
                  {
                      String temp = token_2.nextToken(); 
                      fieldsName[i][j] = temp;
                      columnNameLength[j] = Math.max(temp.length(), columnNameLength[j]);
                  }
               }
               
               for(int i=0;i<numberOfColumn;i++)
                  columnNameLength[i] +=2;
                  
               StringBuilder sb = new StringBuilder();
               String buildDelim = printDelim(columnNameLength);
               sb.append(buildDelim+"\n");
               printColumnName(sb,columnName,columnNameLength);
               //sb.append("\n");
               sb.append(buildDelim+"\n");
               
               printRecord(sb,fieldsName,columnNameLength,rightAligned);
               sb.append(buildDelim+"\n");
               System.out.println(sb);
           }
    }
            private static String printDelim(int[] columnNameLength)
        {
            StringBuilder sb = new StringBuilder();
            sb.append("+");
            for(int length: columnNameLength)
            {
                while(length-->0)
                  sb.append("-");
                sb.append("+");  
            }
            return sb.toString();
        }
        
        private static void printColumnName(StringBuilder sb, String[] columnName, int[] columnNameLength)
        {
            sb.append("|");
            for(int i=0;i<columnName.length;i++)
            {
              leftAligned(sb, columnName[i], columnNameLength[i]);
              sb.append("|");
            }
            sb.append("\n");
        }
        
        private static void leftAligned(StringBuilder sb, String name, int length)
        {
            sb.append(" "+ name);
            length -= (name.length()+1);
            while(length-->0)
              sb.append(" ");
        }
        
        private static void rightAligned(StringBuilder sb, String name, int length)
        {
            length -= (name.length()+1);
            while(length-->0)
              sb.append(" ");
            sb.append(name+" ");  
        }
        
        private static void printRecord(StringBuilder sb, String[][] fieldsName, int[] columnNameLength, boolean[] rightAligned)
        {
     
            for( String[] fieldName: fieldsName)
            {
                sb.append("|");            
                for( int i=0;i<fieldName.length;i++)
                {
                    if(!(rightAligned[i]))
                      leftAligned(sb, fieldName[i], columnNameLength[i]);
                    else
                      rightAligned(sb,fieldName[i], columnNameLength[i]);
                    sb.append("|");  
                }
                sb.append("\n");
            }
        }
        
        
}
