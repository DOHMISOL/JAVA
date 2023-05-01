import java.util.Arrays;

public class Q4 {
	class Solution{
	   public int[] solution(int[] array, int n) {
	        int[] answer  = new int[array.length];
	        for(int i=0; i<answer.length;i++) {
	        	if(n>=1 && n<=9) {
	        		answer = Arrays.toString(answer[i]*n);
	        	}
	        }
	        return answer;
	    }
	}
}
