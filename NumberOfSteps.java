import java.util.Scanner;
 
public class NumberOfSteps {
    public static void main(String[] args){
       Equals e = new Equals();
 
       e.getData();
       System.out.println(e.equalA());
    }
}
class Equals{
    private int n;
    private int []a;
    private int []b;
    Scanner sc = new Scanner(System.in);
    void getData(){
        n = sc.nextInt();
        a=new int[n];
        b=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            b[i]=sc.nextInt();
    }
    int equalA(){
        int min=min();
        int step=0;
         while(check(min)) {
            for(int j=0;j<n;j++) {
                min=min();
                for (int i = 0; i < n; i++) {
                    if (a[i] != min) {
                        if (a[i] >= b[i]) {
                            a[i] = a[i] - b[i];
                            step++;
                        } 
                        else
                            return -1;
                    }
                }
            }
        }
        return step;
    }
    int min(){
        int min= Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<min)
                min=a[i];
        }
        return min;
    }
    boolean check(int min){
        for(int i=0;i<n;i++){
            if(a[i]!=min)
                return true;
        }
        return false;
    }
}