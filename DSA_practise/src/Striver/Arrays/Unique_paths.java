package Striver.Arrays;

import java.util.HashMap;

public class Unique_paths {
	public static void main(String[] args) {
		System.out.println(unique_path(3, 2));
	}

	static HashMap<String, Integer> map = new HashMap<String, Integer>();

	private static int fun(int m, int n) {
		String key = m + "," + n;
		String reverseKey = n + "," + m;
		if (map.containsKey(key)) {
			return map.get(key);
		} else if (map.containsKey(reverseKey)) {
			return map.get(reverseKey);
		}

		if (m == 1 && n == 1) {
			return 1;
		}
		if (m == 0 || n == 0) {
			return 0;
		}
		map.put(key, fun(m - 1, n) + fun(m, n - 1));

		map.entrySet().forEach(e -> {
			System.out.println(e.getKey() + " " + e.getValue());
		}); // check this to debug
		return map.get(key);
	}

	public static int unique_path(int m, int n) {
		return fun(m, n);
	}
}
