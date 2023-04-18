import java.util.Scanner;

public class Trapezoid extends Triangle{
	int base;
	
	Trapezoid(){
		this.name = "사다리꼴"; //생성자
	}
	public void calcSize() {
		this.size = (this.width + this.base) * this.height /(double)2;
	}
	public void inputSize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Width : ");
		String inputString1 = scanner.nextLine();
		this.width = Integer.parseInt(inputString1);
		System.out.println("base : ");
		String inputString2 = scanner.nextLine();
		this.base = Integer.parseInt(inputString2);
		System.out.println("Height : ");
		String inputString3 = scanner.nextLine();
		this.height = Integer.parseInt(inputString3);
	}
}
