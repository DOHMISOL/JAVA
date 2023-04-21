package dfsf;

public class Solution {
	public String solution(int num) {

		String answer = "";
		if(num%2 ==0) {
			answer = "짝수";
		}else{
			answer = "홀수";
		}
		return answer;
		
	}
}
