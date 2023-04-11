import java.util.Scanner;

public class Solution {
	public String solution(int num) {
//		5. 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
//
//		class Solution {
//		    public String solution(int num) {
//		        String answer = "";
//		        return answer;
//		    }
//		}
//
//		입력예시 : 3
//		출력예시 : "Odd"
		Scanner scanner = new Scanner(System.in);
		String answer  = "";
		
		if(num%2 == 0) {
			answer = "Even";
		}else {
			answer = "Odd";
		}
		
		return answer;
	}
}
