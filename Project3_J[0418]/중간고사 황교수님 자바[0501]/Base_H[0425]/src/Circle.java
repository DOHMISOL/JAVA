import java.util.Random;

public class Circle extends Base {
	private double half;
	
	
	Circle(){
		super(); //부모 생성자 호출 (Base의 this.name을 불러온다)
		this.name = "원";
	}
	
	@Override
	public void inputNumber() {
		Random random = new Random();
		int inputString = random.nextInt();
	}
	
	@Override
	public void calcSize() {
		this.size = this.half * this.half * Math.PI;
		//312.1221211
		//31212.21211
		//31212
		//312.12
		this.size = Math.round(this.size*100) / (double)100;
	}
	
	@Override
	protected void printSize() {
		super.printSize();
		System.out.println("나는 원이야");
	}
}
