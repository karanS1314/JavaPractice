package revision;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("what are total no. of numbers?");
         int n=sc.nextInt();
         
         int a[]=new int[n];
         System.out.println("enter numbers!");
         for(int i=0;i<n;i++) {
              a[i]=sc.nextInt();
         }
         
         boolean sorted=true;
         
         
         for(int i=0;i<n-1;i++) {
        	 
        	 for(int j=0;j<n-1-i;j++) {
        		 if(a[j]>a[j+1]){
        			 int temp=a[j+1];
        			 a[j+1]=a[j];
        			 a[j]=temp;
        			 sorted=false;
        		   }
        		 
        		 }
        	 if(sorted) break;
        	
        	 }
//         for(int i=0;i<n;i++) {
//        	 System.out.print(a[i] + " ");
          
         for(int numbers:a) {
        	 System.out.print(numbers + " ");
         }
         }
         }
         


