
public class J3_Loop3_IF {
	public static void main(String[] args) {
		
		int a = 10; // 지역변수 local variable( 위의{}까지만 영향이 미친다)
		
		//if 만약에...
		if( a == 10) {  // 만약에 맞다면
			System.out.println("a == 10");
		}
		
		//if ~ else
		if( a > 10) {
			System.out.println("a>10");
		}else {
			System.out.println("a<=10");
		}
		
		//if ~ else if ~ else
		if(a < 5) {
			System.out.println("a < 5");
		} else if(a == 5){
			System.out.println("a == 5");
		} else if(a == 6){
			System.out.println("a == 6");
		} else if(a == 7){
		    System.out.println("a == 7");
		} else if(a == 8){
			System.out.println("a == 8");
		} else {
		    System.out.println("else");
		} 
		
		//[QUIZ] if 조건문을 사용하여 2*1 ~2*9까지만 출력해보세요.
		for(int i=1; i<100; i++) {
			if(i <= 9)
				System.out.println("2 * "+ i + "=" +(2*i));
		}
	}
}