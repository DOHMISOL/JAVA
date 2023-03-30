
public class debug_Class {
	public static void main(String[] args) {
	
		int[] testArray = {1,2,3,4,5,6,7,8,9,10};
		int sumation = 0;
		
		//for i in range(0, len(testArray));
		for(int i = 0; i < testArray.length; i++) {
			//로직 추가 : 각 원소 합
			sumation = sumation + testArray[i];
			System.out.println(testArray[i]);
		}
	}
}
