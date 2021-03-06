         	  import java.io.*;
              import java.math.*;
              import java.security.Key;
              import java.security.KeyStore.Entry;
              import java.util.*;
 
              class TestClass
                 
        		{
                	
                	private InputStream is;
                	private  PrintWriter out;
                	
                	               	
        			void solve() throws IOException
                	{ 
        				int t=ni();
        				
        				while(t-->0)
        				{
        					int c[]=new int[26];
        					
        					int n=ni();
        					int m=ni();
        					
        					for(int i=0;i<n;i++)
        					{
        						for(int j=0;j<m;j++)
        						{
        							c[nc()%97]++;
        						}
        					}
        					
        					int rf=(n/2)*(m/2);
        					
        					int four=0;
        					
        					for(int i=0;i<26;i++)
        					{
        						four+=c[i]/4;
        						
        						c[i]%=4;
        					}
        					
        					if(rf>four)
        					{
        						out.println("NO");
        					}
        					else
        					{
        						four-=rf;
        						
        						int rp=0;
        						
        						if(n%2==1)
        							rp+=m/2;
        						
        						if(m%2==1)
        							rp+=n/2;
        						
        						int pair=four*2;
        						
        						for(int i=0;i<26;i++)
        						{
        							pair+=c[i]/2;
        							
        							c[i]%=2;
        						}
        						
        						if(rp>pair)
        							out.println("NO");
        						else
        						{
        							pair-=rp;
        							
        							int one=pair*2;
        							
        							for(int i=0;i<26;i++)
        							{
        								one+=c[i];
        							}
        							
        							int ro=0;
        							
        							if(n%2==1&&m%2==1)
        								ro=1;
        							
        							if(one>=ro)
        							out.println("YES");
        							else
        								out.println("NO");	
        							
        						}
        						
        					}
        				
        						
        					
        				}
                	
                	}
        			
           			void run() throws Exception {
                    		is = System.in;
                    		out = new PrintWriter(System.out);
                    		solve();
                    		out.flush();
                    	
                	}
                     
                    public static void main(String[] args) throws Exception {
                    		new Thread(null, new Runnable() {
                    			public void run() {
                    				try {
                    					new TestClass().run();
                    				} catch (Exception e) {
                    					e.printStackTrace();
                    				}
                    			}
                    		}, "1", 1 << 26).start();
        	}
         
        	// To Get Input
        	// Some Buffer Methods
        	private byte[] inbuf = new byte[1024];
        	public int lenbuf = 0, ptrbuf = 0;
        	
        	private int readByte() {
        		if (lenbuf == -1)
        			throw new InputMismatchException();
        		if (ptrbuf >= lenbuf) {
        			ptrbuf = 0;
        			try {
        				lenbuf = is.read(inbuf);
        			} catch (IOException e) {
        				throw new InputMismatchException();
        			}
        			if (lenbuf <= 0)
        				return -1;
        		}
        		return inbuf[ptrbuf++];
        	}
         
        	private boolean isSpaceChar(int c) {
        		return !(c >= 33 && c <= 126);
        	}
         
        	private int skip() {
        		int b;
        		while ((b = readByte()) != -1 && isSpaceChar(b))
        			;
        		return b;
        	}
         
        	private double nd() {
        		return Double.parseDouble(ns());
        	}
         
        	private char nc() {
        		return (char) skip();
        	}
         
        	private String ns() {
        		int b = skip();
        		StringBuilder sb = new StringBuilder();
        		while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != '
        									// ')
        			sb.appendCodePoint(b);
        			b = readByte();
        		}
        		return sb.toString();
        	}
         
        	private char[] ns(int n) {
        		char[] buf = new char[n];
        		int b = skip(), p = 0;
        		while (p < n && !(isSpaceChar(b))) {
        			buf[p++] = (char) b;
        			b = readByte();
        		}
        		return n == p ? buf : Arrays.copyOf(buf, p);
        	}
         
         
         
        	private int[] na(int n) {
        		int[] a = new int[n];
        		
        		for (int i = 0; i < n; i++)
        			{
        			  a[i] = ni();
        			  
        			  
        			}
        		
        		
        		return a;
        	}
         
        	private void pa(int[] a) {
        		int i=0;
        		
        	   while(i<a.length)
        	   {
        		   System.out.print(a[i++]+" ");
        	   }
        		
        		
        		
        		
        	}
        	
        	
        	private int ni() {
        		int num = 0, b;
        		boolean minus = false;
        		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
        			;
        		if (b == '-') {
        			minus = true;
        			b = readByte();
        		}
         
        		while (true) {
        			if (b >= '0' && b <= '9') {
        				num = num * 10 + (b - '0');
        			} else {
        				return minus ? -num : num;
        			}
        			b = readByte();
        		}
        	}
         
        	private long nl() {
        		long num = 0;
        		int b;
        		boolean minus = false;
        		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
        			;
        		if (b == '-') {
        			minus = true;
        			b = readByte();
        		}
         
        		while (true) {
        			if (b >= '0' && b <= '9') {
        				num = num * 10 + (b - '0');
            			} else {
            				return minus ? -num : num;
            			}
            			b = readByte();
            		}
            	}
            	
       	 static class Pair implements Comparable<Pair>{
    		 
    	       long x,y,k;
    	       int i,dir;
    	       int val;
    		Pair (long x,long y){
    			this.x=x;
    			this.y=y;
    		}   
    		public int compareTo(Pair o) {
    			return  0;
    		}
    	 
    		public String toString(){
    			return x+" "+y+" "+k+" "+i;}
    		public boolean equals(Object o) {
    			if (o instanceof Pair) {
    				Pair p = (Pair)o;
    				return p.x == x && p.y == y;
    			}
    			return false;
    		}
    		public int hashCode() {
    			return new Long(x).hashCode()*31 + new Long(y).hashCode() ;
    		}
    	} 
        		
        		
        		
        		
        		}