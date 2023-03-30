
public class PMainClass {
	public static void main(String[] args) {
		boolean a;
		
		a = 3 == 3;
		a = 3 != 4;
		a = 3 > 4;
		a = 3 < 4;
		a = 3 >= 4;
		a = 3 <= 4;
		System.out.println(a);
		
		int x = 0;
		a = x < 10 || x % 2 == 0; // or
		a = true || (10<x);
		a = true || true; // 하나만 true여도 true
		a = true && true; // 둘다 true이면 true
		
		//비교연산자 : true or false
		//논리연산자 : 두개이상의 비교연산자를 쓰고 싶을때 and or
	}
}
