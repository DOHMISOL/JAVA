
public class Solution {
	
	public int solution(int n){
//		2. 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 아래 함수를 완성하세요. (단, 0<n<=1000)
//
//				class Solution {
//				    public int solution(int n) {
//				        int answer = 0;
//				        return answer;
//				    }
//				}
		int answer = 0;
		
		for(int i=0; i<99999;i++) {
			if(n>0 && n<=1000) {
				if(n%2 == 0) {
				answer = answer + n;
				n = n-2;
				}else {
					n = n-1;
				}
			}else {
				break;
			}
		}
		return(answer);
	}
}
