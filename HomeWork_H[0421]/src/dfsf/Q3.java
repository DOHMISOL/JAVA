package dfsf;

import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {
		
		int n =2;
		int m =5;
		int [] answer = new int[2];
					
		for(int i=1; i<=n;i++) {
			if(n%i==0) {
				for(int j=0; j<=m;j++) {
					if(m%i==0) {
						answer[0] = i;; 
					}
				}
			}
		}
		answer[1] = n * m / answer[0];
		
		System.out.println(Arrays.toString(answer));
	}
}
