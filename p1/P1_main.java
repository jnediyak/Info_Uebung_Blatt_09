package p1;

import java.util.*;

public class P1_main {

	public static void main(String[] args) {
		int [] a = randomArray4(5);
		System.out.println(Arrays.toString(a));

	}

	public static int[] randomArray(int x) {
		int[] arr = new int[x];
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt();
		}

		return arr;
	}

	public static int[] randomArray2(int x) {
		int[] arr = new int[x];
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(0, x);
		}

		return arr;
	}

	public static int[] randomArray3() {
		int[] arr = new int[6];
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(55, 75 + 1);
		}

		return arr;
	}

	public static int[] randomArray4(int n) {
		int[] arr = new int[n + 1];
		Random r = new Random();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i] = r.nextInt(1, 50 + 1);
		}
		
		arr[arr.length-1] = sum/n;
		
		return arr;
	}

}
