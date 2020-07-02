import java.io.IOException;
import java.io.DataInputStream;
import java.util.*;
class TestClass {
    
    public static void main(String args[] ) throws Exception {
        FastReader reader = new FastReader();
        int n = reader.nextInt();
        boolean[] arr = new boolean[1000000];
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = reader.nextInt();
            arr[a[i]] = !arr[a[i]];
        }
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i < n; i++){
            if(arr[a[i]]){
                min = Math.min(min, a[i]);
                max = Math.max(max, a[i]);
            }
        }
        System.out.print(min + " " + max); 
        reader.close();
    }
    
    private static class FastReader{
        final private int BUFFER_SIZE = 1 << 16;
        private byte[] buffer;
        private DataInputStream din;
        private int bufferPointer, bytesRead;
        
        public FastReader(){
            buffer = new byte[BUFFER_SIZE];
            din = new DataInputStream(System.in);
            bufferPointer = bytesRead = 0;
        }
        
        private String nextLine() throws IOException{
            StringBuilder sb = new StringBuilder();
            byte c;
            while((c = read()) != -1 && c != '\n'){
                sb.appendCodePoint(c);
            }
            return sb.toString();
        }
        
        private int nextInt() throws IOException{
            int ret = 0;
            byte c = read();
            while(c <= ' '){
                c = read();
            }
            boolean neg = c == '-';
            if(neg){
                c = read();
            }
            while(c >= '0' && c <= '9'){
                ret = ret * 10 + c - '0';
                c = read();
            }
            return (neg) ? -ret : ret;
        }
        
        private long nextLong() throws IOException{
            long ret = 0;
            byte c = read();
            while(c <= ' '){
                c = read();
            }
            boolean neg = c == '-';
            if(neg){
                c = read();
            }
            while(c >= '0' && c <= '9'){
                ret = ret * 10 + c - '0';
                c = read();
            }
            return (neg) ? -ret : ret;
        }
        
        private double nextDouble() throws IOException{
            double ret = 0, div = 1;
            byte c = read();
            while(c <= ' '){
                c = read();
            }
            boolean neg = c == '-';
            if(neg){
                c = read();
            }
            while(c >= '0' && c <= '9'){
                ret = ret * 10 + (c - '0');
                c = read();
            }
            if(c == '.'){
                while((c = read()) >= '0' && c <= '9'){
                    ret += (c - '0') / (div *= 10);
                }
            }
            return (neg) ? -ret : ret;
        }
        
        private void fillBuffer() throws IOException{
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if(bytesRead == -1){
                buffer[0] = -1;
            }
        }
        
        private byte read() throws IOException{
            if(bufferPointer == bytesRead){
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }
        
        private void close() throws IOException{
            if(din != null){
                din.close();
            }
        }
        
    }
}