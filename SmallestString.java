import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       while(t>0)
    {
       int n=in.nextInt();
       String s=in.next();
       String str=s;
       char a[]=new char[s.length()];
       char ch=s.charAt(0);
       a=s.toCharArray();
       Arrays.sort(a);
       String x=new String(a);
       String res="";
       char c='a',c1='a';
       int flag=0,f=0;
       for(int i=0;i<n;i++)
       {
           if(s.charAt(i)==x.charAt(i))
             continue;
             
           else
           {
               
               c=x.charAt(i);
               flag=1;
               s=s.substring(0,i)+c+s.substring(i);
              // System.out.println(s);
              break;
           }  
 
       }
       if(flag==1)
       {
       for(int i=n;i>=0;i--)
       {
           if(s.charAt(i)==c)
           {
               s=s.substring(0,i)+s.substring(i+1);
               break;
           }
       }
       }
       
       str=str.substring(1);
      
       for(int i=1;i<str.length();i++)
       {
           if((int)s.charAt(i)>(int)ch)
           {
               str=str.substring(0,i-1)+ch+str.substring(i-1);
               break;
           }
       }
 
      if(str.compareTo(s)>0)
       System.out.println(s);
       else
       System.out.println(str);
 
 
 
 
        t--;
    }
 
    }
}