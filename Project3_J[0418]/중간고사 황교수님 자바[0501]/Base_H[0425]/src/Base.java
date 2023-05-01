
public class Base {
	protected String name;
	protected double size;
	
	Base(){
		this.name = "도형";
	}
	
	protected abstract void inputNumber(); //추상화 메소드
	
	protected abstract void calcSize(); //추상화 메소드
	
	protected void printSize() {
		System.out.println(this.name + size + this.size);
	}
	
	public void doAction() {
		this.inputNumber();
		this.calcSize();
		this.printSize();
	}
}
