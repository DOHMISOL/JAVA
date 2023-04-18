import java.util.Scanner;

public class Rectangle extends Triangle{
	Rectangle(){
		this.name = "사각형"; //생성자
	}
	@Override  //재정의된 method에만 사용한다.
	public void calcSize() {
		this.size = this.width * this.height;
	}
}

