
public class Homework_1 {
	//5! = 5*4*3*2*1 =120
	public static int factorial(int number) {
	    int sum =1;
	    for(int i = 2; i<=number; i++) {
	    	sum = sum * i;
	    }
	    return sum;
	}
	public static void main(String[] args) {
		System.out.println("5팩토리얼은" + factorial(5));
	}
}

