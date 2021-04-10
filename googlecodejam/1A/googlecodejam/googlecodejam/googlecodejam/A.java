package googlecodejam;

//   * * * fuck you * * *   //
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 

public class A {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = sc.readArray(n);
            int count=0;
            for(int i=0;i<n-1;i++){
                int a1= a[i];
                int a2= a[i+1];
                if(a1<a2){
                    continue;
                }
                else {
                    while(a1>=a2){
                        a2*=10;
                        for(int j=1;j<=9;j++){
                            a2+=j;
                            if(a2>a1) break;
                        }
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
	}






 
	// Use this instead of Arrays.sort() on an array of ints. Arrays.sort() is n^2
	// worst case since it uses a version of quicksort. Although this would never
	// actually show up in the real world, in codeforces, people can hack, so
	// this is needed.
	static void ruffleSort(int[] a) {
		//ruffle
		int n=a.length;
		Random r=new Random();
		for (int i=0; i<a.length; i++) {
			int oi=r.nextInt(n), temp=a[i];
			a[i]=a[oi];
			a[oi]=temp;
		}
		
		//then sort
		Arrays.sort(a);
	}
	
	// Use this to input code since it is faster than a Scanner
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
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

		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		String str = "";
 
		String nextLine() {
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
 
		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		long[] readLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
    // use this to find the index of any element in the array +1 /// 
	// returns an array that corresponds to the index of the i+1th in the array a[]
	// runs only for array containing different values enclosed btw 0 to n-1
	static int[] indexOf(int[] a) {
		int[] toRet=new int[a.length];
		for (int i=0; i<a.length; i++) {
			toRet[a[i]]=i+1;
		}
		return toRet;
	}

	static int gcd(int a, int b) {
		if (b==0) return a;
		return gcd(b, a%b);
	}

	//generates all the prime numbers upto n
	static void sieveOfEratosthenes(int n , ArrayList<Integer> al)
    {

        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
 
        for (int p = 2; p * p <= n; p++) 
        {

            if (prime[p] == true) 
            {

                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        for (int i = 2; i <= n; i++)
        {
            if (prime[i] == true)
                al.get(i);
        }
    }
	static final int mod=100000000 + 7;
	//fastPow
	static long fastPow(long base, long exp) {
		if (exp==0) return 1;
		long half=fastPow(base, exp/2);
		if (exp%2==0) return mul(half, half);
		return mul(half, mul(half, base));
	}

	//multiply two long numbers
	static long mul(long a, long b) {
		return a*b%mod;
	}

	//swap in any kind of generic array
	static <E> void swap(int i  , int j , E []a){
		E x = a[i];
		E y = a[j];
		a[i]=x;
		a[j]=y;
	}

	// write 

}

