import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class rabbit {
	 public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("src/inputRabbit.txt"));
		Scanner sc = new Scanner(System.in);
		 
		int rabbitNumber = sc.nextInt();
		System.out.println(rabbitNumber);
		
		int [][] arr = new int[20][20];
		int fox_x = sc.nextInt();
		int fox_y  = sc.nextInt();
		int [][] rabbit;
//		System.out.println(fox_x);
//		System.out.println(fox_y);
	
		for(int i=0; i<rabbitNumber;i++) {
			rabbit[][] = sc.nextInt();
		}
		
		
		
	}
}