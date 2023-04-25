
public class Test { // extends java.lang.Object
	public void doAction() {
		System.out.println("hello");
	}
	
	public void doAction(String name) {
		System.out.println("hello" + name);
	}
	
	public void doAction(int number) {
		System.out.println("hello" + number);
	}
	
	public void doAction(double number1) {   //int 랑 double 구분하는거는 안됌.
		System.out.println("hello" + number1);
	}
	
	
	public void doAction(int number, int number1) {
		System.out.println("hello" + number + " / " + number1);
	}
	
	@Override
	public String toString() {
		System.out.println("asdfasdfasdfasdgcgxc");
		return "asdfas";
	}
}
