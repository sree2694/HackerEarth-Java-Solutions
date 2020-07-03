/* IMPORTANT: Multiple classes and nested static classes are supported */


//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
      Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        for(int c=1 ; c<=tc ; c++){
        int n = s.nextInt();
        findfactor(n);
        }
    }

     public static void findfactor(int j){
        if(j%2==1)
                System.out.println(-1);
            else if(j%4==0) {
            	long p=j/4;
                System.out.println(p*p*p*p);
            }else if(j%6==0) {
            	long p=j/6;
                System.out.println(p*p*p*p*4);
            }else if(j%10==0) {
            	long p=j/10;
            	System.out.println(p*p*p*p*20);
            }else
            	System.out.println(-1);
        
    }
}
