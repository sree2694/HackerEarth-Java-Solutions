/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;
import java.io.*;
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
 
int a = Integer.parseInt(br.readLine());
 
for(int a0=0; a0<a; a0++) {
 
int n = Integer.parseInt(br.readLine());
 
StringTokenizer st = new StringTokenizer(br.readLine());
 
int[] arr = new int[7];
 
int c = 0;
 
for(int i=0; i<7; i++) {
 
arr[i] = Integer.parseInt(st.nextToken());
 
if(arr[i]>0) c+=arr[i];
 
}
 
int re = n%c;
 
int ans = -1;
 
if(re==0) {
 
for(int i=6; i>=0; i--) {
 
if(arr[i]>0) {
 
ans = i;
 
break;
 
}
 
}
 
}
 
else {
 
while(re>0) {
 
for(int i=0; i<7; i++) {
 
if(arr[i]==0) continue;
 
re -= arr[i];
 
if(re<=0) {
 
ans = i;
 
break;
 
}
 
}
 
}
 
}
 
if(ans == 0) {
 
System.out.println("MONDAY");
 
}
 
else if(ans == 1) {
 
System.out.println("TUESDAY");
 
}
 
else if(ans == 2) {
 
System.out.println("WEDNESDAY");
 
}
 
else if(ans == 3) {
 
System.out.println("THURSDAY");
 
}
 
else if(ans == 4) {
 
System.out.println("FRIDAY");
 
}
 
else if(ans == 5) {
 
System.out.println("SATURDAY");
 
}
 
else {
 
System.out.println("SUNDAY");
 
}
 
}
    }
}
