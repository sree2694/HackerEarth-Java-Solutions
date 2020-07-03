/* IMPORTANT: Multiple classes and nested static classes are supported */


import java.io.*;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    	static long gg[] = new long[2];
	static final long MD = 1000000007;
	static long power(int a, int b) {
		if (b == 0)
			return 1;
		long p = power(a, b / 2);
		p = p * p % MD;
		if (b % 2 == 1)
			p = p * a % MD;
		return p;
	}
	static long concat(long a, long n, long k) {
		long b = 0;
		while (k-- > 0)
			b = (b * n % MD + a) % MD;
		return b;
	}
	static long solve(int a, int b) {
		if (a % b == 0) {
			gg[0] = power(2, a - 1);
			gg[1] = power(2, b - 1);
		} else {
			solve(b, a % b);
			long tmp = gg[0];
			gg[0] = (concat(gg[0], power(2, b), a / b) * power(2, a % b) % MD + gg[1]) % MD;
			gg[1] = tmp;
		}
		return gg[0];
    }
    public static void main(String args[] ) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			pw.println(solve(x, y));
		}
		pw.close();
    }
}
