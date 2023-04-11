import java.util.Scanner;

public class Solution {
	public int[] solution(int[] num_list) {
//		3. 정수가 담긴 리스트 배열이 함수의 입력 파라미터로 전달된다. 전달받은 배열의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 함수를 완성하시오.
//
//				class Solution {
//				    public int[] solution(int[] num_list) {
//				        int[] answer = {};
//				        return answer;
//				    }
//				}
//
//				입력예시 [1,2,3,4,5]
//				출력예시 [2,3]
//		
		int answer[] = new int[2];
		for(int i=0; i<num_list.length;i++) {
			if(num_list[i]%2 == 1) {
				answer[1] = answer[1] + 1; //홀수의 값
			}else {
				answer[0] = answer[0] + 1; //짝수의 값
			}
		}
		return answer;
	}
}
