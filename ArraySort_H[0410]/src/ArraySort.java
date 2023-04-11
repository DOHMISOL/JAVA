import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraySort {
	public static void main(String[] args) {
		int [] arr = {12, 43, 5, 4, 100, 88};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		Integer[] arr2 = new Integer[arr.length];
		for(int i=0; i<arr.length;i++) {
			arr2[i] = arr[i];
		}
		Arrays.sort(arr2, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr2));
		
		myCompareClass mcc = new myCompareClass();
		Arrays.sort(arr2, mcc );
		System.out.println(Arrays.toString(arr2));
		
		//Sort 구현 - 2번유형
		Comparator<Integer> myCompare = new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return b-a;
			}
		};
		
		Arrays.sort(arr2, myCompare);
		System.out.println(Arrays.toString(arr2));
		
		//Sort 구현 - 3번유형
		Arrays.sort(arr2, new Comparator<Integer>() {
			public int compare(Ingeter a, Integer b) {
				return a - b;
			}
		});
		System.out.println(Arrays.toString(arr2));
		
		//Sort 구현 - 4번유형
		
		Arrays.sort(arr2,(i1,i2)->{
			return i2 - i1;
		});
		System.out.println(Arrays.toString(arr2));
	
		
		
	}
} //end of arraySort







//<T> : Generic
class myCompareClass implements Comparator<Integer>{
	public int compare(Integer a, Integer b) {
		return b - a;
	}
}
