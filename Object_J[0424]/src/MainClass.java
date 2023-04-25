import java.util.Random;

public class MainClass {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.doAction();
		t1.doAction(122);
		t1.doAction(122,26);
		t1.doAction("gildong");
		Object o1 = new Test();
		o1.toString();
		Random r = new Random();
		r.nextInt(100); //범위를 지정하는 것과 지정하지 않는것
	}
}
