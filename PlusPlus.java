/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
    
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
   try (Reader reader = new Reader();) {
            Integer n = reader.nextInt();
            Integer m = reader.nextInt();
            Integer[][] arr = new Integer[n][m];
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    arr[i][j] = reader.nextInt();
                }
                
            }
            List<SumPlus> sumPlusList = new ArrayList<>();
            for(int i=1; i<n-1; i++) {
                for(int j=1; j<m-1; j++) {
                    int sum = arr[i][j]+arr[i-1][j]+arr[i][j-1]+arr[i+1][j]+arr[i][j+1];
                    sumPlusList.add(new SumPlus(sum, new Integer[] {i,j}));
                }
            }
            Collections.sort(sumPlusList);
            sumPlusList = sumPlusList.subList(0, sumPlusList.size()/(n-2));
            int maxSum = 0;
            int size = sumPlusList.size();
            for(int i=0; i<size-1; i++) {
                for(int j=i+1; j< size; j++) {
                    if(isNotOverlapping(sumPlusList.get(i), sumPlusList.get(j))) {
                        Integer[] iCor = sumPlusList.get(i).getCoordinates();
                        Integer[] jCor = sumPlusList.get(j).getCoordinates();
                        Integer iCi = iCor[0];
                        Integer iCj = iCor[1];
                        Integer jCi = jCor[0];
                        Integer jCj = jCor[1];
                        int sum = arr[iCi][iCj]*arr[jCi][jCj]
                                +arr[iCi+1][iCj]*arr[jCi+1][jCj]
                                        +arr[iCi-1][iCj]*arr[jCi-1][jCj]
                                                +arr[iCi][iCj+1]*arr[jCi][jCj+1]
                                                        +arr[iCi][iCj-1]*arr[jCi][jCj-1];
                        if(maxSum < sum) {
                            maxSum = sum;
                        }
                    }
                }
            }
            System.out.println(maxSum);
        } catch (IOException e) {
            e.printStackTrace();
    }
}
private static boolean isNotOverlapping(SumPlus max, SumPlus sum) {
        Integer[] maxCenter = max.getCoordinates();
        Integer[] sumPlsCenter = sum.getCoordinates();
        List<String> maxPlus = Arrays.asList(new String[] {maxCenter[0]+","+maxCenter[1],
                (maxCenter[0]-1)+","+maxCenter[1],
                maxCenter[0]+","+(maxCenter[1]-1),
                (maxCenter[0]+1)+","+maxCenter[1],
                maxCenter[0]+","+(maxCenter[1]+1)});
        List<String> sumPlus =  Arrays.asList(new String[] {sumPlsCenter[0]+","+sumPlsCenter[1],
                (sumPlsCenter[0]-1)+","+sumPlsCenter[1],
                sumPlsCenter[0]+","+(sumPlsCenter[1]-1),
                (sumPlsCenter[0]+1)+","+sumPlsCenter[1],
                sumPlsCenter[0]+","+(sumPlsCenter[1]+1)});
        for(String maxCoordinates : maxPlus) {
            if(sumPlus.contains(maxCoordinates)) {
                return false;
            }
        }
        return true;
    }
}
    
class SumPlus implements Comparable<SumPlus> {
    
    private Integer sum;
    private Integer[] coordinates;
    
    public SumPlus(Integer sum, Integer[] coordinates) {
        super();
        this.sum = sum;
        this.coordinates = coordinates;
    }
    
    public SumPlus(Integer[] coordinates) {
        super();
        this.coordinates = coordinates;
    }
    
    public Integer getSum() {
        return sum;
    }
    
    public void setSum(Integer sum) {
        this.sum = sum;
    }
    
    public Integer[] getCoordinates() {
        return coordinates;
    }
    
    public void setCoordinates(Integer[] coordinates) {
        this.coordinates = coordinates;
    }
    
    @Override
    public int compareTo(SumPlus o) {
        return o.sum.compareTo(this.sum);
    }
    
}
    
class Reader implements AutoCloseable
{
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;
    
    public Reader()
    {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }
    
    public Reader(String file_name) throws IOException
    {
        din = new DataInputStream(new FileInputStream(file_name));
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }
    
    public String readLine() throws IOException
    {
        byte[] buf = new byte[64]; // line length
        int cnt = 0, c;
        while ((c = read()) != -1)
        {
            if (c == '\n')
                break;
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt);
    }
    
    public int nextInt() throws IOException
    {
        int ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do
        {
            ret = ret * 10 + c - '0';
        }  while ((c = read()) >= '0' && c <= '9');
    
        if (neg)
            return -ret;
        return ret;
    }
    
    public long nextLong() throws IOException
    {
        long ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
        if (neg)
            return -ret;
        return ret;
    }
    
    public double nextDouble() throws IOException
    {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
    
        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
    
        if (c == '.')
        {
            while ((c = read()) >= '0' && c <= '9')
            {
                ret += (c - '0') / (div *= 10);
            }
        }
    
        if (neg)
            return -ret;
        return ret;
    }
    
    private void fillBuffer() throws IOException
    {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1)
            buffer[0] = -1;
    }
    
    private byte read() throws IOException
    {
        if (bufferPointer == bytesRead)
            fillBuffer();
        return buffer[bufferPointer++];
    }
    
    public void close() throws IOException
    {
        if (din == null)
            return;
        din.close();
    }
}
