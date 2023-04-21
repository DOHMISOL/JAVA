package dfsf;

import java.util.Arrays;

public class maxmin {

	public static int Solution(int a) {
		int answer = 0;
		
		for(int i=1; i<=a;i++) {
			if(a%i==0) {
				answer = answer + i;
			}
		}
		return answer;
		
	}

	public static void main(String[] args) {

		System.out.println(Solution(6));
	}

}
