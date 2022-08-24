package Sorting_Searching;

public class Count_inversion {
	public static void main(String[] args) {
		int[] a = new int[] { 3,1,2 };
		System.out.println(inversions(a));
	}
 // biju merge sort thi thay but no idea
	static int inversions(int[] a) {
		int count =0;
		int i=0;
		while(i<a.length-1) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					count++;
				}
			}
			i++;
		}
		return count;
	}
}
