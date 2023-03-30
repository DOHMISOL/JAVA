
public class Homework_3 {
	//피보나치 수열의 10번째 해당하는 값
	public static void main(String[] args) {
		int result = fibonacci(10);
		System.out.println(result);
	}
	
	public static int fibonacci(int num) {
		int result =0;
		
		if(num == 1) {
			result = 1;
		}else if(num == 2) {
			result = 1;
		}else if(num >=3) {
			result = fibonacci(num-2) + fibonacci(num-1);
		}
		return result;
	}
}
