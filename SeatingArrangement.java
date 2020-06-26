import java.util.*;
 
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class TestClass {
    public static void main(String args[] ) throws Exception {
 
        //Scanner
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int arr[]= new int[t];
        for(int i=0;i<t;i++)
            arr[i]=s.nextInt();
      
 
        int oppseat=0,rem=0,n=0,rownum=0,r=0;
        String seat="";
 
       for(int i=0;i<t;i++){
           n=arr[i];
             rownum=(n%6==0)?n/6-1:n/6;
            rem=n%6;
 
             r=rem-1;
 
            if(rownum%2==0){
                oppseat=(rem==0)?n+1:n+(13-rem*2);
 
            }
            else{
                oppseat= (rem==0)? n-11 : n-(2*r+1);
            }
 
            if(rem==0||rem==1)
                seat="WS";
            else if(rem==2||rem==5)
                seat="MS";
            else
                seat="AS";
 
            System.out.println(oppseat+" "+seat);
 
        }
       
 
    }
}
