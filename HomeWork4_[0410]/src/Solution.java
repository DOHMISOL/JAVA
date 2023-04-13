
public class Solution {
	public double solution(double n, double x) {
		
		double answer = 0;
		if(x*x == n ) {
			answer = x+1;
		}else {
			answer = -1;
		}
		
		return answer;
	}
}
