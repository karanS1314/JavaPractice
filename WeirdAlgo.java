

	import java.util.Scanner;

	public class WeirdAlgorithm {

		public static void main(String[] args) {
			
			
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			
			int temp=n;
			
			System.out.print(temp + " ");
				while(temp>1) {
					if(temp%2==0) {
					temp/=2;
					
					System.out.print(temp + " ");
					}
					else {
					temp=temp*3+1;
					System.out.print(temp + " ");
					}
				}
			}

		}

