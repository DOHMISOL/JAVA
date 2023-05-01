
public class Q1_1 {

	public static int array(int start, int n) {
		int [] arr = new int[n];
		int sum = 0;
		for(int i= 0; i<arr.length;i++) {
			arr[i] = start++; 
			sum += sum;
		}
		return sum;
	}
}
