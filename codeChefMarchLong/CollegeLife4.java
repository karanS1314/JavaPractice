package codeChefMarchLong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CollegeLife4 {

	static class SScanner {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
	}
	
//	static int minCost(int a , int b, int c , int n , int e , int h , int cost) {
//		if(n==0) {
//			return 0;
//		}
//		if(e<0 || h<0) {
//			return -1;
//		}
//		int x = minCost(a,b,c,n-1,e-2,h, cost+a);
//		int y = minCost(a,b,c,n-1,e-1,h-1, cost+b);
//		int z = minCost(a,b,c,n-1,e,h-3, cost+c);
//		
//		if(x!=-1 && y!=-1 && z!=-1) {
//			return Math.min(Math.min(c, b), b)
//		}
//		
//		
//		
//	}
	public static void main(String[] args) {
		try {
			SScanner sc = new SScanner ();
			Scanner ssc = new Scanner (System.in);
			int t = sc.nextInt();
			
			while(t-->0) {
				long n = ssc.nextLong();
				long e = ssc.nextLong();
				long h = ssc.nextLong();
				long a = ssc.nextLong();
				long b = ssc.nextLong();
				long c = ssc.nextLong();

				
				ArrayList<Long> sol = new ArrayList<>();
				ArrayList<Long> kvec = new ArrayList<>();
				
				for(long i=0;i<=n+1;i++) kvec.add(i);
				
				for(long m=0;m<=n;m++) {
					long idx1 =
				}
				
				int x = minCost(n , e , h , a , b , c);
	
				
			}
		}catch(Exception e) {
			return;
		}

	}

}
