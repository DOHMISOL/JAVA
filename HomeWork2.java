import java.util.Arrays;
import java.util.Random;

public class HomeWork2 {
	public static void main(String[] args) {
	//[문제1]
	Random random = new Random();
	int[] num = new int[30];
	
	System.out.println("0~100까지 임의의 수 30개의 정렬 전 값은");
	
	for(int i=0; i<num.length;i++) {
		num[i] = random.nextInt(101);
		//System.out.print(num[i]+" ");
	}	
	System.out.println(Arrays.toString(num));
	for(int i=0; i<num.length-1;i++) {
		int min = i;
		for(int j=i+1; j<num.length;j++) {
			if(num[j]<num[min]) {
				min = j;
			}
		}
		int temp = num[i];
		num[i] = num[min];
		num[min] = temp;
	}
	
	System.out.println("0~100까지 임의의 수 30개의 정렬 후 값은");
	System.out.println(Arrays.toString(num));
	System.out.println();
	}
}

