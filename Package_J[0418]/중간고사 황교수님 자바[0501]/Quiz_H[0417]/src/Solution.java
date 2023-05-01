import java.util.Arrays;

public class Solution {
	public int solution(int[]array, int n) {
		int answer = 0;
		int [] array1 = Arrays.copyOf(array, array.length);
		for(int i = 0; i<array1.length;i++) {
			for(int j=i+1; j<array1.length-1;j++) {
				if(array1[i] == n && array1[j] ==n) {
					answer++;
					i--;
					break;
				}
			}
		}
	}
	return answer
}
