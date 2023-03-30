
public class J2_LOOP_LOOP {
	
	public static void main(String[] args) {
//		for(int i=0; i<5; i++) {
//			System.out.println("i : " + i );
//			
//			for(int j=0; j<5; j++) {
//				System.out.println("    j : " + j);
//			}
//		for(int i=1; i<10;i++) {
//			System.out.println("구구단 " + i + "단 입니다.");
//		}
//			for(int j=1;j<10;j++){			
//				System.out.println(i + "*" + j + " = " + (i*j));
//		}
//		아래의 모양을 이중반복문을 사용하여 출력하세요.
//		
//		*  
//		**
//		***
//		**** 
//		
//		아래의 모양을 이중반복문을 사용하여 출력하세요.
//		****
//		***
//		**
//		*
		//i = 0 -> j가 1번만 돌수있게
		
		for(int i=0; i<4; i++){
//			System.out.print("*");
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
	}
		
}
}