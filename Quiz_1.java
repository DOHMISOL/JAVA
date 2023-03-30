
public class Quiz_1 {
	public static void main(String[] args) {
		//아래 데이터를 확인하여, 국/영/수의 총점을 구하여 1등 부터 5등 까지 내림차순으로 성적을 출력하는 로직을 제출하세요.
		String name[] = {"A","B","C","D","E"};
		int kor[] = {50,60,70,80,90};
		int eng[] = {10,70,80,90,100};
		int math[] = {95,80,90,85,80};
		int total[] = new int[name.length];
		//STEP 1. 총점구하기
		for(int i=0; i<5;i++) {
			int sum = 0;
			sum = kor[i] + eng[i]+ math[i];
			//System.out.print(sum+ " ");
			total[i] = sum;
		}
		
		
//		STEP 2. 내림정렬
		for(int i=0;i<total.length-1;i++) {
			int maxValue=i;
			for(int j=i+1; j<total.length;j++) {
				if(total[i]>total[j]) {
					maxValue = j;
				}
			}
			int temp = total[i];
			total[i] = total[maxValue];
			total[maxValue] = temp;
		}
		System.out.println();
		//System.out.println(total[3]);
		for(int i=name.length-1; i>=0; i--) {
			System.out.println(total[i] + " ");
		}
	}
}



