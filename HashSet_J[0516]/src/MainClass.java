import java.io.IOException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args){
		
		String[] s = {"a", "b", "c"};
		
//		for(int i =0;i<s.length;i++) {
//			System.out.println(s[i]);
//		}
//		int a;
//		for(String item : s) {  //포이치
//			System.out.println(item);
//			a = 30;
//		}
		int a;
		Test t1 = new Test() {
			@Override
			public void forEach(String[] s) {
				for(int i =0;i<s.length;i++) {
					System.out.println(s[i]);
				}
				a=30;
			}
		};
		t1.forEach(s); //오류가 생길수밖에 없다. 포이치를 쓰면 int a랑 a=30을 사용할 수 없다.
		
//		try {
//			Scanner scanner = new Scanner(System.in);
//			scanner.nextLine();
//			System.in.close();
//		}catch(Exception e) {
//		
//		HashSet<String> t = new HashSet<String>(); //중복값 제거하고 출력
//		t.add("1");
//		t.add("2");
//		t.add("3");
//		t.add("1");
//		t.add("1");
//		t.add("1");
//		t.add("1");
//		System.out.println(t);
//		
//		HashMap<String , String> q = new HashMap<String , String>(); // (키, value)
//		q.put("abc", "-----------");
//		q.put("tt", "*********************");
//		
//		System.out.println(q.get("abc"));
//		
//		HashMap<String , Student> w = new HashMap<String , Student>(); // (키, value)
//		w.put("abc", new Student("홍길동", 100));
//		w.put("tt", new Student("둘리", 20));
//		
//		System.out.println(w.get("abc"));
//		Student s1 = w.get("abc");
		
		
	}
}
