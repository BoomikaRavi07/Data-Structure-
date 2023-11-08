package Linear_Array;

import java.util.Scanner;

public class Cyclically_Rotate_Array {

	public static void main(String[] args) {
		/*Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = s.nextInt();
		int arr[]=new int[n];
        System.out.print("Enter the array elements one by one: ");
        for(int i=0;i<n;i++) 
        	arr[i]=s.nextInt();
      
        int x = arr[n-1];
        for(int i=n-1;i>0;i--) 
        	arr[i]=arr[i-1];
        arr[0]=x;
        System.out.println("Rotated array: ");
        for(int i=0;i<n;i++)
        	System.out.print(arr[i]+" ");*/// one rotation
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = s.nextInt();
		int arr[]=new int[n];
        System.out.print("Enter the array elements one by one: ");
        for(int i=0;i<n;i++) 
        	arr[i]=s.nextInt();
        System.out.println("Enter the number of rotation: ");
        int rot=s.nextInt();
        for(int r=0;r<rot;r++) {
        	int x = arr[n-1];
        	
        }
        System.out.println("Rotated array: ");
        for(int i=0;i<n;i++)
        	System.out.print(arr[i]+" ");
        s.close();
        


	}

}
