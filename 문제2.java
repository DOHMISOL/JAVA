import java.util.Arrays;

public class 문제2 {
	public static void main(String[] args) {
		//2. a의 배열 {1,2,3,4,5}, String str = Arrays.toString(a); str에 조작을가합니다.
		//[],쉼표제거, 공백제거 replace, split, trim 1 2 3 4 5
		
		int a[] = {1,2,3,4,5};
		String ss = Arrays.toString(a);
		System.out.println(ss);
		System.out.println(ss.getClass().getName());
		
//		ss = ss.replace("[","");
//		ss = ss.replace("]","");
//		ss = ss.replace(",","");
//		ss = ss.replace(" ","\n");
//		System.out.println(ss);
		
	}
}
