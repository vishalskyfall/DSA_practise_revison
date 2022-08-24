package Sorting_Searching;

public class Ceiling_search {
	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 8, 10, 12, 19 };
		int x = 3;
		int index = ceilSearch(a, x);
		System.out.println(a[index] + " ceil_seach ");
	}
//linear search
	static int ceilSearch(int[] a, int x ){
		int low = 0;
		int high = a.length-1;
		
		if(x<=a[low])
			return low;
		for(int i = low; i<high;i++)
		{
			if(a[i]==x) {
				return i;
			}
			 /* if x lies between arr[i] and arr[i+1]
	        including arr[i+1], then return arr[i+1] */
			if(a[i]<x && a[i+1]>=x) {
				return i+1;
			}
		}
		
		return -1;
	}
}
