
public class Solution {
	//히샤드
		//양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
		//예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
		//자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
		public boolean solution1(int x) {
			
			boolean answer = false;
			String num = Integer.toString(x);
			//숫자를 문자열로 변환
			String[] total = num.split("");
			//숫자를 문자로 형변환("1","8")
			
			int sum = 0;
			for(int i=0; i<total.length;i++) {
				sum = sum + Integer.parseInt(total[i]);
			}
			if(x%sum ==0) {
				answer = true;
				System.out.println("하샤드의 숫자입니다");
			}else {
				System.out.println("하샤드의 숫자가 아닙니다.");
			}
			return answer;
		}
}
