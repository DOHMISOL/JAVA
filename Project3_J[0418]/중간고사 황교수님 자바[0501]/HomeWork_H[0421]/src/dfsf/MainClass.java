package dfsf;

import java.util.Arrays;
import java.util.Random;

public class MainClass {
	public static void main(String[] args) {
		int [] arr = {12, 43, 5, 4, 100, 88};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Integer[] arr2 = new Integer[arr.length];
		for(int i =0; i<arr.length;i++) {
			arr2[i] = arr[i];
		}
		
		
	}
}
