
public class deBug_class2 {
	
	public static void main(String[] args) {
		
		// test배열 선언
		int[] newArray = {1,3,5,7,5,6,17,18,9,20};
		
		// 배열의 요소를 저장할 변수가 필요
		int sumation = 0;
		
		for (int i = 0; i<newArray.length; i++) {
			//전체 합 구하는 로직 Start
			sumation = sumation + newArray[i];
			//배열값 각각 출력
			System.out.println(newArray[i] + "합은" + sumation);
		}
	}
}
