import java.util.Scanner;
 
public class CountDivisors {
static int count(int l,int r,int k) {
    int count=0;
    for(int i=l;i<=r;i++) {
        if(i%k==0) {
            count++;
        }
    }
    return count;
}
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(count(l,r,k));
    }
 
}
