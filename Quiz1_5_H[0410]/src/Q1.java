import java.util.Arrays;

public class Q1 {
	public static void main(String[] args) {
		
		int [] arr = new int[5];
		int sum = 0;
		for(int i=0; i<arr.length;i++) {
			sum = sum + i+1;
		}
		System.out.println(sum/arr.length);
	}
}
