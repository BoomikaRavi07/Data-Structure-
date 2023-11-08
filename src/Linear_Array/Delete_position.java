package Linear_Array;

import java.util.Scanner;

public class Delete_position {
        
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = s.nextInt();
		int arr[]=new int[n];
        System.out.print("Enter the array elements one by one: ");
        for(int i=0;i<n;i++) 
        	arr[i]=s.nextInt();
            System.out.print("Enter the position you want to delete: ");
            int pos=s.nextInt();
            System.out.print("Enter the elements you want to insert: ");
            int elements=s.nextInt();
            arr[pos-1]=elements;//update
        	System.out.println("Array Travers: ");
        	for(int i=0;i<n;i++)
        		System.out.print(arr[i]+" ");
                s.close();
	}
}
