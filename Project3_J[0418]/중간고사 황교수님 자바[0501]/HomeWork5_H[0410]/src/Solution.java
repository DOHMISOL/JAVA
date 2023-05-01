
public class Solution {
	
	public int solution(int num) {
		int answer = 0;
		int count = 0;
		
		while(count < 500) {
			if(num == 1) {
				break;
			}
			if(num%2 ==0) {
				num = num/2;
			}else{
				num = num*3+1;
			}
			count++;
			answer++;
		}
		if(count == 500) {
			answer = -1;
		}
		return answer;
	}
}
