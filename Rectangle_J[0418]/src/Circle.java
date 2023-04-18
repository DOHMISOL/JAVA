
public class Circle extends Triangle {
	private static double PI = 3.14;
	
	Circle(){
		this.name = "원"; //생성자
	}
	public void calcSize() {
		this.size = this.width * this.height * PI;
	}
	//원의 넓이는 사각형의 가로*세로와 같다.
}
