import java.util.Arrays;
import java.util.Random;

public class Sort {
	public void doSort() {
		int[] numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		//numbers 자체는 주소이고 numbers[i] 변수이다.
		//System.out.println(numbers); 틀린표현이다.
		
		//random 세팅
		Random random = new Random();
		for(int i=0; i<numbers.length;i++) {
			numbers[i] = (int)Math.floor(Math.random()*100) +1; 
			//numbers[i] = random.nextInt(100)+1;
			//실제로 랜덤은 정수가 아닌 소수로 찍힘(0.32432434)0~1미만 곱하는 숫자는 정수로 만들기 위한 입력.
			//Math.floor :내림처리 / Math.random :랜덤발생
		}
		
		//System.out.println(Arrays.toString(numbers));
		
		//sort(selection sort)
		
		for(int i=0; i<numbers.length-1;i++) {
			for(int j=i+1; i<numbers.length; j++) {
				if(numbers[i] > numbers[j]) {
					int tmp =numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbers));
	}
}
