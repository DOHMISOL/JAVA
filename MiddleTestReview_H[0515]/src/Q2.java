import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {
	public static void main(String[] args) throws IOException {
		//number combination
		System.setIn(new FileInputStream("src/input2.txt"));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String lengs = br.readLine();
		int lenth = Integer.parseInt(lengs);

		for(int i=0; i<lenth;i++) {
			String inputval = br.readLine();
			String[] strList = inputval.split("");
			int count = 0;
			for(int j=0;j<strList.length;j++) {
				if(strList[j].equals("A")) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
