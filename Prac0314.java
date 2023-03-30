
public class Prac0314 {
	public static void main(String[] args) {
//		int sumNumber = 0;	
////		for(int i = 0; i < 100; i++) {
////			sumNumber = sumNumber + (i + 1);
//////		}
//		int sumNumber = 0;
//		for(int i=0; i<100; i++) {
//			sumNumber = sumNumber + (i+1);
//				1			0		0	1
//				3			1		1	2
//				6			3		2	3
//				10			6		3	4
//				15			10		4	5
////		for(1.초기값 ;4.조건; 3.증감or감소) {
////			   2.실행문장 
////		}
//		//1. 1부터 1000까지 합 출력
//		int sumNumber = 0;
//		for(int i=0; i<1000;i++) {
//			sumNumber = sumNumber + (i+1);
//											
//			if(i % 2 == 0) 	        		
//			System.out.println(sumNumber);
//		}
			
		//2. 1부터 100까지 중에서 짝수 합 출력
			int sum3 = 0;
			for(int i = 1; i<101; i++) {         //i =1,2,3,4,5,6,7,8~~~
				if(i % 2 == 0) {            //sumnum =0,2,2,6,6,12,
					sum3 = sum3 + i;
				}
			}
			System.out.println("짝수 합 : " + sum3);	
	}
}
