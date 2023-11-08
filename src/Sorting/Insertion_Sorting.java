package Sorting;

import java.util.Scanner;

public class Insertion_Sorting {
		static void insertionSort(int n,int ar[]) {
			int t,key;
			for(int step=1;step<n;step++) {
				key=step;
				for(int i=step-1;i>=0;i--) {
					if(ar[i]>ar[key]) {
						t=ar[i];
						ar[i]=ar[key];
						ar[key]=t;
						key--;
					}
				}
			}
		}
		
		static void printArray(int n,int ar[]) {
		             System.out.print("After Sorting: ");
		             for(int i=0;i<n;i++) {
		            	 System.out.print(ar[i]+" ");
		             }
		}
		public static void main(String[] args) {
			Scanner s = new Scanner (System.in);
	    	System.out.print("Enter the number of array element: ");
	        int n=s.nextInt();
	        int ar[]=new int[n];
	        System.out.print("Enter the  array element: ");
	        for(int i=0;i<n;i++) {
	        	 ar[i]=s.nextInt();	
		}
	        insertionSort(n,ar);
	        printArray(n,ar);
	        s.close();
		}

	}