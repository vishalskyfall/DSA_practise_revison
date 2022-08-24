package Arrays;

public class Next_permutation {
	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 4, 2 };
		next_p(a);
		int i = 0;
		while (i < a.length) {
			System.out.print(a[i]);
			i++;
		}
	}

	static void next_p(int[] a) {

		if (a == null || a.length <= 1) {
			return;
		}
		int i = a.length - 2;
		while (i >= 0 && a[i] >= a[i + 1]) {
			System.out.println(i); // like jab tak a[i]<a[i+1] nai hoga tab tak chalega
			i--;
		}
		if (i >= 0) {
			int j = a.length - 1;
			while (a[j] <= a[i]) {
				j--;
			}
			System.out.println(i+" "+j);
			swap(a, i, j);
		}
		reverse(a,i+1,a.length-1);
	}

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	// imp for reverse and swap
	static void reverse(int[] a, int i, int j) {
		while (i < j) {
			swap(a, i++, j--); // for whole thing {5,3,2} i=5 j=2 so sab kuch lane k liye
		}
	}
}
