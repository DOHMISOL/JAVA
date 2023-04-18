import java.util.Scanner;

public class Triangle {
	String name = "삼각형";
	int width;
	int height;
	double size;
	Triangle(){
		this.name = "삼각형";
	}
	
	public void inputSize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Width : ");
		String inputString = scanner.nextLine();
		this.width = Integer.parseInt(inputString);
		System.out.println("Height : ");
		inputString = scanner.nextLine();
		this.height = Integer.parseInt(inputString);
	}
	public void calcSize() {
		this.size = this.width * this.height / (double)2;
	}
	public void printSize() {
		double size = this.width * this.height / (double)2;
		System.out.println(this.name + "size : " + this.size );
	}
	public void doAction() {
		this.inputSize();
		this.calcSize();
		this.printSize();
	}
}
