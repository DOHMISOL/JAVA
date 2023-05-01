package dfsf;

import java.util.Arrays;

public class maxmin {

	public static int Solution(int n) {
		int answer = 0;
		
		for(int i=1; i<=n;i++) {
			if(n%i==0) {
				answer = answer + i;
			}
		}
		return answer;
		
	}

	public static void main(String[] args) {

		System.out.println(Solution(6));
	}

}
