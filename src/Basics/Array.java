package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] arr=new int[5];
	System.out.println("Enter 5 values:");
	//Input From User
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	// Find max & min
	int max=arr[0],min=arr[0];
	for(int n:arr) {
		if(n>max)
			max=n;
		if(n<min)
			min=n;
	}
	System.out.println("Max="+max);
	System.out.println("Min="+min);
	
	//Searching(Linear Search)
	System.out.println("\n Enter Value to Search:");
	int key=sc.nextInt();
	boolean found=false;
	for(int i=0;i<arr.length;i++)
		if(arr[i]==key)
		{
			System.out.println(key + " is Found at Position" + (i+1));
			found=true;
			break;
		}
	//Sorting
	Arrays.sort(arr);
	System.out.println("\n Sorted Array:" +Arrays.toString(arr));
	//Copy Array
	int[] Copy=Arrays.copyOf(arr, arr.length);
	System.out.println("Copied Array:"+Arrays.toString(Copy));
	
	
	


	}

}
