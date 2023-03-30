public class P12_1 {
	public static void main(String[] args) {

		
//		System.out.println();  //안에 있는것을 출력을 하고 줄바꿈
//		System.out.print();    //안에 있는것을 출력을 하고 줄바꿈안함
//		System.out.printf("%.2f",3.145235);   //앞에 있는 값을  출력함
		
		
		//		사용자로부터 숫자 한개 입력받는게 아니라 100까지 숫자 중에서 소수출력 
		for(int number =0; number<101; number++) {
				
			boolean isPrime = true;
			for(int i=0; i<number; i++) { 
				if(i < 2) { 
					continue; 
				}
				
				if(number % i == 0) { 
					isPrime = false;
					break; 
				}
			}
			if(isPrime) {  
				System.out.println(number);
		}
	}
	}
}
