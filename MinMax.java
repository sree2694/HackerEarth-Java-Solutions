import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class MinMax {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
 
		int num=Integer.parseInt(bi.readLine());
		String[] strNums;
 
		strNums = bi.readLine().split("\\s");
		int[] n = new int[strNums.length];
		for(int i=0; i<strNums.length; i++) {
			n[i] = Integer.parseInt(strNums[i]);
		}
		
		int temp;
		for(int i=0; i < num; i++){  
			for(int j=1; j < (num-i); j++){  
				if(n[j-1] > n[j]){  
					temp = n[j-1];  
					n[j-1] = n[j];  
					n[j] = temp;  
				}  
 
			}  
		}
		
		int start=n[0];
		for(int i=1;i<n.length;i++){
			if((start+1)==n[i]){
				start++;
				continue;
			}
			else if(start==n[i]){
				continue;
			}
			else{
				System.out.println("NO");
				System.exit(0);
			}
		}
		System.out.println("YES");
 
	}
 
}