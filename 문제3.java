
public class 문제3 {
	public static void main(String[] args) {
		/*
		for(int i=0; i<4;i++) {
			for(int a=0; a<i+1;a++) {
//			i=1for(int a=0; a<2;a++)
//			i=2for(int a=0; a<3;a++)
//			i=3for(int a=0; a<4;a++)
			System.out.print("*");
	}
		System.out.println();
	}
	*/
		for(int i=0; i<4;i++) {
			for(int a=4;a>i;a--) {
//			1for(int a=0;a<3;a++)
//			2for(int a=0;a<2;a++)
//			3for(int a=0;a<1;a++)
			System.out.print("*");
			}
			System.out.println();
		}
}
}