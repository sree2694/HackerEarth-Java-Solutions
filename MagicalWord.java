import java.util.*;
 
public class Testing {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            String s = in.next();
            Replace r = new Replace();
            char []str = r.replacement(s, n);
            System.out.println(str);
        }
    }
}
class Replace{
    char[] replacement(String s,int n){
        char[] str = s.toCharArray();
        for(int i = 0; i < n; i++){
            str[i]= (char) prime(str[i]);
        }
        return str;
    }
    int prime(int n) {
        for(int i=n,j=n;i>=0 || j<123;i--,j++){
            if ((i >= 65 && i <= 90 || i >= 97 && i <= 122)) {
                if (isPrime(i))
                    return i;
            }
            if (j >= 65 && j <= 90 || j >= 97 && j <= 122) {
                if (isPrime(j))
                    return j;
            }
        }
        return n;
    }
    boolean isPrime(int n) {
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}