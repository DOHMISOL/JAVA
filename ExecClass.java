import java.util.Random;

public class ExecClass {
	public static void main(String[] args) {
		
		Random r = new Random();
		int randomValue = r.nextInt(100);
		System.out.println("임의의 값은" + randomValue);
		
		int RandomValue = randomValue % 2;
		System.out.println(RandomValue);
		
		if(RandomValue == 0) {
			System.out.println("짝수");
		}else{
			System.out.println("홀수");
		}
	}
}