import java.util.*;
 
class testcase
{
public static void main(String...k)
{
Scanner sc=new Scanner(System.in);
char a[][];
a=new char[3][3];
String s[];
s=new String[3];
char c;
int i,j,cx=0,co=0,wx=0,wo=0;
for(i=0;i<3;i++)
{
	s[i]=sc.nextLine();
}
for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	{
     a[i][j]=s[i].charAt(j);
	 if(a[i][j]=='X')
		 cx++;
	 if(a[i][j]=='O')
		 co++;
    }
}
if(co+1==cx||(cx==0&&cx==co)||co==cx)
{
i=0;j=0;
if(a[i][j]=='X'&&a[i][j+1]=='X'&&a[i][j+2]=='X')
	wx=1;
if(a[i][j]=='X'&&a[i+1][j]=='X'&&a[i+2][j]=='X')
	wx=1;
if(a[i][j+2]=='X'&&a[i+1][j+2]=='X'&&a[i+2][j+2]=='X')
	wx=1;
if(a[i][j]=='X'&&a[i+1][j+1]=='X'&&a[i+2][j+2]=='X')
	wx=1;
if(a[i+2][j]=='X'&&a[i+2][j+1]=='X'&&a[i+2][j+2]=='X')
	wx=1;
if(a[i+1][j]=='X'&&a[i+1][j+1]=='X'&&a[i+1][j+2]=='X')
	wx=1;	
if(a[i][j+2]=='X'&&a[i+1][j+1]=='X'&&a[i+2][j]=='X')
	wx=1;
if(a[i][j+1]=='X'&&a[i+1][j+1]=='X'&&a[i+2][j+1]=='X')
	wx=1;
if(a[i][j+1]=='O'&&a[i+1][j+1]=='O'&&a[i+2][j+1]=='O')
	wo=1;
if(a[i][j+2]=='O'&&a[i+1][j+1]=='O'&&a[i+2][j]=='O')
	wo=1;
if(a[i][j]=='O'&&a[i][j+1]=='O'&&a[i][j+2]=='O')
	wo=1;
if(a[i][j]=='O'&&a[i+1][j]=='O'&&a[i+2][j]=='O')
	wo=1;
if(a[i][j+2]=='O'&&a[i+1][j+2]=='O'&&a[i+2][j+2]=='O')
	wo=1;
if(a[i][j]=='O'&&a[i+1][j+1]=='O'&&a[i+2][j+2]=='O')
	wo=1;
if(a[i+2][j]=='O'&&a[i+2][j+1]=='O'&&a[i+2][j+2]=='O')
	wo=1;
if(a[i+1][j]=='O'&&a[i+1][j+1]=='O'&&a[i+1][j+2]=='O')
	wo=1;	
if(co+1==cx||(cx==0&&cx==co)||co==cx)
{
if(wx==1&&cx==co+1)
	System.out.println("X won.");
else if(wx==1&&cx==co)
System.out.println("Wait, what?");	
else if(wo==1&&cx==co)
	System.out.println("O won.");
else if(wo==1&&cx==co+1)
System.out.println("Wait, what?");	
else if((wx==1||wo==1)&&cx==co)
	System.out.println("Wait, what?");
else
{    
	
      if(cx==co&&cx+co<9)
		System.out.println("X's turn.");
	else if(cx==co+1&&cx+co<9)
		System.out.println("O's turn.");
	 else if(cx+co==9)
	System.out.println("It's a draw.");
	else
    System.out.println("Wait, what?");
}
}
else
System.out.println("Wait, what?");
}
else
{
	System.out.println("Wait, what?");
}
 
 
 
}
}