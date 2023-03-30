import java.util.Random;

public class P1 {
	public P1() {
		int [][]numbers = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
		
		Random random = new Random();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				numbers[i][j] = random.nextInt(100);
			}
		}
//		int total = 0;
		//numbers[0][3] = numbers[0][0] + numbers[0][1] +numbers[0][2]
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				numbers[i][3] = numbers[i][3] + numbers[i][j];
				numbers[3][j] = numbers[3][j] + numbers[i][j];
				numbers[3][3] = numbers[3][3] + numbers[i][j];
			}
		}
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[0].length; j++) {
				System.out.printf("%4d",numbers[i][j]);
				//출력은 하는데 모든 숫자가 4칸에 맞춰서 넣어줌
			}
			System.out.println();
		}
	}
}
