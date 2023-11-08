package Sorting;

import java.util.Scanner;

public class Bubble_Sort {
	
	static void bubble(int n,int arr[]) {
		int t;
		for(int step=0;step<n-1;step++) {
			for(int i=0;i<n-1;i++) {
				if(arr[i]>arr[i+1]) {
					t=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t;
				}
			}
		}
	}
	static void printArray(int n,int arr[]) {
		System.out.println("Array After Sorting: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
	
	}
        bubble(n,arr);               
        printArray(n,arr);
        s.close();
	}
}
